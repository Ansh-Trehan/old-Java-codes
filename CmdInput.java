public class CmdInput
{
	public static void main(String[] args)
	{
		System.out.println("Length is " + args.length);
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}