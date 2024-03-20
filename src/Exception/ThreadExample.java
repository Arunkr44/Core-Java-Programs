package Exception;

class MyTable 
{
	synchronized public void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}

class MyThread3 extends Thread
{
	MyTable t=new MyTable();
	public void run()
	{
	t.table(5);
	}
}

class MyThread2 extends Thread
{
	MyTable t=new MyTable();
	public void run()
	{
	t.table(8);
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		MyThread3 th1 = new MyThread3();
		MyThread2 th2 = new MyThread2();
		th1.start();
		th2.start();

	}
}