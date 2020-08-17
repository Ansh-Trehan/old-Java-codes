import java.util.Scanner;
class attcalc
{
	long regno;
	int subno;
	double att[] = new double[subno];
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students :");
		n=sc.nextInt();
		double aggatt[] = new double[n];
		attcalc ob[] = new attcalc[n];
		attcalc ob1 = new attcalc();
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter registration number :");
			ob[i].regno=sc.nextInt();
			System.out.print("Enter number of subjects :");
			ob[i].subno=sc.nextInt();
			for(int j=0; j<ob[i].subno; j++)
			{
				System.out.print("Enter attendance in subject "+(j+1));
				ob[i].att[j]=sc.nextDouble();
			}
			aggatt[i] = ob1.calcagg(ob[i]);
		}
		for(int i=0; i<n;i++)
			if(aggatt[i]<75)
				System.out.println(ob1.regno);
	}
	public double calcagg(attcalc ob)
	{
		double agg=0;
		for (int i=0; i<ob.subno; i++)
			agg+=att[i];
		agg/=ob.subno;
		return agg;
	}
}