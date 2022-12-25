import java.util.*;

class Main{
    
   
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        hello(tc);
    } 
    public static void hello(int n)
    {
       for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0 || i == n - 1 ||
                    j == 0 || j == n - 1 ||
                    i == j || i == n - 1 - j)            
                    System.out.print("*"+" ");        
     
                else
                    System.out.print("  ");
                 
            }
     
            System.out.println();
        }
        
        
    }
    
    
}
