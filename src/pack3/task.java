package pack3;

public class task
{
	void meth1(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
		task obj = new task();
		obj.meth2(40,20);
	}
	void meth2(int c ,int d) {
		System.out.println(c-d);
	}
	 task() {
	System.out.println(10/2);
	}
	 task(int e) {
		 System.out.println(e*4);
			
	}
	public static void main(String[] args) {
	new task(10).meth1(10,20,30);
	}
	
}
