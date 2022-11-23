import java.io.*;
import java.util.*;
import java.util.stream.*;

class  Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        while(tc-->0){
            int n = Integer.parseInt(br.readLine());
            String arr=br.readLine();
           boolean check = hello(arr);
            if(check){
                System.out.println("Yes");
            }
            else {
                 System.out.println("No");
            }
        }
        
    }
     public static boolean hello(String s) {
         HashMap <Character, Integer> map = new HashMap<> ();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key: map.keySet()) {
            count += map.get(key) % 2;
        }
        
        return count <= 1;
        
     }
}