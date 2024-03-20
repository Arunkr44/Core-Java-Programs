package pack1;

public class ClassF {
public void meth1() {
	System.out.println("Hy meth 1");
}
public static void main(String[] args) {
	System.out.println("Start");
	ClassF fobj=new ClassF();
	new ClassF().meth1();
	ClassG n=new ClassG();
	n.show();
}
}
