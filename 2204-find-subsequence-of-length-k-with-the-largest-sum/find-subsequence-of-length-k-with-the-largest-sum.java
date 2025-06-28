import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Step 1: Store value and index
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new int[]{nums[i], i});
        }

        // Step 2: Sort by value in descending order
        list.sort((a, b) -> b[0] - a[0]);

        // Step 3: Pick top k values
        List<int[]> topK = list.subList(0, k);

        // Step 4: Sort top k by index (to keep original order)
        topK.sort((a, b) -> a[1] - b[1]);

        // Step 5: Extract values only
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i)[0];
        }

        return result;
    }
}
