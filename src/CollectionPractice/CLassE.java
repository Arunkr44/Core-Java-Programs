package CollectionPractice;
import java.util.ArrayList;
import java.util.Iterator;

public class CLassE {

	void meth1() {
		ArrayList<ClassD> li=new ArrayList<ClassD>();
		
		ClassD dobj1=new ClassD("Ram",201,20000,"Engineer");
		ClassD dobj2=new ClassD("Sita",202,20060,"Associate Engineer");
		ClassD dobj3=new ClassD("Geeta",203,206550,"Senior Engineer");
		
		li.add(dobj1);
		li.add(dobj2);
		li.add(dobj3);
		System.out.println(li);
		System.out.println();
		System.out.println("Using Iterator");
		Iterator<ClassD> it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args) {
		new CLassE().meth1();
	}
}
