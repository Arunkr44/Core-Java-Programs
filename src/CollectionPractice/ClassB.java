package CollectionPractice;
import java.util.ArrayList;
import java.util.Iterator;
public class ClassB {
 
	void meth1() {
		System.out.println("Passing Our class Object into ArrayList ");
		ArrayList<ClassA> alist=new ArrayList<ClassA>();
		
		ClassA aobj1=new ClassA("Ram",101,"MCA");
		ClassA aobj2=new ClassA("Shyam",101,"BCA");
		ClassA aobj3=new ClassA("Aman",101,"M.ed");
		ClassA aobj4=new ClassA("Dalda",101,"Btech");
		ClassA aobj5=new ClassA("Ingi",101,"Photography");
		ClassA aobj6=new ClassA("Paro",101,"Mtech");
		
		alist.add(aobj1);
		alist.add(aobj2);
		alist.add(aobj3);
		alist.add(aobj4);
		alist.add(aobj5);
		alist.add(aobj6);
		
		
		/*
		  alist.add(new ClassA("Ram",101,"MCA"));
		  alist.add(new ClassA("Shyam",101,"BCA"));
		  alist.add(new ClassA("Aman",101,"M.ed"));
		  alist.add(new ClassA("Dalda",101,"Btech"));
		  alist.add(new ClassA("Ingi",101,"Photography"));
		  alist.add(new ClassA("Paro",101,"Mtech"));
		 */
		System.out.println(alist);
		System.out.println();
		System.out.println("Retriving Data using Iterator ");
		System.out.println();
		Iterator<ClassA> i= alist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		new ClassB().meth1();
	}
}
