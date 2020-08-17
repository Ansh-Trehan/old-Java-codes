import java.io.*;
public class SerializationDemo {
	public static void main(String args[]) {
		try {
			MyClass object1 = new MyClass("Hello", -7, 2.7e10);
			System.out.println("object1: " + object1);
			FileOutputStream fos = new FileOutputStream("serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		      }
		catch(IOException e) {
			System.out.println("Exception during serialization: " + e);
			System.exit(0);
		      }
}
}