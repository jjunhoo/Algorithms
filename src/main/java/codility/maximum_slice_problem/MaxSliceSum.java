package codility.maximum_slice_problem;

// MaxSliceSum
// https://app.codility.com/c/run/trainingG54PMC-5ZM/
// 카데인 알고리즘 (Kadane's)
public class MaxSliceSum {
    public static int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        int maxSum = A[0];
        int resultMaxSum = A[0];

        // 위에서 maxSum, resultMaxSum 의 기준값을 A[0] 으로 해두었기 때문에 A[1] 부터 시작하기 위해 i = 1 로 설정
        for (int i = 1; i < A.length; i++) {
            maxSum = Math.max(A[i], maxSum + A[i]); // 현재 배열값과 현재까지의 배열의 합 + 현재 배열값 크기 비교 후 큰 값 추출 (해당 배열 값이 앞에서 누적하여 더한 값보다 크면 해당 배열 값 할당)
            resultMaxSum = Math.max(maxSum, resultMaxSum); // maxSum 과 resultMaxSum 을 비교하여 큰값 갱신
        }

        return resultMaxSum;
    }

    public static void main(String[] args) {
        System.out.println("[result] :: " + solution(new int[]{ 3,2,-6,4,0 })); // 5
    }
}
