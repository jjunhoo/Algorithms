package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BrokenComputer {
    private static void solution(int idxCount, int timer, int[] data) {
        int count = 1; // 제한 시간이 지났더라도 입력한 숫자로 인하여 최소한 1개의 문자는 존재 (화면에 남은 글자 수)

        for (int i=0; i<idxCount - 1; i++) {
            if (data[i+1] - data[i] > timer) {
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int idxCount = Integer.parseInt(info[0]); // 배열 element 개수
        int timer = Integer.parseInt(info[1]); // 시간

        String[] arr = br.readLine().split(" ");
        int[] data = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); // 배열 element

        solution(idxCount, timer, data);
    }
}
