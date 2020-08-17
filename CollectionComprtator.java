/*Using Comparator

Unlike Comparable, Comparator is external to the element type we are comparing. 
It’s a separate class. We create multiple separate classes (that implement Comparator) 
to compare by different members.

Collections class has a second sort() method and it takes Comparator.
 The sort() method invokes the compare() to sort objects.

To compare movies by Rating, we need to do 3 things :

Create a class that implements Comparator
 (and thus the compare() method that does the work previously done by compareTo()).
Make an instance of the Comparator class.
Call the overloaded sort() method,
 giving it both the list and the instance of the class that implements Comparator.*/

//A Java program to demonstrate Comparator interface

import java.util.*;
class Employee //implements Comparator<Employee>
{
	String name;
	int id;
	double salary;
	Employee(){}
	Employee(String name, int id,double salary)
	{
		this.name=name;this.id=id;this.salary=salary;
	}
	public String toString()
	{
		return "name="+name+"id="+id+"salary="+salary;
	}
	
}
class SortById implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return(e1.id>e2.id?1:-1);
	}
}
class SortBySalary implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return(e1.salary>e2.salary?1:-1);
	}
}
class CollectionComprtator
{
public static void main(String arr[])
{
  ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("rohit",12, 12000.0));
		al.add(new Employee("rohit1",4, 11000.0));
		al.add(new Employee("rohit2",16, 4000.0));
		System.out.println(al);
		//if TreeSet is used no explicit sorting required
		Collections.sort(al,new SortById());
		System.out.println(al);	
		Collections.sort(al,new SortBySalary());
		System.out.println(al);	
}
}