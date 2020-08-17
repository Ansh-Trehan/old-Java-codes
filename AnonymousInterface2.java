interface Message
{
	void msg();
}
public class AnonymousInterface2
{
	void demo(Message ob)
	{
		System.out.println("Demo Called");
	}
	public static void main(String[] args)
	{
		AnonymousInterface2 o = new AnonymousInterface2();
		Message obj = new Message()
		{
			public void msg()
			{
				System.out.println("Hello");
			}
		};
		o.demo(obj);
		obj.msg();
	}
}