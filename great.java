import java.util.Scanner;
class Greatest
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println(a + " is greatest");
		else if(b>a && b>c)
			System.out.println(b + " is greatest");
		else if(c>b && c>a)
			System.out.println(c + " is greatest");
		else
			System.out.println("Two or more are equal");
	}
}