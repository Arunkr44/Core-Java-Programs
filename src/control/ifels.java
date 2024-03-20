package control;

public class ifels 
{
   void meth1(int a)
   {
	   System.out.println("==meth1()==");
	   if(a<=5) {
		   System.out.println("if block executed");
	   }
	   else {
		   System.out.println("Else block executed");
	   }
	   System.out.println("meth1() executed");
   }
   public static void main(String[] args) {
	System.out.println("Start");
	ifels obj = new ifels();
	obj.meth1('A'-707654398);
			
}
}
