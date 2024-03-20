package pack1;

public class StringQ4 {
	public String extraEnd(String str)
	{
		String s=str.substring(str.length()-2);
		return s+s+s;
	}
public static void main(String[] args) {
	StringQ4 obj=new StringQ4();
	String result=obj.extraEnd("Heo");
	System.out.println(result);
}
}
