package MultiTgreading;

public class ThreadClass extends Thread
{
	public void run() {
		System.out.println("This is Thread");
	}
	
	public static void main(String[] args) {
		ThreadClass obj=new ThreadClass();
		obj.start();
	}

}
