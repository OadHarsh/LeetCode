class Solution {
    public void setZeroes(int[][] arr) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row.contains(i) || col.contains(j)){
                    arr[i][j]=0;
                }
            }
        }

    }
}