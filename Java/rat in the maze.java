import java.util.Scanner;
import java.util.*;
import java.lang.*;


class  Main{
    static boolean flag = false;
     static void solve(int[][] matrix,int row,int col,String ans){
        if(row<0 || row >= matrix.length || col<0 || col >= matrix.length ||matrix[row][col] ==0 ){
        return;
            
        }
        if(row == matrix.length-1 && col == matrix.length-1 ){
            System.out.print(ans.toString()+ " ");
            flag = true;
            return;
        }
        matrix[row][col]= 0;
         solve(matrix,row+1,col,ans+"D");
         solve(matrix,row,col-1,ans+"L");
         solve(matrix,row,col+1,ans+"R");
         solve(matrix,row-1,col,ans+"U");
        matrix[row][col] =1;
        return;
    }
    
    
    
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        
        int[][] matrix = new int[tc][tc];
        
        for(int i=0;i<tc;i++){
            for(int j =0;j<tc;j++){
             matrix[i][j] = s.nextInt();   
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        solve(matrix,0,0,"");
        if(flag == false ){
            System.out.println(-1);
        }
    }
    
}