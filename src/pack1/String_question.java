package pack1;

public class String_question {
	
	public String helloName(String name) {
//		String hello="Hello "+name+"!";
//		return hello;
//		return "Hello "+name+"!";
		return "Hello ".concat(name)+"!";
		
	}
public static void main(String[] args) {
	String_question obj=new String_question();
	String x=obj.helloName("X");
	System.out.println(x);
}
}
