import java.util.Scanner;
class abcd
{
	int c;
	int add(int a, int b)
	{
		c = a+b;
		return c;
	}
}

class add_add
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z;
		abcd obj = new abcd();
		z=obj.add(a,b);
		System.out.println(z);
	}
}