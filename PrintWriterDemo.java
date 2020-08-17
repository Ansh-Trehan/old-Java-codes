



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;


public class PrintWriterDemo {

	public static void main(String args[])
	{
		String fileName = "lines.txt";
		PrintWriter writer= null;
		try {
			// writer = new PrintWriter(new File("text.txt"),"UTF-8");
		   //   writer = new PrintWriter(System.out,true);
		    // writer = new PrintWriter(new FileWriter("text.txt",true),true);
			// writer = new PrintWriter(fileName);
	writer = new PrintWriter(new FileOutputStream(new File("text.txt"),true));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int count=1; count<10; count++)
			writer.println("Line " +count);
		
		writer.append("hello");
		writer.append("hello");
	   
		//writer.flush();		
		writer.close();
	
		
		
	}
}
