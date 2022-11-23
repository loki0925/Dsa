//Enter code here
import java.util.*;
import java.io.*;
class Main{
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
  
  public static void check(int n,int m,int[] noodles,int[] days)
  {
    //   Arrays.sort(noodles);
      String ans="HAPPY";
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<noodles.length;i++)
      {
          if(map.containsKey(noodles[i]))
          {
              map.put(noodles[i],map.get(noodles[i])+1);
          }
          else
          {
              map.put(noodles[i],1);
          }
      }
      for(int i=0;i<days.length;i++)
      {
          if(map.containsKey(days[i]))
          {
              if(map.get(days[i])>0)
              {
                 map.put(days[i],map.get(days[i])-1); 
              }
              else
              {
                 ans="ANGRY"; 
                 break;
              }
          }
          else
          {
              ans="ANGRY";
              break;
          }
      }
      System.out.println(ans);
  }
  public static void main(String[] args){
      
      FastReader fr=new FastReader();
      
      int tc=fr.nextInt();
      for(int i=0;i<tc;i++){
          int n=fr.nextInt();
          int m=fr.nextInt();
          int noodles[]=Arrays.stream(fr.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
          int days[]=Arrays.stream(fr.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
          check(n,m,noodles,days);
      }
      
      
  }
}