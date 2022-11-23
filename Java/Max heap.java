
import java.io.*;
import java.util.*;
import java.util.stream.*;

class  Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        while(tc-->0){
            int n = Integer.parseInt(br.readLine());
            int[] arr= Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(hello(n,arr));
        }
        
    }
    public static boolean hello(int n,int[] arr){
     
     for (int i = 0; i <= (n - 2) / 2; i++) {
            if (arr[2*i+1] > arr[i]) {
                return false;
            }
            if (2*i +2 < n && arr[2*i+2]>arr[i]) {
                return false;
            }
        }
        return true;
      
    }
}