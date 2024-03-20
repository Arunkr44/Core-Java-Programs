package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetpr {
	void meth1() {
		System.out.println("implementing HashSet ");
		HashSet set = new HashSet<>();
		set.add(10);        //insertion order is not maintained
		set.add("java");	//Heterogeneous data is allowed
		set.add(null);		//null is allowed
		set.add(12); 		//Duplicates are not allowed
		set.add(45); 		//Default capacity is 16
		set.add(10);		//it is not Synchronized 
		set.add(33);
		
		System.out.println(set);
		
		System.out.println("size() "+set.size());
	//	System.out.println("get() "+set.get(2));    //HashSet does not store data in index form 
		System.out.println("====================");
		ArrayList al=new ArrayList(set);
		System.out.println("ArrayList "+al);
		System.out.println("get() :"+al.get(2));
		System.out.println("retriving data using Iterator interaface : ");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

	public static void main(String[] args) {
		HashSetpr obj=new HashSetpr();
		obj.meth1();
	}
}
