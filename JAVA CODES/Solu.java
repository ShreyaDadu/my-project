/*You are given an N x M integer matrix. Your task is to modify this matrix in place so that if any cell contains the value 0, then all cells in the same row and column as that cell should also be set to 0.

Requirements:

If a cell in the matrix has the value 0, set all other cells in that cell's row and column to 0.
You should perform this modification in place (without using additional matrices).
You must do it in place.

For Example:

If the given grid is this:
[7, 19, 3]
[4, 21, 0]

Then the modified grid will be:
[7, 19, 0]
[0, 0,  0]*/

import java.io.*;
import java.util.* ;

public class Solu {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int r=matrix.length;
        int c=matrix[0].length;
        int temp[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            temp[i][j]=matrix[i][j];

        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<r;k++)
                    temp[k][j]=0;
                    for(int n=0;n<c;n++)
                    temp[i][n]=0;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            matrix[i][j]=temp[i][j];
        }
    }

}