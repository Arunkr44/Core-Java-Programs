package control;

public class fd {
	
public static void main(String[] args) {
	
	  try  
      {  
      int data=50/0;
    		  System.out.println(data);; //may throw exception   
      }  
          //handling the exception  
      catch(ArrayIndexOutOfBoundsException e)  
      {  
          System.out.println(e);  
      }  
     finally {
    	 System.out.println("rest of the code");  
     }
  }  
    

}
		

