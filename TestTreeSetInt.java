import java.util.*;

 public class TestTreeSetInt 
       {
 	public static void main(String[] args)
         {
 
		 TreeSet<Integer> al=new TreeSet<Integer>();  
  al.add(10);  
  al.add(5);  
  al.add(42);  
  al.add(24);  
  al.add(98);  
  al.add(87);  
  al.add(64);  
  al.add(23);  
  //Traversing elements  
  Iterator<Integer> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }

 // Use the methods in SortedSet interface
		 System.out.println("first(): " + al.first());
 		System.out.println("last(): " + al.last());
 		System.out.println("headSet(): " + al.headSet(87));
 		System.out.println("tailSet(): " + al.tailSet(23));
           }
     }
