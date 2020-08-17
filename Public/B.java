
public class A
{
   public void display()
      {
          System.out.println("Welcome to Java!");
      }
}

class B
{
    public static void main(String args[])
      {
          A obj = new A;
          obj.display();
      }
}