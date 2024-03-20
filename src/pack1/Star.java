package pack1;
public class Star {
	void meth1() {
		System.out.println("This is Meth1");
		return ;
	}
	int meth2(int a ,int b) {
		System.out.println("This is  meth2");
		return a+b;
	}
	 public static void main(String[] args) {
		System.out.println("hy");
		Star obj = new Star();
		obj.meth1();
		int x=obj.meth2(2,3);
		System.out.println(x);
	}
}
