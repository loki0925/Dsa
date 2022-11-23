import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=0;i<n;i++){
            int row = scanner.nextInt();
            int col = scanner.nextInt();
              System.out.println(row +" "+col);
              scanner.nextLine();
              for(int j=0;j<row;j++){
                  String name = scanner.nextLine();
                  String[] arr = name.split("");
                  System.out.println(Arrays.toString(arr));
              }
            
        }
        
        
       
    }
}
