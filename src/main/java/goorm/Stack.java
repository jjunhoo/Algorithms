package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 스택
// https://level.goorm.io/exam/43218/%EC%8A%A4%ED%83%9D-stack/quiz/1
interface StackInterface {
    boolean isEmpty();
    boolean isFull();
    void push(String item);
    String pop();
    String peek();
    void clear();
}

public class Stack implements StackInterface {
    private int top;
    private int stackSize;
    private String stackArr[];
    private int underflow;
    private int overflow;

    // 스택을 생성하는 생성자
    public Stack(int stackSize) {
        top = -1;    // 스택 포인터 초기화
        this.stackSize = stackSize;    // 스택 사이즈 설정
        stackArr = new String[this.stackSize];    // 스택 배열 생성
    }

    // 스택이 비어있는 상태인지 확인
    public boolean isEmpty() {
        // 스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true 아닌 경우 false를 return
        return (top == -1);
    }

    // 스택이 가득찬 상태인지 확인
    public boolean isFull() {
        // 스택 포인터가 스택의 마지막 인덱스와 동일한 경우 true 아닌 경우 false를 return
        return (top == this.stackSize - 1) && (top > 9); // top 이 0부터 쌓이기 때문에 stackSize - 1
    }

    // 스택에 데이터를 추가
    public void push(String item) {
        if(isFull()) {
            overflow++;
        } else {
            stackArr[++top] = item;    // 다음 스택 포인터가 가리키는 인덱스에 데이터 추가
        }
    }

    // 스택의 최상위(마지막) 데이터 추출 후 삭제
    public String pop() {
        if(isEmpty()) {
            underflow++;
            return null;
        } else {
            return stackArr[top--];
        }
    }

    // 스택의 최상위(마지막) 데이터 추출
    public String peek() {
        if(isEmpty()) {
            return null;
        } else {
            return stackArr[top];
        }
    }

    // 스택 초기화
    public void clear() {
        if(isEmpty()) {
            // System.out.println("Stack is already empty!");
        } else {
            top = -1;    // 스택 포인터 초기화
            stackArr = new String[this.stackSize];    // 새로운 스택 배열 생성
            // System.out.println("Stack is clear!");
        }
    }

    // 스택에 저장된 모든 데이터를 출력
    private void printStack() {
        if(isEmpty()) {
            for (int i=0; i<underflow; i++) {
                System.out.println("underflow");
            }
        } else if (overflow > 0) {
            for (int i=0; i<overflow; i++) {
                System.out.println("overflow");
            }
        } else {
            for(int i=0; i<=top; i++) {
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // 스택 사이즈
            int stackSize = Integer.parseInt(br.readLine());

            Stack arrStack = new Stack(stackSize);

            for (int i=0; i<stackSize; i++) {
                String input = br.readLine();

                if (!(input.equals("0") || input.equals("1"))) { // 입력 문자 validation
                    break;
                } else if (input.equals("0")) { // 입력 문자가 '0'인 경우, push
                    String item = br.readLine();
                    if (i > 9) {
                        System.out.println("overflow");
                        break;
                    }
                    arrStack.push(item);
                } else if (input.equals("1")) { // 입력 문자가 '1'인 경우, pop
                    arrStack.pop();
                }
            }
            arrStack.printStack();

        } catch (NumberFormatException e) {
            System.out.println("스택 사이즈 입력값은 숫자만 가능합니다.");
        }
    }
}
