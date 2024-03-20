package CollectionPractice;

import java.util.LinkedList;
import java.util.List;

public class QueuePr {
  void meth1() {
	  List<Object> li=new LinkedList<Object>();
	  LinkedList<Object> ll=new LinkedList<Object>();
	  
	   	li.add(32);
//	   	li.offer(74);
	   		
	   	ll.add(234);
	   	ll.offer(54);
	   	ll.offer(5);
	   	ll.offer(8);
	   	ll.offer(4);
	   	ll.offer(14);
	   	ll.offer(64);
	   	System.out.println(ll);
	   	System.out.println(ll.remove());
	   	System.out.println(ll);
	   	System.out.println(ll.poll());
	   	System.out.println(ll);
	   	
	   	
	   	
  }
  public static void main(String[] args) {
	QueuePr obj=new QueuePr();
	obj.meth1();
}
}
