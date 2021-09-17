package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 컨테이너 하우스
// https://level.goorm.io/exam/43177/%EC%BB%A8%ED%85%8C%EC%9D%B4%EB%84%88-%ED%95%98%EC%9A%B0%EC%8A%A4/quiz/1
public class ContainerHouse {
    private static void solution(Integer[] arr) {
        Arrays.sort(arr, (a, b) -> (Integer.compare( Math.abs(a),  Math.abs(b)))); // 절대값 정렬
        System.out.println(Arrays.toString(arr));

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            boolean previusPlusMinus = arr[i - 1] > 0;
            boolean currentPlusMinus = arr[i] > 0;

            if (previusPlusMinus == currentPlusMinus) {
                maxCount = Math.max(count, maxCount);
                count = 1; // 앞 뒤 부호가 같은 경우
            } else {
                count++;
                maxCount = Math.max(count, maxCount);
            }
        }
        System.out.println(maxCount);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int floor = Integer.parseInt(br.readLine());
        List<Integer> arrList = new ArrayList<>();

        if (floor > 10000) {
            System.out.println("Invalid floor");
        } else {
            for (int i = 0; i < floor; i++) {
                int container = Integer.parseInt(br.readLine());
                if (container != 0 && container > -999999 && container < 999999) {
                    arrList.add(container);
                }
            }
            solution(Arrays.stream(arrList.stream().mapToInt(i -> i).toArray()).boxed().toArray(Integer[]::new));
        }
    }
}
