package pack3;

public class datatypes {

	int a;
	byte b;
	short s;
	long l;
	
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	
void meth1() {
	int i;
	System.out.println("Instance variable a is :" + a);
	System.out.println("Instance variable b is :" + b);
//	System.out.println("Local variable i is :" + i);
}
public static void main(String[] args) {
	new datatypes().meth1();
}
	
}
