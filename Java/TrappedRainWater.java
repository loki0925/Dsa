
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
            System.out.println(hello(arr));
        }
        
    }
    static int hello(int[] arr)
    {
        int l = 0;
        int r =arr.length-1;
        int lm =0;
        int rm =0;
        int sum=0;
        while (l<=r){
            if(rm<=lm){              
                 sum += Math.max(0, rm-arr[r]);
                rm = Math.max(rm, arr[r]);
                r -= 1;
            }
             else {
                sum += Math.max(0,lm-arr[l]);
                lm = Math.max(lm,arr[l]);
                l += 1;
            }
        }
        return sum;
    }
}