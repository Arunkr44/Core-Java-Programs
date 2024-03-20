package PlacementPractice;

public class OddEvenNum {
	
public static void main(String[] args) {
	int num=134;
	int evenCount=0;
	int oddCount=0;
	
	while(num>0) {      //num=134
		int rem=num%10;
		if(rem%2==0) {
			evenCount++;

		}
		else {
			oddCount++;
		}
		num=num/10;   //num=13
	}
	System.out.println("Even Count : "+evenCount);
	System.out.println("Odd Count : "+oddCount);
}
}
