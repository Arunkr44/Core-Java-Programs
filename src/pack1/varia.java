package pack1;

public class varia 
{
	int x=10;
	static int y=20;
 void meth1() {
	 System.out.println("Instance variable x: " + x);
	 System.out.println("static variable y: " + y);
 }
 static void meth2() {
	 System.out.println("Meth2() called");
	 System.out.println("Instance variable x: " + new varia().x);
	 System.out.println("static variable y: " + y);
 }
 public static void main(String[] args) {
	varia obj = new varia();
//	obj.meth1();
	System.out.println("=================================");
	obj.meth2();			//By creating an object				
	varia.meth2();         //by using className 
	meth2();       // by using meth name or 	identifier name
}
	
}
