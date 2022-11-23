import java.lang.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int tc = s.nextInt();
        for(int k=0;k<tc;k++){
        String n = s.next();
        
         int mid = n.length() / 2; 
         if(n.length()%2==0){
        String[] parts = {n.substring(0, mid),n.substring(mid)};
        //System.out.println(Arrays.toString(parts));
           if(parts[0].equals(parts[1])){
               System.out.println("Yes");
           }
           else {
               System.out.println("No");
           }
         }
         else{
            String[] parts1 = {n.substring(0, mid),n.substring(mid+1)};
            if(parts1[0].equals(parts1[1])){
               System.out.println("Yes");
            }
           
           else {
               System.out.println("No");
           }
         }
         
        
}      
    }
    
}