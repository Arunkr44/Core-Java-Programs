package PlacementPractice;

import java.util.Scanner;

public class Factorial {
	public static long fact(int n) {
		if(n>=1) {
			return n*fact(n-1);
		}
		else {
			return 1;
		}
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num=sc.nextInt();
			long x=fact(num);
			System.out.println("Factorial of " +x);
			
		}
}
