package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPr {
	void meth1() {
		System.out.println("Implementing ArrayList :");
		ArrayList <Integer>al =new ArrayList<Integer>();       //using generics for homogeneous data
		al.add(10);            //Insertion order is maintained 
//		al.add("Arun");			//it allows heterogeneous data
//		al.add(null);			//null valued is allowed
		al.add(10); 			//Duplicates are allowed
		al.add(34);				//default capacity is 10 {it increases by half}
		al.add(22);				//it is available from java 1.2v 
		al.add(0);				//it is not Synchronized by default
		al.add(11);
		System.out.println(al);
		  
		
		System.out.println("size(): "+al.size());
		System.out.println("get(): "+al.get(4));
		
		System.out.println("Retriving data using for loop : ");
		
		for(int i =0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("==========================================");
		
		System.out.println(" Reteriving Data in reverse order :");
		for(int i=al.size()-1;i>=0;i--)  {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("==========================================");
		System.out.println("Reterivig data using for each loop :");
//		for(Object obj:al) {           //Object class
//		for(Object Integer:al) {
			for(int obj:al) {          //auto unboxing Integer into int
			System.out.print(obj+" ");
		}
			
			System.out.println();
			System.out.println("Retriving the data using Iterator interface " );
			Iterator i=al.iterator();
			while(i.hasNext()) {
				System.out.print(i.next()+ " ");
			}
			System.out.println();
			System.out.println("=============================================");
			System.out.println("isEmpty() :"+al.isEmpty());   //check the list is empty of not
//			al.clear();                   //clear All data of arrayList
			System.out.println("contains()"+ al.contains(10));  //check element present or not as boolean value
//			System.out.println("remove() "+ al.remove(2));    //take index number as parameter which we want to remove
			System.out.println("remove(Object()) "+ al.remove((Object)22));  //remove 22 element from list
			System.out.print(al+" ");
			System.out.println();
			al.add(1, 1200);        //add 1200 at index number 1
			System.out.print(al+" ");
			System.out.println();
			System.out.println("=========.sort()=======");
			Collections.sort(al); 
			System.out.println(al);
			System.out.println("=============.reverseorder()===========");
			Collections.sort(al, Collections.reverseOrder()); 
		
			System.out.println(al);
			
	}
	public static void main(String[] args) {
		ArrayListPr obj =new ArrayListPr();
		obj.meth1();
	}

}
