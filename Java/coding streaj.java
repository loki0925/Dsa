import java.lang.*;
import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int tc = s.nextInt();
        String str = "";
        int max = 0;
        
        int max2 =0;
         int count2 =0;
        for(int i =0;i<tc;i++){
         String edible = s.next();
           str = str + edible;
           int count =0;
           char[] ch = edible.toCharArray();
           for(int j=1;j<ch.length;j++){
              if(ch[j] == (67) && ch[j-1] == (67)){
                 count++;
               }
               else{
                   count =0;
               }
              if(count >max){
                  max = count;
              }
           }
        } 
           char[] ch2 = str.toCharArray();
           for(int k =1;k<ch2.length;k++){
              if(ch2[k]== 67 && ch2[k-1] ==67){
                 
                   count2++;
                 }
                 else{
                     count2 =0;
                 }
                 
               
             if(count2 >max2){
                  max2 = count2;
              }
           }
         System.out.println((max+1)+ " "+(max2+1));  
        
        
        
    
    }
    
    
}