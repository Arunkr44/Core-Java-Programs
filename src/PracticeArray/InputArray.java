package PracticeArray;

import java.util.Scanner;

public class InputArray {
public static void main(String[] args) {
	int size,i;                                             //dynamic array
	Scanner r=new Scanner(System.in);
	System.out.println("enter the Size of the Array : ");
	size=r.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elements :");
	for(i=0;i<size;i++) {
		 a[i]=r.nextInt();
	}
	System.out.print("Your array is : ");
	for(i=0;i<size;i++) {
		System.out.print(a[i]+" ");
	}
}
}
