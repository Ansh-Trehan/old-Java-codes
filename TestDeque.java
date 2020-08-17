import java.util.*;
class TestDeque
{
public static void main(String[] args)
{
Deque<Integer> dq=new ArrayDeque<Integer>();

dq.offer(1);
dq.addFirst(2);
dq.addLast(3);
dq.offerLast(4);//same as offer but being preferred because we are designing a deque
System.out.println(dq); //[2,1,3,4]

System.out.println(dq.getFirst());  //2
System.out.println(dq.peekFirst());  //2
System.out.println(dq.getLast());    //4
System.out.println(dq.peekLast());   //4
System.out.println(dq);  //[2,1,3,4]

dq.removeFirst();
dq.removeLast();
System.out.println(dq);  //[1,3]

System.out.println(dq.pollFirst());  //1
System.out.println(dq.pollLast());   //3
System.out.println(dq); // []


System.out.println(dq.pollFirst());  //null
System.out.println(dq.pollLast());   //null


System.out.println(dq.removeFirst());  //exception
System.out.println(dq.removeLast());
}
}