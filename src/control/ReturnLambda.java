package control;
interface ReturnTheValue {
	int Test(int a);
}
public class ReturnLambda {
	public static void main(String[] args) {
			
		ReturnTheValue rt=x->	
			x;	
		System.out.println(rt.Test(45));
	}
}
