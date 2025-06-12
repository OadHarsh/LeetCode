class Solution {
    public int maxAdjacentDistance(int[] arr) {
        int max = arr[arr.length-1]-arr[0];

        if(max < 0){
            max = (-1)*max;
        }
        
        for(int i=1;i<arr.length;i++){
            int temp_max = arr[i]-arr[i-1];
            if (temp_max < 0){
                temp_max = (-1)*temp_max ;
            }
            if(temp_max > max){
                max = temp_max;
            }
        }
        
        return max;
    }
}