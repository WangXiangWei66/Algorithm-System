package Class46;

public class Code02_RemoveBoxes {

    public static int func1(int[] arr, int L, int R, int K) {
        if (L > R) {
            return 0;
        }
        int ans = func1(arr, L + 1, R, 0) + (K + 1) * (K + 1);
        for (int i = L; i <= R; i++) {
            if (arr[i] == arr[L]) {
                ans = Math.max(ans, func1(arr, L + 1, i - 1, 0) + func1(arr, i, R, K + 1));
            }
        }
        return ans;
    }

    public static int removeBoxes(int[] boxes) {
        int N = boxes.length;
        int[][][] dp = new int[N][N][N];
        int ans = process1(boxes, 0, N - 1, 0, dp);
        return ans;
    }

    public static int process1(int[] boxes, int L, int R, int K, int[][][] dp) {
        if (L > R) {
            return 0;
        }
        if (dp[L][R][K] > 0) {
            return dp[L][R][K];
        }
        int ans = process1(boxes, L + 1, R, 0, dp) + (K + 1) * (K + 1);
        for (int i = L + 1; i <= R; i++) {
            if (boxes[i] == boxes[L]) {
                ans = Math.max(ans, process1(boxes, L + 1, i - 1, 0, dp) + process1(boxes, i, R, K + 1, dp));
            }
        }
        dp[L][R][K] = ans;
        return ans;
    }

    public static int maxBoxes2(int[] boxes) {
        int N = boxes.length;
        int[][][] dp = new int[N][N][N];
        int ans = process2(boxes, 0, N - 1, 0, dp);
        return ans;
    }

    public static int process2(int[] boxes, int L, int R, int K, int[][][] dp) {
        if (L > R) {
            return 0;
        }
        if (dp[L][R][K] > 0) {
            return dp[L][R][K];
        }
        int last = L;
        while (last + 1 <= R && boxes[last + 1] == boxes[L]) {
            last++;
        }
        int pre = K + last - L;
        int ans = process2(boxes, last + 1, R, 0, dp) + (pre + 1) * (pre + 1);
        for (int i = last + 2; i <= R; i++) {
            if (boxes[i] == boxes[L] && boxes[i - 1] != boxes[L]) {
                ans = Math.max(ans, process2(boxes, last + 1, i - 1, 0, dp) + process2(boxes, i, R, pre + 1, dp));
            }
        }
        dp[L][R][K] = ans;
        return ans;
    }
}
