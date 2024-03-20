package Inheritance;

public class ClassB extends ClassA {

	void meth2() {
		System.out.println("ClassB method");
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		aobj.meth1();       //HAS-A-Relation
		
		System.out.println("======== After inheritance =======");
		ClassB bobj=new ClassB();
		bobj.meth1();  //IS-A-Relation   //child bobj accessing parent class ClassA method
		bobj.meth2();
		
//		ClassA ===========> Parent class
//		ClassB ===========> Child class
	}
}
