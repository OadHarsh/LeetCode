public class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] delta = new int[n + 1];  

        for (int[] q : queries) {
            int l = q[0], r = q[1];
            delta[l] += 1;
            if (r + 1 < n) delta[r + 1] -= 1;
        }

        int[] freq = new int[n];
        freq[0] = delta[0];
        for (int i = 1; i < n; i++) {
            freq[i] = freq[i - 1] + delta[i];
        }

        for (int i = 0; i < n; i++) {
            if (freq[i] < nums[i]) {
                return false;
            }
        }

        return true;
    }
}