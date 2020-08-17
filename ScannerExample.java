import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		File f = new File("C://Users//Aditya//eclipse-workspace//MyJava//text.txt");
		File f1 = new File("abc.txt");
		
		
		PrintWriter writer= null;
		
		try {			
		   writer = new PrintWriter(f1);		    
		} catch (Exception e) {
			e.printStackTrace();
		}		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine())
		writer.println(in.nextLine());
		
		
		writer.flush();
		writer.close();
		
		
		
	}

}
