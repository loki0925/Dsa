import java.lang.*;
import  java.io.*;
import java.util.*;
import java.util.stream.*;

class  Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        while(tc-->0){
            int n = Integer.parseInt(br.readLine());
            int [] arr= Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(twice(n,arr));
        }
        
    }
    public static int twice(int n,int[] arr){
        HashMap<Integer,Integer> mapping = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            if(mapping.get(arr[i])!=null){
                mapping.put(arr[i],mapping.get(arr[i])+1);
            }
            else{
                mapping.put(arr[i],1);
            }
        }
        
        for(Integer i: mapping.keySet()){
            if(mapping.get(i)==1){
                return i;
            }
        }
       return -1;
    }
}