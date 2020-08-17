import java.util.Scanner;
class percent
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Subjects");
		int num=sc.nextInt();
		float sub[] = new float[num];
		for (int i=0; i<num; i++)
		{
			System.out.println("Enter the marks in Subject "+(i+1) + " out of 100");
			sub[i]=sc.nextFloat();
		}
		percent ob = new percent();
		float res = ob.calc(sub,num);
		System.out.println("Percentage is "+ res +"%");
	}
	public float calc(float s[],int n)
	{
		float sum=0;
		for (int i=0; i<n; i++)
			sum+=s[i];
		float res=sum/n;
		return res;
	}
}