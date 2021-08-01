package programmers;

// 소수 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12977
public class MakePrimeNumber {
    private static int soulution(int[] nums) {
        int answer = 0;
        boolean isPrime = Boolean.FALSE;

        // 3개의 수를 더했을 때 소수가 되는 경우의 개수 계산
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    // 3개 수 합계
                    int num = nums[i] + nums[j] + nums[k];
                    // 소수 판별 여부 확인
                    if (num >= 2) {
                        isPrime = isPrime(num);
                    }
                    // 소수인 경우 개수 카운팅
                    if (Boolean.TRUE.equals(isPrime)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    private static boolean isPrime(int num) {
        boolean isPrime = Boolean.TRUE;
        // num 값이 2인 경우, 소수로 판별
        if (num == 2) {
            return isPrime;
        }
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                isPrime = Boolean.FALSE;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println("[result] : " + soulution(new int[]{ 1,2,3,4 }));
        System.out.println("[result] : " + soulution(new int[]{ 1,2,7,6,4 }));
    }
}
