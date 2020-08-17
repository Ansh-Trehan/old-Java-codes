
import java.io.*;


 
// Displaying file property
class FileProperty 
{
    public static void main(String[] args) throws IOException{
        //accept file name or directory name through command line args
        String fname =args[0];
 
        //pass the filename or directory name to File object
        File f = new File(fname);
        File f1 = new File("testABC.txt");

        f.createNewFile();
        f1.createNewFile();
 
        //apply File class methods on File object
        System.out.println("File name :"+f.getName());
        System.out.println("Path: "+f.getPath());
        System.out.println("lastModified: " +new java.util.Date(f.lastModified()));
        System.out.println("Absolute path: " +f.getAbsolutePath());
        System.out.println("Canonical path: " +f.getCanonicalPath());
        System.out.println("Parent:"+f.getParent());
        System.out.println("Exists :"+f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable:"+f.canWrite());
            System.out.println("Is readable:"+f.canRead());
            System.out.println("Is a directory:"+f.isDirectory());
            System.out.println("File Size in bytes "+f.length());
        }

         System.out.println("Rename: "+f.renameTo(f1));
    }
}
