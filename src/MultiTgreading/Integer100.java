package MultiTgreading;

public class Integer100 extends Thread {
	public void run() {
		System.out.println("Print Integers from 1 to 100 : ");
		for(int i=1;i<=100;i++) {
			System.out.print(i+ " ");
		}
	}
	public static void main(String[] args) {
		Integer100 obj=new Integer100();
		obj.start();
	}

}
