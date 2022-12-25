import java.lang.*;
import  java.io.*;
import java.util.*;
import java.util.stream.*;

class  Main{
    
    public static void main(String[] args) throws IOException{
       Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        s.nextLine();
 
        for(int l = 0;l<tc;l++){
             String[][] cb = new String[8][8];
              
             for(int m=0;m<8;m++){
                
                 String name = s.nextLine();
                 String[] arr = name.split("");
                // System.out.println(Arrays.toString(arr));
                 for(int i=0;i<8;i++){
                     cb[m][i] = arr[i];
                 }
             }    
             //System.out.println(Arrays.toString(cb));
             bishopMoves(cb);
        }
      
        
        
    }
    public static void bishopMoves(String[][] cs){
        for(int m=1;m<7;m++){
                 for(int i=1;i<7;i++){
                     
                     if(cs[m-1][i-1].equals("#") && cs[m-1][i+1].equals("#") && cs[m+1][i-1].equals("#") && cs[m+1][i+1].equals("#"))
                     {
                      System.out.println((m+1) +" "+ (i+1));
                     }
                     
                 }
            }
            
        
    }
}