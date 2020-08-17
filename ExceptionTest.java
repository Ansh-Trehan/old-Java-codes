import java.util.Scanner;
import java.*;
class MyException extends Throwable
{
	public MyException(int i)
	{
		System.out.println("You Entrered " +i);
	}
}
public class ExceptionTest
{
	public void show(int i) throws MyException
	{
		if (i>100)
			throw new MyException(i);
		else
			System.out.println(i+" is less than 100 it is ok");
	}
	public static void main(String[] args)
	{
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		ExceptionTest t=new ExceptionTest();
		try
		{
			t.show(i);
			t.show(j);
		}
		catch (MyException e)
		{
			System.out.println("catched exception is "+e9586);
		}
	}
}