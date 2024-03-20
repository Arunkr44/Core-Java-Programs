package CollectionPractice;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPr {
	void meth1() {
		System.out.println("implementing LinkedList : ");
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(1);                   //insertion order is maintained
		ll.add("Java");				//Heterogeneous data is allowed
		ll.add(null);				//null is allowed
		ll.add(12);					//duplicates are allowed
		ll.add(543);                //it is not-Synchronized
		ll.add(12);                 //default capacity is zero
		ll.add(10);                 //data will be stored in the form of NODES
		ll.add(110);
		ll.add(1000);

		System.out.println(ll);
		System.out.println("Retriving data using for each loop ");
		for(Object oj:ll) {
			System.out.print(oj+ " ");
		}
		System.out.println();
		System.out.println("=================================");
		System.out.println("retriving data using ListIteartor ");
		ListIterator<Object> li=ll.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		System.out.println("========================================");
		while(li.hasPrevious()) {
			System.out.print(li.previous()+ " ");
		}
		System.out.println();
		System.out.println("==============Methods============");
		System.out.println("getFirst(): "+ll.getFirst());
		System.out.println("getLast()" +ll.getLast());
		System.out.println(ll);
		System.out.println("removeFirst() : "+ ll.removeFirst());    //1
		System.out.println(ll);
		ll.add(1,"india");
		System.out.println(ll);
		
	}

	public static void main(String[] args) {
		LinkedListPr obj=new LinkedListPr();
		obj.meth1();

	}
}
