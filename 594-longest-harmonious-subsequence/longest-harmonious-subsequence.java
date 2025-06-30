class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int left = 0 , right = 1;
        int max_len = 0;

        if(nums.length < 1){
            return 0;
        }
        while(right < nums.length){
            int max = nums[right];
            int min = nums[left];

            if(max - min == 1){
                max_len = Math.max(max_len,right-left+1);
                right++;
            }
            else if(nums[left]==nums[right]){
                right++;
            }
            else{
                left++;
            }
        }

        return max_len;
    }
}