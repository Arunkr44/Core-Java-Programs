package SuperPackage;

public class ClassA {
	
	void meth1() {
		System.out.println("meth1() called from ClassA");
	}
	
	ClassA(){
		System.out.println("ClassA Default Constructor");
	}
	ClassA(String s){
	//		this();
	//		this.meth1();
		System.out.println("Parametrized Constructor ClassA "+s);
	}
}
