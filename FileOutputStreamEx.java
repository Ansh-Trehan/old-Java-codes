




import java.io.FileOutputStream;  
public class FileOutputStreamEx {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("testoutp.txt");    
             String s="Welcome to java";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  