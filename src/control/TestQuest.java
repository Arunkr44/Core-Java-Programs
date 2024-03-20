package control;

public class TestQuest extends Thread {

	public void run() {

		try {

		sleep(5000);

		} catch (InterruptedException e) {

		System.out.println("Exception " + e);

		}

		}


	
		public static void main(String[] args) {
			TestQuest thread1 = new TestQuest();

			long startTime = System.currentTimeMillis();

			thread1.start();

			System.out.print("Time required to execute thread1 is "

			+ (System.currentTimeMillis() - startTime));
		}
}
