/*
abstract class passwordDetector{
    abstract boolean checkLength(String password);
    abstract boolean checkSpecialCharacter(String password);
    abstract boolean checkNumber(String password);
    abstract boolean checkUpperCase(String password);
    abstract boolean checkLowerCase(String password);
}
*/
class checker extends passwordDetector{
  // complete the class as mentioned in the problem statement
  int size;
    checker(int size){
     }
    
     boolean checkLength(String password){
          
         int l = password.length();
         if(l>=size){
             return true;
         }
         else {
             return false;
         }
    
    }
   
    boolean checkSpecialCharacter(String password){
     String str = password;
     boolean flag = true;
      
      for (int i = 0;i<str.length();i++) {
        if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
               flag =false;
               return true;
            }
        }
        if(flag){
            return false;
        }
        else{
            return true;
        }
    
    }
     boolean checkNumber(String password){
       String str = password;
       boolean flag = true;
      
      for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))) {
               flag =false;
               return true;
            }
        }
        if(flag){
            return false;
        }
        else{
            return true;
        }
    }
    boolean checkUpperCase(String password){
       String str = password;
     boolean flag = true;
      for (int i = 0; i < str.length(); i++) {
        if (Character.isLowerCase(str.charAt(i)) ) {
               flag =false;
               return true;
            }
        }
        if(flag){
            return false;
        }
        else{
            return true;
        }
    }
    boolean checkLowerCase(String password){
     String str = password;
     boolean flag = true;
      for (int i = 0; i < str.length(); i++) {
 
        if (Character.isUpperCase(str.charAt(i)) ) {
               flag =false;
               return true;
            }
        }
        if(flag){
            return false;
        }
        else{
            return true;
        }
    }
    
}
