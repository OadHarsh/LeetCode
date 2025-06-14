class Solution {
    public int[] twoSum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        int nums[] = new int[2]; 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    nums[0]= i;
                    nums[1]= j;
                }   
            }
        }

        return nums;
    }
}