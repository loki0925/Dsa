/*
abstract class festival{
    abstract boolean winter();
    abstract boolean summer();
    abstract boolean multidays();
    abstract boolean panIndia();
}
*/
class diwali extends festival{
    // complete the class as mentioned in the problem statement
     boolean winter(){
        return true;
    }
    boolean summer(){
        return false;
    }
    boolean multidays(){
        return true;
    }
   boolean panIndia(){
       return true;
   }
   boolean festivalOfLights(){
       return true;
   }
    
}

class holi extends festival{
    // complete the class as mentioned in the problem statement
       boolean winter(){
     return false;   
    }
    boolean summer(){
        return true;
    }
    boolean multidays(){
        return false;
    }
   boolean panIndia(){
       return true;
   }
    boolean    festivalOfColors(){
        return true;
    }
   
}

class pongal extends festival{
    // complete the class as mentioned in the problem statement above
       boolean winter(){
        return true;
    }
    boolean summer(){
        return false;
    }
    boolean multidays(){
        return false;
    }
   boolean panIndia(){
       return true;
   }
}
