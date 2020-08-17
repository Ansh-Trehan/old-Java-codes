




import java.io.*;

public class DataStreamExample {
	
	public static void main(String args[]) throws IOException,FileNotFoundException
	{
		// File fi = new File("text.txt");
		// FileInputStream fin=new FileInputStream(fi);
		 FileInputStream fin=new FileInputStream("text.txt");  
		 int i=fin.read();  
         System.out.print((char)i);
         fin.close();    
	}

}
