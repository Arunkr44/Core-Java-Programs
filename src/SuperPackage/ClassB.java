package SuperPackage;

public class ClassB extends ClassA{
	void meth2() {
		System.out.println("meth2 called from classB");
		super.meth1();
	}
	ClassB(){
		System.out.println("ClassB default Constructor");
		super.meth1();
	}
	ClassB(int a){
		super(" : java is Awesome");
//		this(); // C.E. we can not use both this() and super() both inside a Single Co	nstructor
		System.out.println("Parametrized constructor ClassB "+a);
	}
	public static void main(String[] args) {
//		new ClassB().meth2();
		new ClassB(1000).meth2();
	}
}
