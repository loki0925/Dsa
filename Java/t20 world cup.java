class Pair{
  // complete the class as mentioned in the problem statement
 String name;
 int points;
    
    Pair(String name, int point){
        super();
        this.name = name;
        this.points = point;
    }
    
    public void print(){
        System.out.println(name+"- >"+points);
    }
}

class worldCup{
  // complete the class as mentioned in the problem statement
  int numberOfTeams ;
   Pair[] array;


   worldCup(int no, Pair[] array){
    super();
    this.numberOfTeams = no;
    this.array = array;
   
 }
public void List(){
    for(int i = 0;i<array.length;i++){
        for(int j = 0;j<array.length-i-1;j++){
            if(array[j].points<array[j+1].points){
                Pair pair  = array[j];
                array[j] = array[j+1];
                array[j+1] = pair;
            }
        }
    }
}
public void printLeaderBoard() 
{
    List();
    for(int i =0;i<array.length;i++){
        System.out.println(array[i].name+"->"+array[i].points);
    }
}
public String[] qualified(){
    String [] q = new String[2];
    q[0] = array[0].name;
    q[1] = array[1].name;
    return q;
}

public String[] disqualified() {
    int m = array.length -2;
    String [] nq = new String[m];
    int j = 0;
    for(int i = 2;i<array.length;i++){
       nq[j] = array[i].name;
        j++;
    }
    return nq;
}

}