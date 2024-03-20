package multipleInheritanceInterface;

interface A{
	void show();

}

interface B{
	void show();
	
}

public class Multiple implements A,B {
	
	public void show() {
		System.out.println("Interface A and B");
	}
	
	public void meth() {
		System.out.println("Interace Implementation");
	}
	public static void main(String[] args) {
		Multiple m=new Multiple();
		m.show();
		
		
	}
}
