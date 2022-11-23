import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        for(int i=0;i<tc;i++){
            int n=sc.nextInt();
            String str=sc.next();
            hello(n,str);
        }
    }
    public static void hello(int n, String str){
  
        for (int i=0;i<n;i++){
            int count = 1;
             while (i < n-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
 
            System.out.print(str.charAt(i) + "" + count);
            
        }
        System.out.println();    
    }
}