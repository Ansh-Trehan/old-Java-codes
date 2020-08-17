//generics

class LogicGen<anything>
{
	anything ob;
	anything get(anything ob)
		{
		this.ob=ob;
		return ob;
	
		}
	void belonging()
			{
	System.out.println("anything is" +ob.getClass().getName());
			}
}

class GenericClass
{
	public static void main(String args[])
		{
		LogicGen<Integer> obj=new LogicGen<Integer>();
		int a=obj.get(44);
		System.out.println(""+a);
		obj.belonging();


		LogicGen<String> obj1=new LogicGen<String>();
		String aa=obj1.get("44");
		System.out.println(""+aa);
		obj1.belonging();
		
		//obj=obj1;
		
		}
		
		
}
	
