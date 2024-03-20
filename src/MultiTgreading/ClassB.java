package MultiTgreading;

public class ClassB extends Thread {
	public void run() {
		String name=Thread.currentThread().getName();
		synchronized (this) {
			for(int i=1;i<6;i++) {
				System.out.println(name+" i value "+ i);
				
			}
			System.out.println(name+" has completed its Execution .");
			System.out.println("===============");
		}
		for(int x=1;x<6;x++) {
			System.out.println(name+" x value "+x);
		}
	}
	
public static void main(String[] args) {
	ClassB obj=new ClassB();
	Thread t1=new Thread(obj);
	Thread t2 =new Thread(obj);
	t1.setName("First-Thread");
	t2.setName("Second-Thread");
	t1.start();
	t2.start();
}
}
