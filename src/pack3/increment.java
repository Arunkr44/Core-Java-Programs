package pack3;

public class increment 
{
	void meth1() 
	{
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		a++;
		System.out.println(a);
	
	}
	public static void main(String[] args) {
		increment obj = new increment();
		obj.meth1();
	}
}
