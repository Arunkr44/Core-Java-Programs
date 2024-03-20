package pack3;

public class constructor 
{
	int studentRollNumber;
	String studentName;
	 
	constructor(int number,String name)
	{
		studentRollNumber=number;
		studentName=name;
		
	}
	public static void main(String[] args) {
		constructor obj = new constructor(23,"ram");
		constructor obj1 = new constructor(36,"VidutRd");
		System.out.println(obj1.studentRollNumber+"<===>"+obj1.studentName);
		System.out.println(obj.studentRollNumber+"<===>"+obj.studentName);
	}
}
/*For every instance is separate copy of instance variable will be maintained 
 so how many objects you have created in your class those many copies of 
 instance variables are available.*/
