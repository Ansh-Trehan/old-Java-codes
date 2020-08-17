

import java.util.ArrayList;
import java.util.*;

public class TestArrayList
         {
public static void main(String[] args) 
       {
 // Create a list to store cities
	List<String> cityList = new ArrayList<String>();

 // Add some cities in the list
 	cityList.add("London");
	// cityList now contains [London]
 	cityList.add("Denver");
 // cityList now contains [London, Denver]
 	cityList.add("Paris");
 // cityList now contains [London, Denver, Paris]
	cityList.add("Miami");
 // cityList now contains [London, Denver, Paris, Miami]
 	cityList.add("Seoul");
 // contains [London, Denver, Paris, Miami, Seoul]
 	cityList.add("Tokyo");
 // contains [London, Denver, Paris, Miami, Seoul, Tokyo]

 	System.out.println("List size? "+ cityList.size());
 	System.out.println("Is Miami in the list? " +cityList.contains("Miami") );
 	System.out.println("The location of Denver in the list?"  + cityList.indexOf("Denver"));
 	System.out.println("Is the list empty? " +cityList.isEmpty() ); // Print false

 // Insert a new city at index 2
 	cityList.add(2, "Xian");
 // contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

 // Remove a city from the list
	cityList.remove("Miami");
 // contains [London, Denver, Xian, Paris, Seoul, Tokyo]

 // Remove a city at index 1
 	cityList.remove(1);
 // contains [London, Xian, Paris, Seoul, Tokyo]

 // Display the contents in the list
 	System.out.println(cityList.toString());

 Iterator<String> itr=cityList.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());
}
   ListIterator<String> iter=cityList.listIterator();  
System.out.println("traversing elements in forward direction...");  
while(iter.hasNext()){  
	//System.out.println(iter.nextIndex());
System.out.println(iter.next());  
}  
System.out.println("traversing elements in backward direction...");  
while(iter.hasPrevious()){ 
System.out.println(iter.nextIndex()); 
System.out.println(iter.previous());   
}

}
}