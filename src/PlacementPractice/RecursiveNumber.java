package PlacementPractice;

import java.util.Scanner;

public class RecursiveNumber {
	public static void printNum(int n) {
		System.out.println("Number is :"+n);
		if(n==1) {
			return;
		}
		else {
			printNum(n-1);
		}
		
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number you want to print : ");
	printNum(sc.nextInt());
}
}
