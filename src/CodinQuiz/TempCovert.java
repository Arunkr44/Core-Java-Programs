package CodinQuiz;

import java.util.Scanner;

public class TempCovert {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char choice;
	
	do {
		System.out.println("Enter a temperature in Celsius");
		double celsius =sc.nextInt();
		double fahrenheit= (9/5)* celsius + 32;
		if(fahrenheit<32) {
			System.out.println("Category : Very cold");
		}
		else if(fahrenheit>32 &&fahrenheit<50) {
			System.out.println("Category : Cold");
		}
		else if(fahrenheit>50 && fahrenheit<70) {
			System.out.println("Category : Mild");
		}
		else if(fahrenheit>70) {
			System.out.println("Category : Warm");
		}
		else {
			System.out.println("Category : Invalid input");
		}
		System.out.println("Do you want to continue ");
		choice=sc.next().charAt(0);
	}
	while(choice=='Y'||choice=='y'); {
		
	}
	
	System.out.println("You have exited");		
		
}
}
