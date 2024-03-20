package PatternPractice;

public class SpacePattern {
	void simNum() {
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void numRev() {
		for(int i=1;i<=4;i++) {
			for(int k=1;k<=4-i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void pyramid() {
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	SpacePattern obj=new SpacePattern();
//	obj.simNum();
//	obj.numRev();
	obj.pyramid();
	
}
}
