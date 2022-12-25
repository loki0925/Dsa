/*
interface Instructor{
    public String topic();
    public int evaluation();
    public boolean constructWeek();
    public String instructorName(String a);
}
*/
class dsa implements Instructor{
    // implement all the functions inherited by this class as mentioned in the problem statement

    public String topic(){
        return "Data Structures & Algorithms";
        
    }
    public int evaluation(){
      int  b =2; 
        return b;
    }
    public boolean constructWeek(){
      return false;   
    }
    public String instructorName(String a){
        if(a == "DSA101"){
            return "Varun Bhatt";
        }
        if(a=="DSA201"){
            return "Venugopal Panchamurthi";
        }
        if(a == "DSA301"){
            return "Aishwarya Shivachandran";
        }
        if(a == "DSA401" ){
            return "Akshay Gupta";
        }
        else {
            return " ";
        }
    }
    
}

class coding implements Instructor{
    // implement all the functions inherited by this class as mentioned in the problem statement

    public String topic(){
        return "Java & Spring boot";
        
    }
    public int evaluation(){
        int c =3;
        return c;
    }
    
    public boolean constructWeek(){
        return true;
    }
    public String instructorName(String a){
       if(a == "JA111"){
           return "Ratan Lal Gupta";
       }
       if(a== "SB101") {
           return "Arjun Thakur";
       }
       if(a == "SB201"){
         return "Ratan Lal Gupta";  
       }
       if(a == "RJ101" ){
          return "Varun Bhatt"; 
       }
       else {
           return "";
       }

    }
}
