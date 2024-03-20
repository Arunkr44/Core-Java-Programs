package pack1;

public class ClassA 
{
	void meth() {
		System.out.println("Hy this is from ClassA");
	}
	public static void main(String[] args) {
		
		ClassA aobj1=new ClassA();
		ClassA aobj2=new ClassA();
		
		int x=aobj1.hashCode();
		int y = aobj2.hashCode();
		System.out.println(x);   
		aobj1.meth();
		System.out.println(y);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		
		boolean result1=aobj1.equals(aobj2);  
		System.out.println("Result1 : " + result1);   //false
		
		boolean result2 = aobj1.equals(aobj1);
		System.out.println("Result2 : "+ result2);   //true
	}
	
//	public static void main(String args[]) {
//		System.out.println("Hello ecllipse");
//		System.out.println("Hello ecllipsey");

	
}
