public class StringExample
{
	public static void main(String[] args)
	{
		String s="Hello Students";
		String s1="Hello students";
		System.out.println(s.charAt(3));
		System.out.println(s.startsWith("hello"));
		System.out.println(s.endsWith("ents"));
		boolean b=s.endsWith("ents");
		System.out.println(b);
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.length());
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.indexOf('s',10));
		System.out.println(s1.lastIndexOf('s'));
		System.out.println(s1.indexOf('s',12));
		String ss="one,two,three";
		String[] sa=ss.split(",");
		System.out.println(sa[0]);
		System.out.println(sa[1]);
		System.out.println(sa[2]);
		String str = "Hello World";
		int length = str.length();
		String s11 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		String s4 = new String("Welcome to Java");
	}
}