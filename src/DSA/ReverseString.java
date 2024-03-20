package DSA;

public class ReverseString {
public static void main(String[] args) {
	
//	String name="Arun kumar";
	String name="Sandeep kumar";
	int len=name.length();
	String rev="";
	int i;
	
	for(i=len-1;i>=0;i--) {
		rev=rev+name.charAt(i);
	}
	System.out.print("Reversed String is : "+rev);
}
}
