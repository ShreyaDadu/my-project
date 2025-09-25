public class RowWiseTraversal {
    public static int[] printRowWise(int [][]a) {
        // Write your code here.
        int r=a.length;
        int c=a[0].length;
        int b[]=new int[r*c];
        int x=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[x]=a[i][j];
                x++;
            }
        }
        return b;
    }
} {
    
}
