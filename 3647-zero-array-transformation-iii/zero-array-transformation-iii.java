import java.util.*;

public class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;

        Arrays.sort(queries, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> available = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> running = new PriorityQueue<>();

        int queryIndex = 0;

        for (int i = 0; i < n; i++) {
            while (queryIndex < m && queries[queryIndex][0] <= i) {
                available.offer(queries[queryIndex][1]);
                queryIndex++;
            }

            while (!running.isEmpty() && running.peek() < i) {
                running.poll();
            }

            while (running.size() < nums[i]) {
                if (available.isEmpty() || available.peek() < i) {
                    return -1;
                }
                running.offer(available.poll());
            }
        }

        return available.size();
    }
}