package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ClassF {
	 void meth1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(null);
		list.add(0, "zero");
		list.add(null);
		list.add(2, "TWO");
		list.add("FOUR");
		list.add(1, "ONE");
		list.remove(2);
		System.out.println(list);
	}

	 void meth2() {
		 ArrayList<String> fruitlist=new ArrayList<String>();
		 fruitlist.add("orange");
		 fruitlist.add("Apple");
		 fruitlist.add("Banana");
		 
		 int size=fruitlist.size();
		 String [] fruitArray =new String[size];
		 fruitArray =fruitlist.toArray(fruitArray);
		 
		 for(String str : fruitArray) {
			 System.out.print(str+ " " );
		 }
		 
	 }
	 void meth3() {
		 List<Integer> list=new ArrayList<Integer>();
		 list.add(20);
		 list.add(0,30);
		 list.add(2,40);
		 list.add(40);
		 Object element=list.get(1);
		 System.out.println(element);
	 }
	public static void main(String[] args) {
//		ClassF()
		ClassF obj1=new ClassF();
		obj1.meth1();
		System.out.println("=========================");
		obj1.meth2();
		System.out.println();
		System.out.println("+===========================+");
		obj1.meth3();
		
	}
}
