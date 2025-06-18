class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0 ;
        double max_avg = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        max_avg = sum / k;

        for(int i = k;i<nums.length;i++){
            sum = sum + nums[i];
            sum = sum - nums[i-k];
            max_avg = Math.max(sum/k,max_avg);
        }

        return max_avg;
    }
}