package CollectionPractice;

public class ClassG {

		int x=12;
		static int y=45;
		void m1() {
		System.out.println("Instance method m1()");
		}
		void m2() {
			System.out.println(x);
			new ClassG(500).m1();
			System.out.println(y);
			m3();
			System.out.println("instance method m2()");
		}
		static void m3() {
			System.out.println("static method m3()");
		}
		ClassG(int a){
			y=a;
		}
		ClassG(){
			y=50-38;
		}
		public static void main(String[] args) {
			System.out.println(y);
			m3();
			ClassG a=new ClassG();
			System.out.println(a.x);
			a.m2();
		}
}

