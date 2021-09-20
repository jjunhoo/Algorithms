package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoodBrother {
    private static void solution(int[] brother, int day) {
        double brother1 = brother[0];
        double brother2 = brother[1];
        boolean BIG_BROTHER = Boolean.TRUE;

        // 형이 먼저 동생한테 식량을 더해줌 (형 -> 동생 순서)
        for (int i=1; i<=day; i++) {
            if (BIG_BROTHER == Boolean.TRUE) {
                brother2 += Math.round(brother1 / 2);
                brother1 = Math.floor(brother1 / 2);
                BIG_BROTHER = Boolean.FALSE;
            } else {
                brother1 += Math.round(brother2 / 2);
                brother2 = Math.floor(brother2 / 2);
                BIG_BROTHER = Boolean.TRUE;
            }
        }

        System.out.println((int) brother1 + " " + (int) brother2);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int[] brother = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int day = Integer.parseInt(br.readLine());

        solution(brother, day);
    }
}
