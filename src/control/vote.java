package control;
import java.util.Scanner;
public class vote {
	

	
void Eligibility(int age) {
	
	if(age>180) 
	{
		System.out.println("Aur kitna Zinda rhega BSDk");
		}
    else if(age>=18) 
    {
    	System.out.println("You are eligible for voting");
	
	}
	else {
		System.out.println("Are are not eligible");
	}
	} 
  public static void main(String[] args) 
  {
	  Scanner a = new Scanner(System.in);
//		System.out.println("Enter your age");
//		int abc=a.nextInt();
	new vote().Eligibility(857);
}
}
