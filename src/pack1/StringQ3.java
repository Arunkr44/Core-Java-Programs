package pack1;

public class StringQ3 {
	public String makeOutWord(String out,String word)
	{
		return out.substring(0,2)+word+out.substring(2,4);
	}
public static void main(String[] args) {
	StringQ3 obj=new StringQ3();
	String result=obj.makeOutWord("<<>>", "word");
	System.out.println(result);
 }
}
