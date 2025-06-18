class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum[] = new int[nums.length];
        int rightsum[] = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rightsum[i] = sum ;
        }

        leftsum[0]=sum;
        for(int i = 1 ;i<nums.length;i++){
            sum = sum - nums[i-1];
            leftsum[i] = sum ;
        }

        for(int i=0;i<nums.length;i++){
            if(leftsum[i]==rightsum[i]){
                return i;
            }
        }

        return -1;
    }
}