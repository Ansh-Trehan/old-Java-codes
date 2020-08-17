import java.util.Scanner;
class Calc
{
	public static void main(String[] args)
	{
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter operator (ADD, SUB, MUL, DIV):");
		op = sc.next();
		switch(op)
		{
			case "ADD":
			{
				System.out.println("Sum is "+(a+b));
				break;
			}
			case "SUB":
			{
				System.out.println("Difference is "+(a-b));
				break;
			}
			case "MUL":
			{
				System.out.println("Product is "+(a*b));
				break;
			}
			case "DIV":
			{
				System.out.println("Quotion is "+(a/b));
				break;
			}
			default:
			{
				System.out.println("Invalid Operator");
			}
		}
	}
}