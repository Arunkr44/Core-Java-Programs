package Encapsulation;

import java.util.Scanner;

public class ClassD {
	void meth1() {
		Scanner sc=new Scanner(System.in);
		ClassC cobj=new ClassC();
		System.out.println("Enter your name ");
		cobj.setStuName(sc.nextLine());
		
//		String name =sc.nextLine();		
//		cobj.setStuName(name);
		
		System.out.println("Enter your roll number ");
		cobj.setStuRollNumber(sc.nextInt());
		
//		int rollNumber=sc.nextInt();
		
		System.out.println("Student Name : "+cobj.getStuName());
		System.out.println("Student Roll number : "+cobj.getStuRollNumber());
		System.out.println("Class C : "+cobj.getClass());
		
		
		
	}
	public static void main(String[] args) {
//		ClassD dobj=new ClassD();
		new ClassD().meth1();
	}
}
