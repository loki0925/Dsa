import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.lang.*;

class  Main{
    
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
           int[][] cb=new int[tc][3];
           for(int i=0;i<tc;i++) {
            cb[i][0]=i+1;
            cb[i][1]=sc.nextInt();
            cb[i][2]=sc.nextInt();
        }
       
           //System.out.println(Arrays.deepToString(cb));
          hardestWorker(cb);
    }

 public static void hardestWorker(int[][] arr){
      
       for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if((arr[j][1]==arr[j+1][1])&&(arr[j][2]==arr[j+1][2])){
                  if(arr[j][0]>arr[j+1][0]){
                    swap(arr,j);
                  }
                }
                else if((arr[j][1]==arr[j+1][1])&&(arr[j][2]<arr[j+1][2]))
                {
                   swap(arr,j);
                }
                else if(arr[j][1]<arr[j+1][1]){
                    swap(arr,j);
                }
                
                 
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i][0]+" ");
        }
    }
    public static void swap(int[][] arr,int j)
    {
        int[] temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp; 
        
    }
} 