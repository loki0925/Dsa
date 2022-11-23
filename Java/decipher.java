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
    public static void hello(int n,String str){
        StringBuffer str1=new StringBuffer("");
        String[] arr=str.split("");
        
        for(int i=0;i<arr.length;i++){
            if(i%2!=0)
            {
                int num=Integer.parseInt(arr[i]);
                while(num>0)
                {
                    str1.append(arr[i-1]);
                    num--;
                }
            }
            
        }
        System.out.println(str1);
    }
}