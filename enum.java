import java.util.Scanner;
enum Items
{
	Burger,
	Noodles,
	Pizza
}

class TestEnum
{
	static Items ob;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(Items i: Items.values())
			System.out.println(i);
		System.out.println("\nEnter the item that you want to order:\t");
		String itm = sc.next();
		ob=Items.valueOf(itm);
		switch(ob)
		{
			case Burger:
				System.out.println("BURGER ORDERED");
				break;
			case Noodles:
				System.out.println("NOODLES ORDERED");
				break;
			case Pizza:
				System.out.println("PIZZA ORDERED");
				break;
		}
	}
}