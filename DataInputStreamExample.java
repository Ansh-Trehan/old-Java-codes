import java.io.*;

public class DataInputStreamExample {
	public static void main(String args[]) throws IOException,FileNotFoundException {
		
		FileInputStream fin = new FileInputStream("text.txt");
		
		int i=0;    
        while((i=fin.read())!=-1)   
         System.out.print((char)i);    
        
        fin.close();
            
		
	}

}
