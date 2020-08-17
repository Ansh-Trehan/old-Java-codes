import java.util.Scanner;
class ScannerAll
{
	public static void main(String[] args)
	{
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		boolean g;
		String h;
		String i;
		char j;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a String");
		h=in.nextLine();
		System.out.println("String " + h);

		System.out.println("Enter a byte");
		a=in.nextByte();
		System.out.println("Byte " + a);
		
		System.out.println("Enter a short");
		b=in.nextShort();
		System.out.println("Short " + b);
		
		System.out.println("Enter a Integer");
		c=in.nextInt();
		System.out.println("Integer " + c);
		
		System.out.println("Enter a Long");
		d=in.nextLong();
		System.out.println("Long " + d);
		
		System.out.println("Enter a Float");
		e=in.nextFloat();
		System.out.println("Float " + e);
		
		System.out.println("Enter a Double");
		f=in.nextDouble();
		System.out.println("Double " + f);
		
		System.out.println("Enter a Boolean");
		g=in.nextBoolean();
		System.out.println("Boolean " + g);
		
		System.out.println("Enter a Word");
		i=in.next();
		System.out.println("Word " + i);
		
		System.out.println("Enter a Character");
		j=i.charAt(0);
		//c1=in.next().charAt(1);
		System.out.println("String " + j);
		
	}
}