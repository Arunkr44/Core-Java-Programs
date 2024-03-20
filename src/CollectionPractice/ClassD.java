package CollectionPractice;

public class ClassD {
		String empName;
		int empId;
		int empSal;
		String empDept;
		
	public ClassD(String empName,int empId,int empSal,String empDept) {
		this.empName=empName;
		this.empId=empId;
		this.empSal=empSal;
		this.empDept=empDept;
			
	}

	@Override
	public String toString() {
		return  empName + " " + empId + "" + empSal + " " + empDept  ;
	}
	
}
