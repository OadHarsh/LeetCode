class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        ArrayList<Integer> arr = new ArrayList<>();

        int startrow = 0;
        int endrow = n-1;
        int startcol = 0;
        int endcol = m-1;

        if(startrow == endrow){
            for(int i=0 ; i<=endcol;i++){
                arr.add(matrix[startrow][i]);
            }
            return arr;
        }
        while(startrow <= endrow && startcol <= endcol){
            for(int i =startcol;i<=endcol;i++){
                arr.add(matrix[startrow][i]);
            }

            for(int i =startrow+1;i<=endrow;i++){
                arr.add(matrix[i][endcol]);
            }

            if(startrow<endrow){
                for(int i=endcol-1;i>=startcol;i--){
                    arr.add(matrix[endrow][i]);
                }
            }

            if(startcol<endcol){
                for(int i=endrow-1;i>startrow;i--){
                    arr.add(matrix[i][startcol]);
                }
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }

        return arr;
    }
}