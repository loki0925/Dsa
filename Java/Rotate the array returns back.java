import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        
        for(int i=0;i<tc;i++){
            int n=sc.nextInt();
            int k =sc.nextInt();
            int [] arr= new int[n];
              for(int j=0;j<n;j++){
                  arr[j] = sc.nextInt();
              }
            // hello(0,n-k-1,arr);
            // hello(n-k,n-1,arr);
            // hello(0,n,arr);
            k = k % arr.length; 
            reverse(arr, 0, arr.length - k - 1);
            reverse(arr, arr.length - k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);
            
            for(int l=0;l<arr.length;l++){
              System.out.print(arr[l]+ " ");   
            }
              System.out.println();
        }
    }
    
    public static void reverse(int nums[], int i, int j){
        int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
    }
   
 
   
}