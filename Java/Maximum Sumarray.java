
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
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i<arr.length;i++) {
            sum =sum+arr[i];
            if (sum>max)
                max =sum;
            if (sum<0)
                sum =0;
        }
        return max;
    }
}