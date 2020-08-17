
import java.io.*;
class FileInputOutputCopy{
public static void main(String args[]) throws IOException {
  FileInputStream fin = null;
  FileOutputStream fout = null;
  int i;
  try {
    fin = new FileInputStream("in.txt");
    fout = new FileOutputStream("out.txt",true);
    
    while((i = fin.read())!=-1)
      fout.write(i);
    }
  
  catch(IOException e)
    { 
	  System.out.println(e); 
	 }
  finally
    {    
	  if(fin!=null) 
		  fin.close();
    if(fout!=null)
    	fout.close();
    }  	
  }	
}
