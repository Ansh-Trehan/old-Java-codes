interface Message
{
	void msg();
}
public class AnonymousInterface3
{
	void demo(Message ob)
	{
		System.out.println("Demo Called");
	}
	public static void main(String[] args)
	{
		AnonymousInterface3 o = new AnonymousInterface3();
		o.demo(new Message()
		{
			public void msg()
			{
				System.out.println("Hello");
			}
		});
	}
}