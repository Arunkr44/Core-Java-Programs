package pack2;

public class StarA 
{
	void star1(){
		int i,j;
		for(i=1;i<5;i++) 
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	void star2() {
		int i,j;
		for (i=1;i<=3;i++) {
			for(j=3;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	public static void main(String[] args) {
		System.out.println("Star Patterns");
		StarA obj=new StarA();
		obj.star1();
		obj.star2();
	}
	
}
