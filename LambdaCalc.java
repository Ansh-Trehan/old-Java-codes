import java.util.Scanner;
interface Calc
{
	float cal(int a,int b);
}
public class LambdaCalc
{
	public static void main(String[] args)
	{
		int n1, n2;
		String str;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a simple expression : ");
		n1=sc.nextInt();
		str=sc.next();
		op=str.charAt(0);
		n2=sc.nextInt();
		Calc c1;
		if(op=='+')
		{
			c1=(a,b)->(a+b);
			System.out.println(c1.cal(n1,n2));
		}
		else if(op=='-')
		{
			c1=(a,b)->(a-b);
			System.out.println(c1.cal(n1,n2));
		}
		else if(op=='*')
		{
			c1=(a,b)->(a*b);
			System.out.println(c1.cal(n1,n2));
		}
		else if(op=='/')
		{
			c1=(a,b)->(a/b);
			System.out.println(c1.cal(n1,n2));
		}
	}
}