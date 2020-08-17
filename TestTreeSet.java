import java.util.*;

 public class TestTreeSet 
       {
 	public static void main(String[] args)
         {
 
		 TreeSet<String> treeSet=new TreeSet<String>();  
  treeSet.add("Ravi");  
  treeSet.add("Vijay");  
  treeSet.add("Ravi");  
  treeSet.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=treeSet.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }

 // Use the methods in SortedSet interface
		 System.out.println("first(): " + treeSet.first());
 		System.out.println("last(): " + treeSet.last());
 		System.out.println("headSet(): " + treeSet.headSet("Vijay"));
 		System.out.println("tailSet(): " + treeSet.tailSet("Ajay"));
           }
     }
