import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        for(int i=0;i<tc;i++){
            int n=sc.nextInt();
            int [] arr= new int[n];
              for(int j=0;j<n;j++){
                  arr[j] = sc.nextInt();
              }
            int ele1 = sc.nextInt();
            int ele2 = sc.nextInt();
            int count = 0;
            boolean flag = false;
            for(int l=0;l<arr.length;l++){
              if(arr[l] == ele1){
                  flag =true;
                  }
                  if(flag){
                      count++;
                  }
                  if(arr[l]== ele2){
                      break;
                  }
                  
              }
              System.out.println((count-1)*5*7);
            }
              
        }
    
    
    
    
   
 
   
}