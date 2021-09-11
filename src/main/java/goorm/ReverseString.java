package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {
    private static void solution(String input) {
        System.out.println(new StringBuilder(input).reverse());
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }
}
