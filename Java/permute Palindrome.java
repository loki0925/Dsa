import java.util.*;
class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            String ab = sc.next();
           
      if(canPermutePalindrome(ab)){
          System.out.println("Yes");
      }
      else {
          System.out.println("No");
      }
        }
        
        
    } 

     public static boolean canPermutePalindrome(String s) {
     HashMap < Character, Integer > map = new HashMap < > ();
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