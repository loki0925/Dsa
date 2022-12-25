import java.util.*;
class Main{
    
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }

        sne(arr,n);
    }
     public static void sne(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
            while(st.size()!=0 && st.peek()>=arr[i]) {
                st.pop();
            }
            if(st.size()==0) {
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
       
        for(int i=0;i<ans.length;i++){
         System.out.print(ans[i]+" ");   
        }
    }
}