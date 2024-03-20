package CodinQuiz;
import java.util.regex.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		String str = "PQR";

		int len = str.length();

		switch (len) {

		case 1: System.out.println("January"); break;

		case 2: System.out.println("February"); break;

		case 3: System.out.println("March"); break;

		default: System.out.println("Invalid month.");break;

		}

		}
}
