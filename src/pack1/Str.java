package pack1;

public class Str {
	void meth1() {
		String s1="Java";
		String s2=new String("Java");
		String s3="Java";
		String s4=new String("JAVA");
		
		boolean ass=s1==s4;
		System.out.println("== operator is check address location : "+ass);
	
//		System.out.println( s1==s3);
		System.out.println("equals is going to check the content of the string : "+s1.equals(s4));
		System.out.println(".equalsIgnoreCase(s4) : "+s1.equalsIgnoreCase(s4));		
		System.out.println(s2.length());
	}
	public static void main(String[] args) {
		new Str().meth1();
	}
}
