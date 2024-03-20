package Array;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int num=sc.nextInt();
		int[] array = new int[num];
		
		System.out.println("Enter elements into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println("Our array is : " );
		for(int j=0;j<array.length;j++) {
			System.out.print( array[j]+" ");
		}
			
		
	}
}
