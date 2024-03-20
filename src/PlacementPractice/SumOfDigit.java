package PlacementPractice;

public class SumOfDigit {
public static void main(String[] args) {
	int num=0204;
	int sum=0;
	while(num!=0) {    // num>0
		sum=sum+num%10;
		
		num=num/10;
	}

	System.out.println("Sum of digits is "+sum);
}
}
