package MultiTgreading;

public class RunnableInterface implements Runnable{
	public void run() {
		System.out.println("This is Runnable Interface Thread");
	}
public static void main(String[] args) {
	RunnableInterface obj=new RunnableInterface();
	Thread trd=new Thread(obj);
	trd.start();
	
}
}
5
finally block code
rest of the code

