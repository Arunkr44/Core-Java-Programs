package Array;

public class Test {
		int a=10;           //instance variable
		static int b=20;    //static variable
		void m1() {
			int c=30;       //local variable
			int a=400;
			System.out.println(new Test().a);             //10
			System.out.println(b);             //20
			System.out.println(c);             //30
		}
		
public static void main(String[] args) {
	Test obj=new Test();
	obj.m1();
//	new Test().m1();
	
}
}
