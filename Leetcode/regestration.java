import java.util.*;
class Main{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
       Map<String, Integer> map = new HashMap<>();
       for(int i=0;i<tc;i++){
           String arr = sc.nextLine();
          
           if(map.containsKey(arr)){
               int x = map.get(arr);
               x++;
               map.put(arr, x);
               System.out.println(arr+x);
           }
          
           else{
               System.out.println("OK");
               map.put(arr,0);   
           }
       }
    }
}