package MultiTgreading;

public class CriticalRes extends Thread {
	public void run() {
		criticalResource();
	}
	synchronized void criticalResource() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" has entered critical Resource");
		for(int i=1;i<6;i++) {
			System.out.println(name+" i value "+ i);
			
		}
		System.out.println(name+" has completed its Execution .");
	}
public static void main(String[] args) {
	CriticalRes obj=new CriticalRes();
	Thread t1=new Thread(obj);
	Thread t2 =new Thread(obj);
	t1.setName("Abhi");
	t2.setName("Arun");
	t1.start();
	t2.start();
	
     }
  }
