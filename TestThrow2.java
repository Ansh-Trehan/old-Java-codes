public class TestThrow2
{  
   static void validate(int age){  
     
      try{if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");   
  }
  catch(ArithmeticException ez)
  {
    System.out.println("Not Handled");
  }
}
   public static void main(String args[]){  
      try{
        validate(13);
      }  
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Exception Handled in main");

      }
      System.out.println("rest of the code...");  
 }
  }  
