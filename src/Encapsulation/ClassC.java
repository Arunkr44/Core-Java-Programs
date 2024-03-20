package Encapsulation;

public class ClassC {
	private String stuName;
	private int stuRollNumber;
	
	
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
		System.out.println("Name assigned");
	}
	public int getStuRollNumber() {
		return stuRollNumber;
		
	}
	public void setStuRollNumber(int stuRollNumber) {
		this.stuRollNumber = stuRollNumber;
		System.out.println("Roll number assigned");
	}
	
	//alt+shift+s to get getters and setters method
}
