import java.util.Scanner;
class OddOrEven
{
	public static void main(String[] args)
	{
		int x;
		System.out.println("Enter an integer to check");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x%2 == 0)
			System.out.println("You entered an even number");
		else
			System.out.println("You entered an odd number");
	}
}