package pack1;

public class ObjectClas {
 void meth1() {
	 System.out.println("Hi");
 }
 protected void finalize() {                           //finalize method 
	 System.out.println("Garabage has been collected. ");
 }
 public static void main(String[] args) {
	ObjectClas obj1=new ObjectClas();
	ObjectClas obj2=new ObjectClas();
	ObjectClas obj3=new ObjectClas();
	int obj1hashCode=obj1.hashCode(); //hashCode generate unique Identification number for object
	int obj2hashCode=obj2.hashCode();
	System.out.println("obj1 :"+ obj1hashCode);
	System.out.println("obj2 :"+ obj2hashCode);
	System.out.println("==================================");
	boolean b=obj1.equals(obj2);		//equals() == Going to check the Address Locations of the objects
	System.out.println(b);                        //equals() ---- false
	boolean b1=obj1.equals(obj1);
	System.out.println(b1);
	System.out.println("==================================");
	System.out.println(obj1.getClass());            //returns fully qualified classname along with package name
	System.out.println("=====================================");
	System.out.println("obj1 "+obj1.toString()); //toString() is used to convert a java class Object into String represented format.
	System.out.println("======================================");
	
	obj3=null;
	System.gc();                       //manually calling Garbage collector
}
}
