package pack1;

public class Opera {
	public int sum() {
		int a=10;
		int b =20;
		int c = a+b;
		System.out.println("Addition Value is :" +c);
		return c;
	}
	public void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("Substraction value is :"+c);
	}
	public static void main(String[] args) {
		System.out.println("Java is awesome");
		Opera obj=new Opera();
		obj.sum();
		obj.sub();
	}
}
