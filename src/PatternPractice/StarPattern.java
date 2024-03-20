package PatternPractice;

public class StarPattern {
void revStar() {
	System.out.println("Reverse star");
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
void multiStar() {
	for(int i=1;i<=7;i=i+2) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	StarPattern obj=new StarPattern();
//	obj.revStar();
	obj.multiStar();
}
}
