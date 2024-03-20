package MultiTgreading;

public class ClassD {
public static void main(String[] args) {
	final String A="Java";
	final String B="Python";
	
	Thread t1=new Thread()
	{
		public void run() 
		{
			synchronized (A) 
			{
				System.out.println("Thread 1 is locked On A");
				try 
				{
					Thread.sleep(100);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (B) {           //Thread 1 will be waiting for Python
					System.out.println("Thread 1 locked on B");
				}
				System.out.println("no dead lock");
			}
		}
	};
	Thread t2=new Thread() {
		public void run() {
			synchronized (B)   //python is held by Thread 2
			{
				System.out.println("Thread 2 is locked on B");
				try {
					Thread.sleep(2000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			/*	synchronized (A) {
					System.out.println("Thread 2 locked On A");
				}
			*/	
			}
			System.out.println("no deadLock");
		}
	};
	t1.start();
	t2.start();
}
}
