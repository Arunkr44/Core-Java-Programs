package pack1;

public class StringQu2 {
	public String makeAbba(String a,String b) //a="Hi" b="Bye"
	{
		return a+b+b+a;
//		return a+b.concat(b+a) ;
	}
public static void main(String[] args)  
{
	StringQu2 obj=new StringQu2();
	String x=obj.makeAbba("Hi", "Bye");
	System.out.println(x);
}
}
