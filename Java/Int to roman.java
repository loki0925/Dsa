import java.lang.*;
import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
         int n = s.nextInt();
      
          System.out.println(intToRoman(n));
         
        
    
    }
     static String intToRoman(int num)
    {
 
        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD",
                       "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL",
                       "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV",
                       "V", "VI", "VII", "VIII", "IX" };
 
        String thousands = m[num / 1000];
        String hundreds = c[(num % 1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[num % 10];
 
        String ans = thousands + hundreds + tens + ones;
 
        return ans;
    }
    
}