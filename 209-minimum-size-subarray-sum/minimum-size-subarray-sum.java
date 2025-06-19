class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int count = 0 ;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            while (sum >= target) {
                count++;
                min = Math.min(min,right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return (count == 0) ? 0 : min;
    }
}
