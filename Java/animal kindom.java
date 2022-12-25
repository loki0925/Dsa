/*
abstract class Animal{
  abstract boolean run();
  abstract boolean swim();
  abstract boolean crawl();
  abstract boolean fly();
}
*/
class Tiger extends Animal{
  // declare and define all the functions that are inherited by this class
   public boolean run(){
     return true;  
   }
  public boolean swim(){
     return true;
  }
  public boolean crawl(){
      return false;
  }
  public boolean fly(){
      return false;
  }
    
}

class Snake extends Animal{
  // declare and define all the functions that are inherited by this class

  public boolean run(){
     return false;  
   }
  public boolean swim(){
     return false;
  }
  public boolean crawl(){
      return true;
  }
  public boolean fly(){
      return false;
  }
}

class Eagle extends Animal{
  // declare and define all the functions that are inherited by this class

     public boolean run(){
        return false;
    }
    public boolean swim(){
        return false;
    }
    public boolean crawl(){
        return false;
    }
    public boolean fly(){
        return true;
    }
}

class Shark extends Animal{
  // declare and define all the functions that are inherited by this class

    public boolean run(){
        return false;
    }
    public boolean swim(){
        return true;
    }
    public boolean crawl(){
        return false;
    }
    public boolean fly(){
        return false;
    }
}
