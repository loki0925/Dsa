abstract class admissionProcess{
  abstract boolean ageLimit(int age);
  abstract boolean educationCriteria(boolean plusTwo);
   abstract boolean creditScore(int score);
  abstract boolean nationality(String citizen);
}

class intensiveProgram extends admissionProcess{
    
    int age;
   boolean plusTwo;
   int creditScore;
   String citizen;
   
   
    public intensiveProgram(int age, boolean plusTwo,  String citizen,int creditScore){
        this.age = age;
        this.plusTwo = plusTwo;
        this.creditScore = creditScore;
        this.citizen = citizen;
    }
   public intensiveProgram(int age, boolean plusTwo, String citizen){
       this.age = age;
        this.plusTwo = plusTwo;
        this.citizen = citizen;
        this.creditScore = 750;
   }
   
   
  boolean ageLimit(int age){
      return age > 18 && age < 28;
  }
  
  boolean educationCriteria(boolean plusTwo){
      return plusTwo;
  }
  
  boolean creditScore(int score){
      return score >= 750;
  }
  boolean nationality(String citizen){
      return citizen.equals("Indian");
  }
  
  String finalDecision(){
      if (ageLimit(age) && educationCriteria(plusTwo) && creditScore(creditScore) && nationality(citizen)){
          return "You are eligible for the Intensive Program";
      }
      else return "You are not eligible for the Intensive Program";
  }
}

class xProgram extends admissionProcess{
  // write the class as mentioned in the problem statement above
   
    int age;
   boolean plusTwo;
   int creditScore;
   String citizen;
   int yearsOfExperience;
   
   
    public xProgram(int age, boolean plusTwo, String citizen,int creditScore,  int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
        this.age = age;
        this.plusTwo = plusTwo;
        this.creditScore = creditScore;
        this.citizen = citizen;
    }
   public xProgram(int age, boolean plusTwo, String citizen,int yearsOfExperience){
       this.yearsOfExperience = yearsOfExperience;
       this.age = age;
        this.plusTwo = plusTwo;
        this.citizen = citizen;
        this.creditScore = 750;
   }
   
  boolean ageLimit(int age){
      return age > 18 && age < 35;
  }
  boolean educationCriteria(boolean plusTwo){
      return plusTwo;
  }
  boolean creditScore(int score){
      return score >= 750;
  }
  boolean nationality(String citizen){
      return citizen.equals("Indian") || citizen.equals("American");
  }
  boolean experience(int yearsOfExperience){
      return yearsOfExperience >= 2;
  }
  String finalDecision(){
      if (ageLimit(age) && educationCriteria(plusTwo) && creditScore(creditScore) && nationality(citizen) && experience(yearsOfExperience)){
          return "You are eligible for the X Program";
      }
      
      else return "You are not eligible for the X Program";
  }
}