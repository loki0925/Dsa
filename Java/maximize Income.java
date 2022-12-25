import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        int n=sc.nextInt();
        int [] arr= new int[tc];    
        for(int i=0;i<tc;i++){
             arr[i] = sc.nextInt();
        }
       
        for(int j=0;j<arr.length;j++){
            if(n>0 ){
            if(arr[j] <0){
                arr[j] = arr[j]* (-1);
                n--;
             }
            }
        }
        
        if(n>0){
             Arrays.sort(arr);
            if(n%2==0){
                 arr[0]= arr[0]*1;
             }
             else {
                 arr[0]= arr[0]*-1;
             }
         }
        int sum =0;
        for(int j=0;j<arr.length;j++){
            sum = sum + arr[j];
        }
              System.out.println(sum);
        
    }
    

   
 
   
}