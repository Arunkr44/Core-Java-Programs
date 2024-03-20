package PracticeArray;

public class DeclartionArray {
public static void main(String[] args) {
	int a[]=new int[3];    //static array
	a[0]=3;
	a[1]=2;
	a[2]=8;
//	a[3]=5;     //OutofBoundException
//	System.out.println("Your array is : "+a[2]);
	System.out.println("Your elements are : ");
	for(int i=0;i<3;i++) {
		System.out.println( a[i]);
	}
	
}
}
