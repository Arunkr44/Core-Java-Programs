package pack1;

public class StringBufferBuilder {
	void meth1() {
		String s1="Java";
		StringBuffer buffer=new StringBuffer("Java");        //synchronized
		StringBuilder builder=new StringBuilder("Java");     // not synchronized
		
		s1.concat(" is awesome");
		buffer.append(" is awesome");
		builder.append(" is awesome");
		
		
		System.out.println(s1);
		System.out.println(buffer);
		System.out.println(builder);
		
	}
public static void main(String[] args) {
	StringBufferBuilder obj=new StringBufferBuilder();
	obj.meth1();
}
}
