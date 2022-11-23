import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
 
        Stack<Integer> stack = new Stack<>();
         Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<tc;i++){
            int num =sc.nextInt();
            if(num ==1){
                q.add(sc.nextInt());
                //stack.push(sc.nextInt());
            }
            else if(num ==2){
                stack.push(sc.nextInt());
            }
            else if(num == 3){
                if(q.size() ==0){
                    
                System.out.println(-1);
                }
                else{
                int head = q.peek();
                System.out.println(head);}
            }
            else if(num ==4){
                if(stack.size() ==0){
                    
                System.out.println(-1);
                }
                else{
                int head1 = stack.peek();
                
                System.out.println(head1);}
            }
            else if(num ==5 ){
                 int head2 = q.remove();
                stack.push(head2);
            }
        }
        
       
       
   
    }
}