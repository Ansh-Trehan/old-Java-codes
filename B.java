//Java program to illustrate error while 
//using class from different package with
//private modifier
package p1;
 
class A
{
  
   private void display()
    {   
        System.out.println("Welcome to Java");
    }
}
 
class B
{
   public static void main(String args[])
      {
          A obj = new A();
          //trying to access private method of another class
          obj.display();
      }
}