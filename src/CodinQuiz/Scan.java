package CodinQuiz;

import java.util.Scanner;

public class Scan {
public static void main(String[] args) {
	String s="test1,test2,test3";

	Scanner scan=new Scanner(s).useDelimiter("test");

	System.out.print(scan.next());

	System.out.print(scan.next());

	System.out.print(scan.next());

	scan.close();
}
}
