import java.util.Scanner;
class Student
{
	String name;
	double cgpa;
	String branch;
	Student()
	{
		name="";
		cgpa=0.0;
		branch="";
	}
	Student(String n, double c, String b)
	{
		name=n;
		cgpa=c;
		branch=b;
	}
	public void setData(String n, double c, String b)
	{
   		name=n;
		cgpa=c;
		branch=b;
	}
}
class StudentData extends Student
{
	public void find_Eligible()
	{
		if(cgpa>6.5)
			System.out.println("\t"+name+"\t"+cgpa);
	}
}
public class CA
{
	public static void main(String[] args)
	{
		StudentData ob[]=new StudentData[5];
		for(int i=0;i<5;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name");
			String n=sc.next();
			System.out.println("Enter CGPA");
			Double c=sc.nextDouble();
			System.out.println("Enter Branch");
			String b=sc.next();
			ob[i] = new StudentData();
			ob[i].setData(n,c,b);
		}
		for(int i=0;i<5;i++)
			ob[i].find_Eligible();
	}
}
