package CollectionPractice;

public class ClassA {
 
	String studentName;
	int studentId;
	String studentDept;
	public ClassA(String studentName,int studentId,String studentDept) {
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentDept=studentDept;	
	}
	@Override
	public String toString() {
		return "ClassA [studentName=" + studentName + ", studentId=" + studentId + ", studentDept=" + studentDept + "]";
	}
	
	/*
	 public String toString() {
	 return getClass().getName() + "@"+Integer.toHexString(hascode());
	 */
	
	
}
