package pack1;

public class PalindromString {
	public void meth1(String word)
	{
		
		String revString="";
		for(int i=word.length()-1;i>=0;i--)
		{
			
			revString+=word.charAt(i);
		
		}
		System.out.print(revString);
		if(revString.equals(revString)) {
			System.out.println("\nThis is a Palindrom String");
		}
		else {
			System.out.println("\nThis is not a Palindrom String");
		}
	
	}
public static void main(String[] args) {
	PalindromString obj=new PalindromString();
	obj.meth1("MadaM");
	
}
}
