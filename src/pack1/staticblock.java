package pack1;

public class staticblock {
 static {
	 System.out.println("This is 1st");
 }
 public static void main(String[] args) {

	
	System.out.println("This is testing1");
	System.out.println("This is testing2");
	 
    }
 static {
	 System.out.println("This is 2nd");
 }
 static {
	 System.out.println("This is 3rd");
 }
}
