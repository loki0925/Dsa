import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        int n = s.length();
        int max_diff_chars = diffChars(s);
        int ans = n;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String curr = s.substring(i,j+1);
                int diff_chars = diffChars(curr);
                if(diff_chars ==max_diff_chars){
                    ans = Math.min(ans,j-i+1);
                }
            }
        }
        System.out.print(ans);
    }
    
    public static int diffChars(String curr){
        int freq[] = new int[26];
        int ans =0;
        for(int i=0;i<curr.length();i++){
            freq[curr.charAt(i) - 'a']++;
            if(freq[curr.charAt(i) - 'a'] ==1){
                ans++;
            }
        }
        return ans;
        
        
    }
    
    
    
    
    
    
    
    
    
    
}