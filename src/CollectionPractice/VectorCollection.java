package CollectionPractice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorCollection {

	void meth1() {
		System.out.println("Implementing Vector ");
		Vector v=new Vector(); 	
		v.add(10);    //insertion order is maintained
		v.add("java");  //Heterogenous data is allowed
		v.add(null);   //null is allowed
		v.add(45);      //duplicates are allowed 
		v.add(35);   //it is Synchronized
		v.add(10);
		v.add(22);
		System.out.println("Vector List is : "+ v);
		System.out.println("==================================");
		System.out.println("get() : "+v.get(4));
		System.out.println("size() :"+v.size());
		System.out.println("capacity :"+v.capacity());
		System.out.println("==============================");
		System.out.println("reteriving data using enumeration :");
		Enumeration em = v.elements();
		while(em.hasMoreElements()) {
			System.out.print(em.nextElement()+ " ");
		}
		System.out.println();
		System.out.println("==========================");
		System.out.println("retriving data using Iteration : ");
		Iterator it =v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
	}
	void meth2() {
		System.out.println("passing our custome Object into Vector ;");
		Vector <ClassJ>ve=new Vector<ClassJ>();
		ClassJ obj1=new ClassJ(4,"Car");
		ClassJ obj2=new ClassJ(2,"Bike");
		ClassJ obj3=new ClassJ(4,"Truck");
		ClassJ obj4=new ClassJ(3,"Auto");
		ve.add(obj4);
		ve.add(obj3);
		ve.add(obj2);
		ve.add(obj1);
		
		Iterator i=ve.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		VectorCollection obj=new VectorCollection();
		obj.meth1();
		obj.meth2();
	}
}
