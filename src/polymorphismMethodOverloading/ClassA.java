package polymorphismMethodOverloading;

public class ClassA {
	void meth1() {
		System.out.println("Meth 1 ");
	}
	void meth1(int a) {
		System.out.println("Meth 2 ");
	}
    public void meth1(int a,String b) {
		System.out.println("Meth 3 ");
	}
	private void meth1(String a,int b) {
		System.out.println("Meth 4 ");
	}
	 protected void meth1(byte b) {
		System.out.println("Meth 5 ");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Java is Awesome");
		ClassA obj=new ClassA();
		obj.meth1();
		obj.meth1(23);
		obj.meth1(2,"Arun");
		obj.meth1("Arun",2);
		obj.meth1((byte)3);
		System.out.println("====================");
		main("arun");
		main(23);
	}
	public static void main(String s) {
		System.out.println("1st main method");
	}
	public static void main(int a) {
		System.out.println("2nd main method");
	}
}
