import java.util.Scanner;
import java.util.*;
import java.lang.*;


class  Main{
    public static int longestIncreasingPath(int[][] matrix) {
        Integer[][] cache = new Integer[matrix.length][matrix[0].length];
        int longest = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                longest = Math.max(longest, dfs(i, j, -1, matrix, cache));
            }
        }
        return longest;
    }
    public static int dfs(int row, int col, int parent, int[][] matrix, Integer[][] cache){
        if(row < 0 || row == matrix.length || col < 0 || col == matrix[0].length ||
          matrix[row][col] <= parent){
            return 0;
        }
        if(cache[row][col] != null){
            return cache[row][col];
        }
        int up = 1 + dfs(row + 1, col, matrix[row][col], matrix, cache);
        int down = 1 + dfs(row - 1, col, matrix[row][col], matrix, cache);
        int left = 1 + dfs(row, col - 1, matrix[row][col], matrix, cache);
        int right = 1 + dfs(row, col + 1, matrix[row][col], matrix, cache);
        
        int longestPath = Math.max(Math.max(up, down), Math.max(left, right));
        cache[row][col] = longestPath;
        return longestPath;
    }
    
    
    
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        
        int[][] matrix = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
             matrix[i][j] = s.nextInt();   
            }
        }
        System.out.println( longestIncreasingPath(matrix));
       
    }
    
}