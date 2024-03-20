package pack2;

public class Threading implements Runnable {
	public void run() {
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	Threading obj=new Threading();
	Thread t=new Thread(obj);
	t.start();
//	obj.start();
}

}
