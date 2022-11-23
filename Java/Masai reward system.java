import java.lang.*;
import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int tc = s.nextInt();
        
        for(int i =0;i<tc;i++){
         int n = s.nextInt();
        String edible = s.next();
 
          count(edible);
       
        }
    
    }
    static void count(String str)
    {
        int count=0;

        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(set.contains(str.charAt(i)))
            {
                count++;
            }
            else
            {
                count=count+2;
                set.add(str.charAt(i));
            }
            
        }
        System.out.println(count);
        
    }
    
}