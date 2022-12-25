import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
         int tc = s.nextInt();
    for(int k=0;k<tc;k++){
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] matrix = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
             matrix[i][j] = s.nextInt();   
            }
        } 
       List<Integer> list= rotateBy180(n,matrix);
       
       for(int l=0;l< list.size();l++){
           System.out.print(list.get(l)+" ");
       }
       System.out.println();
     }    
    
    } 
public static List<Integer>  rotateBy180(int n, int[][]  matrix){
 
    List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        while(true){
            
           for(int i = top; i <= bottom; i++) res.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
            
            for(int i = left; i <= right; i++) res.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--) res.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;

            
            for(int i = right; i >= left; i--) res.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;
            
            
        }
        
        return res;
    
}
}