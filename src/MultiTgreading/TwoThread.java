package MultiTgreading;
class EvenThread extends Thread{
	public void run() {
		System.out.println("Even :");
		for(int i=1;i<50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
class OddThread extends Thread{
	public void run() {
		System.out.println("Odd : ");
		for(int i=1;i<50;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
public class TwoThread {
	public static void main(String[] args) {
		 OddThread od=new OddThread();
		  EvenThread ev=new EvenThread();
		 od.start();
		 try {
			od.join();                           //od will executes first then ev will start later 
		} catch (Exception e) {
			
		}
		 ev.start();
//		 ev.start();
	}
 
  
}
