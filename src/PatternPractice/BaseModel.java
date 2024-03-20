package PatternPractice;

public class BaseModel {
	void SimNum() {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void TwoIncr() {
		for(int i=1;i<=7;i=i+2) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void RepeatIncre() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	void evenIncr() {
		for(int i=2;i<=8;i=i+2) {
			for(int j=1;j<=i;j++) {                   //trick 1 one way
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void sameNum() {                          //trick 2  second way
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=2*i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	void numInc() {
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void numEv() {
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=i*2;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void sameChar() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
		System.out.println("========== Another way ===========");
		for(char i='a';i<='e';i++) {
			for(char j='a';j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	void repeatChar() {
		for(char i='a';i<='e';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	
	BaseModel obj=new BaseModel();
//	obj.SimNum();
	obj.TwoIncr();
//	obj.RepeatIncre();
//	obj.evenIncr();
//	obj.sameNum();
//	obj.numInc();
//	obj.numEv();
//	obj.sameChar();
//	obj.repeatChar();
}
}
