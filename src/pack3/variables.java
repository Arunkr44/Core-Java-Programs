package pack3;

public class variables {
		int a=10;          //instance variable
		static int b =30;   //static variable
	
	void meth1() 
	{
		int c =20;                 //local variable
		int a =40;
		int b=400;
		
		//first priority will be given to local variable if instance or static variable has same name as local variable
		 
		System.out.println("Instance variable a :" +new variables().a);
		System.out.println("Local variable : "+a);
		System.out.println("Local variable : "+b);
		System.out.println("Local variable : "+c);
		
		System.out.println("========================");
		System.out.println("static variable : "+ new variables().b);
		System.out.println("static variable : "+ variables.b);
		
	}
	public static void main(String[] args) {
		System.out.println("This is variables");
		variables obj = new variables();
		obj.meth1();
	}
}
