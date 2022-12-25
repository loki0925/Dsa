import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
 
        int [] arr= new int[tc];    
        for(int j=0;j<tc;j++){
             arr[j] = sc.nextInt();
        }
        Arrays.sort(arr);
           //System.out.println(Arrays.toString(arr));
        int res = 0;
        int i = 0;
 
        while (i<arr.length) {

            int temp = arr[i];
           
            int count = 1;
            i++;
 
            while (i<arr.length && arr[i] == temp) {
                count++;
                i++;
            }

            if (count >= 2) {
                res = res + count/2;
            }
        }
       System.out.println(res);
        
    }
    

   
 
   
}