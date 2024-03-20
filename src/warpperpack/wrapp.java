
package warpperpack;

public class wrapp 
{
  
	void meth1() {
		int a=100;
		
		Integer i = Integer.valueOf(a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("Wrapper Tutorial");
		new wrapp().meth1();
	}
	
}
