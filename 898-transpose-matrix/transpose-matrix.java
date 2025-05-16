import java.util.*;
class Solution {
    public int[][] transpose(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        int rows = matrix.length;
        int cols = matrix[0].length;

        int [][] arr = new int[cols][rows];
        for (int i = 0 ; i<rows;i++){
            for (int j = 0 ; j<cols;j++){
                arr[j][i] = matrix[i][j] ;
            }
            // System.out.println("");
        }
        return arr;

    }
}