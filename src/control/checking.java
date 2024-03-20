package control;

public class checking 
{
 void meth1(int a) {
	 System.out.println("=====meth1()called =====");
	 if(a==10) {
		 System.out.println("ye 10 hai");
	 }
	 else {
		 System.out.println("ye 10 nhi h ");
	 }
	 
 }
 public static void main(String[] args) {
	checking obj = new checking();
	obj.meth1(10);
}
}
