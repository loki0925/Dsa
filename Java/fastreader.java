import java.util.*;
import java.io.*;
class Main{


public static void main(String[] args){
      
      FastReader fr=new FastReader();
      
      int tc=fr.nextInt();
      for(int i=0;i<tc;i++){
          int n=fr.nextInt();
          
          int[] arr=Arrays.stream(fr.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
          
          check(n,arr);
      }
      
      
  }
  static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while (st == null || !st.hasMoreElements()){
        try { st = new StringTokenizer(br.readLine()); }
        catch (IOException e) { e.printStackTrace(); }
      }
      return st.nextToken();
    }
    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble(){ return Double.parseDouble(next()); }
    String nextLine(){
      String str = "";
      try { str = br.readLine(); }
      catch (IOException e) { e.printStackTrace(); }
      return str;
    }
  }
}
