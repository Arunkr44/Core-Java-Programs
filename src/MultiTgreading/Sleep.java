package MultiTgreading;

class MyThread extends Thread{
	public void run() {
		for(int i=1;i<6;i++) {
			try {
//				Thread.sleep(2000);
				Thread.sleep(1000,20000);
			}
			catch (Exception e) {
			
			}
			System.out.println(i);
		}
	}
}
public class Sleep {
 public static void main(String[] args) {
	MyThread obj=new MyThread();
	obj.start();
}
}
