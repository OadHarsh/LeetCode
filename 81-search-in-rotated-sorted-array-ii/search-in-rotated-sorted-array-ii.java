class Solution {
    public boolean search(int[] nums, int target) {
        
        int n = nums.length ;
        int count = 0 ;
        for (int i = 0 ; i < n;i++){
            if (nums[i] == target){
                count += 1 ;
                break;
            }
            else{
                count = 0;
            }
            
        }

        if (count == 1){
            return true ;
        }
        else{
            return false;
        }
    }
}