





public class TestTryCatch{  
  public static void main(String args[]){  
   try{  
      int data=50/0;  
   }catch(ArithmeticException e){System.out.println("Exception handled");}  
   System.out.println("rest of the code...");  
}  
}  