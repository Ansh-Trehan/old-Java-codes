
interface Message 
{
   void msg();
}

public class AnonymousInterface {

   void demo(Message ob)
	{	
		System.out.println("Demo called");
	}
   	public static void main(String args[]) 
	{
AnonymousInterface o = new AnonymousInterface();

              
      		Message obj = new Message() 
				{
         				public void msg() 
					{
            				System.out.println("hello");
         				}
      				};
o.demo(new Message() 
				{
         				public void msg() 
					{
            				System.out.println("hello");
         				}
      				});
		obj.msg();
   }
}

//You can,refer to an object that implements an interface by the type of the interface. 