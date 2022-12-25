import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
         int tc = s.nextInt();
    for(int k=0;k<tc;k++){
        int n = s.nextInt();
        int[][] matrix = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
             matrix[i][j] = s.nextInt();   
            }
        } 
        rotateBy180(n,matrix);
     }    
    
    } 
public static void  rotateBy180(int n, int[][]  matrix){
    for (int i = 0; i <matrix.length/2; i++) {
            for (int j = i;j<matrix.length-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[n - 1 - i][n - j - 1];
                 matrix[n - 1 - i][n - j - 1] = matrix[n - 1 -j][i];
                 matrix[n - 1 -j][i] = temp;
            
            }
        }
    for (int i = 0; i <matrix.length/2; i++) {
            for (int j = i;j<matrix.length-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = matrix[n - 1 - i][n - j - 1];
                 matrix[n - 1 - i][n - j - 1] = matrix[n - 1 -j][i];
                 matrix[n - 1 -j][i] = temp;
            
            }
        }
    
    
        
        for(int k=0;k<matrix.length;k++ ){
            for(int l=0;l<matrix.length;l++ ){
            System.out.print(matrix[k][l]+" ");
        }System.out.println();
    }
}
}