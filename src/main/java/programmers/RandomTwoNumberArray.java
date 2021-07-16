package programmers;

import java.util.Arrays;
import java.util.TreeSet;

// 두 개 뽑아서 더하기
// https://programmers.co.kr/learn/courses/30/lessons/68644
public class RandomTwoNumberArray {
    // 2개의 인덱스 요소로 만들 수 있는 모든 값
    public static int[] solution(int[] numbers) {
        TreeSet<Integer> treeSet = new TreeSet();

        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j< numbers.length; j++) {
                treeSet.add(numbers[i] + numbers[j]);
            }
        }
        return Arrays.stream(treeSet.stream().toArray(Integer[]::new)).mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{ 2,1,3,4,1 })));
        System.out.println(Arrays.toString(solution(new int[]{ 5,0,2,7 })));
    }
}
