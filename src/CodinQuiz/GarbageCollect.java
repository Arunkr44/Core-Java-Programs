package CodinQuiz;

public class GarbageCollect {

	void meth1() {
		System.out.println("Meth1 Called ");
	}
	@Override
	protected void finalize() {
		System.out.println("Garabage Collector");
	}
	public static void main(String[] args) {
		GarbageCollect aobj=new GarbageCollect();
		GarbageCollect bobj =new GarbageCollect();
		
		
		aobj.meth1();
		System.gc();
		System.out.println("Line 1");
		bobj=aobj; //   after this Garabage collector executes    
		System.gc();
		System.out.println("Line 2");

	}
}
