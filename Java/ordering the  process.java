import java.util.Scanner;
import java.util.*;  

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2= new LinkedList<>();
      
        int [] order= new int[n];
        for(int i=0; i<n; i++)
        {
            q1.add(scanner.nextInt());
            
        }
          for(int i=0; i<n; i++)
        {
            q2.add(scanner.nextInt());
            
        }
        
        int count=0;
        while(!q1.isEmpty())
        {
            if(q1.peek() !=q2.peek())
            {
                q1.add(q1.remove());
                count++;
            }
            else if(q1.peek() == q2.peek())
            {
                q1.remove();
                 q2.remove();
            }
        }
        
        System.out.println(count+n);

    }
}