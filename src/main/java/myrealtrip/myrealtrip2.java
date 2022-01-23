package myrealtrip;

import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Stack {
    boolean isEmpty();
    boolean isFull();
    void push(String item);
    String pop();
    String peek();
    void clear();
}

public class myrealtrip2 implements Stack {
    // 프로그래밍 언어 제공 라이브러리 사용 금지
    // 첫줄 입력 : 데이터 입력 횟수
    // 0 또는 1 이외의 것 입력 시 프로그램 종료
    // stack 이 비어 있는 상태에서 pop 하는 경우, 'underflow' 출력
    // * push (0) 인 경우에만 자료의 내용을 다음 줄에 입력
    // 0 : push, 1 : pop
    // 데이터 입력 종료 후 스택 상태 (bottom -> top)
    private int top;
    private int stackSize;
    private String stackArr[];

    // 스택을 생성하는 생성자
    public myrealtrip2(int stackSize) {
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
        return (top == this.stackSize - 1); // top 이 0부터 쌓이기 때문에 stackSize - 1
    }

    // 스택에 데이터를 추가
    public void push(String item) {
        if(isFull()) {
            System.out.println("overflow");
        } else {
            stackArr[++top] = item;    // 다음 스택 포인터가 가리키는 인덱스에 데이터 추가
            System.out.println("Inserted Item : " + item);
        }
    }

    // TODO : 빈 상태에서 pop 할 경우... underflow 한번에 출력
    // 스택의 최상위(마지막) 데이터 추출 후 삭제
    public String pop() {
        if(isEmpty()) {
            // System.out.println("underflow");
            stackArr[++top] = "underflow";
            return null;
        } else {
            // System.out.println("Deleted Item : " + stackArr[top]);
            return stackArr[top--];
            // stackArr[top--];
        }
    }

    // 스택의 최상위(마지막) 데이터 추출
    public String peek() {
        if(isEmpty()) {
            System.out.println("Peeking fail! Stack is empty!");
            return null;
        } else {
            System.out.println("Peeked Item : " + stackArr[top]);
            return stackArr[top];
        }
    }

    // 스택 초기화
    public void clear() {
        if(isEmpty()) {
            System.out.println("Stack is already empty!");
        } else {
            top = -1;    // 스택 포인터 초기화
            stackArr = new String[this.stackSize];    // 새로운 스택 배열 생성
            System.out.println("Stack is clear!");
        }
    }

    // 스택에 저장된 모든 데이터를 출력
    public void printStack() {
        if(isEmpty()) {
            System.out.println("stack is empty");
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
            System.out.println("[input - stackSize] : " + stackSize); // todo - del

            if (stackSize > 10) {
                System.out.println("스택 사이즈는 최대 10개까지 설정 가능합니다.");
            } else {
                myrealtrip2 arrStack = new myrealtrip2(stackSize);

                for (int i=0; i<stackSize; i++) {
                    String input = br.readLine();

                    if (!(input.equals("0") || input.equals("1"))) {
                        System.out.println("[ 입력불가 문자 ]"); // todo - del
                        break;
                    } else if (input.equals("0")) {
                        System.out.println("push ! "); // todo - del
                        String item = br.readLine();
                        arrStack.push(item);
                    } else if (input.equals("1")) {
                        System.out.println("pop ! "); // todo - del
                        arrStack.pop();
                    }
                }
                arrStack.printStack();
            }
        } catch (NumberFormatException e) {
            System.out.println("스택 사이즈 입력값은 숫자만 가능합니다.");
        }
    }
}
