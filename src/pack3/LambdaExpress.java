package pack3;

public class LambdaExpress {
	void show() {
		System.out.println("Implementing Lambda Expression ");
		InterfaceA x=()->System.out.println("Java is Awesome");
		x.meth1();
		
		InterfaceB y=(int p,int q)->System.out.println("Addition "+(p+q));
		y.meth2(33, 24);
		
		InterfaceC z=(int d,int e)->  {
			if(d>e) {
				System.out.println("print if block executed ");
				return 100;
			}
			else {
				System.out.println("Else block executed ");
				return 700;
			}
		};
		int result=z.meth3(33, 320);
		System.out.println("meth3() is returing : "+ result);
	}
public static void main(String[] args) {
	new LambdaExpress().show();
        }
  }
