class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        int sum = 0;
        
        for(int i=0;i<1;i++){
            int start = i;
            for(int j=0;j<nums.length;j++){
                int end=j;

                for(int k=start;k<=end;k++){
                    sum = sum + nums[k]; 
                }

                arr[j]=sum;             
                sum = 0;
        }
    }

    return arr;
}
}