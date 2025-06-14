class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length ;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            if(i == n-1){
                    ans[i]= -1;
                    return ans;
                }
            for(int j=i+1;j<n;j++){
                if (ans[i] < arr[j]){
                    ans[i]=arr[j];
                }
                 
            }
        }

        return ans;
    }
}