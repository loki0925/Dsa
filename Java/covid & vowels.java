import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String tc=sc.next();

         hello(tc);
    
    }
    public static void hello(String str){
      int count =0;
        for (int i=0;i<str.length();i++){
           for(int j=i+1;j<=str.length();j++){
              if(str.substring(i, j).contains("a") 
              && str.substring(i, j).contains("i") && str.substring(i, j).contains("o")
              && str.substring(i, j).contains("u")){
                  count++;  
              }
           }
        }
        System.out.println(count);
       
    }
}