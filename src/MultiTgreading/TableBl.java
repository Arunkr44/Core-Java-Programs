package MultiTgreading;
  class MyTable{
	  synchronized public void table(int n) {
		for(int i=1;i<11;i++) {
			System.out.println(n*i);
		}
	}
}
class MyThread1 extends Thread{
	public void run() {
		MyTable t=new MyTable();
		t.table(5);
		System.out.println("========================");
	}
}
class MyThread2 extends Thread{
	public void run() {
		MyTable t=new MyTable();
		t.table(8);
	}
}
public class TableBl {
	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		MyThread2 m2=new MyThread2();
		Thread t=new Thread(m1);
		Thread t2=new Thread(m2);
		t.start();
		t2.start();
	}
}
