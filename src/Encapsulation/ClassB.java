package Encapsulation;

import java.util.Scanner;

public class ClassB {
	void meth1() {
		Scanner sc=new Scanner(System.in);
		ClassA aobj=new ClassA();
		System.out.println("Enter your name ");
		String name =sc.nextLine();
		System.out.println("Enter your roll number ");
		int rollNumber=sc.nextInt();
		System.out.println("Name : "+name+" Roll Number : "+rollNumber);
		System.out.println("======accessing classA variable=======");
		aobj.stuName=name;
		aobj.stuRollNumber=rollNumber;
		System.out.println("Name : "+name+" Roll Number : "+rollNumber);
	}
	public static void main(String[] args) {
		ClassB  obj=new ClassB();
		obj.meth1();
	}
}
