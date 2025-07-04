class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for(int i=right;i>=0;i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                arr[i] = nums[left]*nums[left];
                left++;
            }
            else if(Math.abs(nums[left]) == Math.abs(nums[right])){
                arr[i] = nums[left]*nums[left];
                left++;
            }
            else{
                if(Math.abs(nums[left]) < Math.abs(nums[right])){
                    arr[i] = nums[right] * nums[right];
                    right--;
                }
            }
        }

        return arr;
    }
}