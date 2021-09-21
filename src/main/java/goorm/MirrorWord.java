package goorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MirrorWord {
    private static final char MIRROR_ALPHABET[] = {'b','d','i','l','m','n','o','p','q','s','z','u','v','w','x'};

    private static void solution(String[] words) {
        for (String word : words) {
            boolean isMirror = Boolean.TRUE;
            String result = "";
            char[] wordCharcterArr = word.toCharArray();

            for (int i=0; i<wordCharcterArr.length; i++) {
                switch (wordCharcterArr[i]) {
                    case 'b':
                        if ('d' != wordCharcterArr[wordCharcterArr.length - i - 1]) {
                            isMirror = Boolean.FALSE;
                        }
                        break;
                    case 'd':
                        if ('b' != wordCharcterArr[wordCharcterArr.length - i - 1]) {
                            isMirror = Boolean.FALSE;
                        }
                        break;
                    case 'p':
                        if ('q' != wordCharcterArr[wordCharcterArr.length - i - 1]) {
                            isMirror = Boolean.FALSE;
                        }
                        break;
                    case 'q':
                        if ('p' != wordCharcterArr[wordCharcterArr.length - i - 1]) {
                            isMirror = Boolean.FALSE;
                        }
                        break;
                    case 's':
                        if ('z' != wordCharcterArr[wordCharcterArr.length - i - 1]) {
                            isMirror = Boolean.FALSE;
                        }
                        break;
                    case 'z':
                        if ('s' != wordCharcterArr[wordCharcterArr.length - i - 1]) {
                            isMirror = Boolean.FALSE;
                        }
                        break;
                }
            }
            if (isMirror == Boolean.TRUE) {
                result = "Mirror";
            } else {
                result = "Normal";
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] word = new String[count];

        for (int i=0; i<count; i++) {
            word[i] = br.readLine();
        }

        solution(word);
    }
}
