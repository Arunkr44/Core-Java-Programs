package pack1;

public class StringQ5 {
	public String firstTwo(String str)
	{
		if(str.length()>2) {
		return str.substring(0,2);
		}
		return str;
	}
public static void main(String[] args) {
	StringQ5 obj=new StringQ5();
	String result=obj.firstTwo("H");
	System.out.println(result);
}
}
