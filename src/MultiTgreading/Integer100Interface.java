package MultiTgreading;

public class Integer100Interface implements Runnable {
	
	public void run() {
		System.out.println("Print 1 to 100 using Runnable interface : ");
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
	}	
	public static void main(String[] args) {
		
	Integer100Interface obj=new Integer100Interface();
	Thread tr=new Thread(obj);
	tr.start();

}
}
