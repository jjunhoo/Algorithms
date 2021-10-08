package programmers;

// 다음 큰 숫자
// https://programmers.co.kr/learn/courses/30/lessons/12911
public class NextMoreThanNumber {
    /**
     * int type 숫자를 binary 로 변환 후 char 배열로 return
     * @param n
     * @return char[]
     */
    private static char[] toBinaryCharArr(int n) {
        return Integer.toBinaryString(n).toCharArray();
    }

    /**
     * binary 의 '1' 개수
     * @param arr
     * @return int
     */
    private static int binaryOneCount(char[] arr) {
        int baseCount = 0;

        for (char ch : arr) {
            if (ch == '1') {
                baseCount++;
            }
        }

        return baseCount;
    }
    private static int solution(int n) {
        int baseNumberOneCount = binaryOneCount(toBinaryCharArr(n));

        for (int i = n + 1; ; i++)  {
            if (baseNumberOneCount == binaryOneCount(toBinaryCharArr(i))) {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + solution(78)); // 83
        System.out.println("[result] : " + solution(15)); // 23
    }
}
