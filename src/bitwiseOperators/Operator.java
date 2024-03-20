package bitwiseOperators;

public class Operator {
	
	void And() {
		int a=19;   // 10011
		int b=7;	// 00111 
		
		// ........ 64 32 16 8 4 2 1 
		
					// 00011   =>3
		
		System.out.println("and opertor "+(a&b));
	      
	}

public static void main(String[] args) {
	
   }
}
