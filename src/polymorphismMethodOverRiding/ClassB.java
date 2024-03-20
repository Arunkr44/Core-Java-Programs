package polymorphismMethodOverRiding;

public class ClassB extends ClassA {
void meth1(int a ,int b) {
	System.out.println("ClassB meth");
	System.out.println("Substraction : "+(a-b));
 }
public static void main(String[] args) {
	ClassB obj=new ClassB();
	obj.meth1(21,12); //ClassB meth executes
	
	
	ClassA obj1 =new ClassA();
	
	obj1.meth1(9, 3); //ClassA meth executes
}
}
