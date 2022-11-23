import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
      
        int n = s.nextInt();
        
        int[][] matrix = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
             matrix[i][j] = s.nextInt();   
            }
        } 
        num(n,matrix);
       
    
    } 
    public static void num(int n,int[][] mat){
    int top=0;
    int bottom=n-1;
    int left=0;
    int right=n-1;
    
    while(top<bottom && left<right){
        
        int last =mat[top+1][left];
        
       for(int i=left ; i<=right ; i++){
           int temp=mat[top][i];
            mat[top][i]=last;
            last =temp;
       }
       top++;
        for(int j=top ; j<=bottom ; j++){
            int temp=mat[j][right];
            mat[j][right]=last;
            last =temp;
       }
       right--;
         for(int k=right ; k>=left ; k--){
            int temp=mat[bottom][k];
            mat[bottom][k]=last;
            last =temp;
       }
       bottom--;
         for(int l=bottom ; l>=top ; l--){
            int temp=mat[l][left];
            mat[l][left]=last ;
            last=temp;
       }
       left++;
        
    }
        
        for(int k=0;k<mat.length;k++ ){
            for(int l=0;l<mat.length;l++ ){
            System.out.print(mat[k][l]+" ");
        }System.out.println();
     }
    
}
}