import java.util.*;


public class Main{
    
    public static void check(String s1,String s2)
    {
        StringBuffer sb1=new StringBuffer("");
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='#'&&sb1.length()!=0)
            {
                sb1.deleteCharAt(sb1.length()-1);
            }
            else
            {
                sb1.append(c);
            }
        }
        StringBuffer sb2=new StringBuffer("");
        for(int i=0;i<s2.length();i++)
        {
            char c=s2.charAt(i);
            if(c=='#'&&sb2.length()!=0)
            {
                sb2.deleteCharAt(sb2.length()-1);
            }
            else
            {
                sb2.append(c);
            }
        }
        if(sb1.toString().equals(sb2.toString()))
        {
            System.out.println("CORRECT");
        }
        else
        {
            System.out.println("WRONG");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int i=0;i<tc;i++)
        {
            int n=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            check(s1,s2);
            
        }
    }
}