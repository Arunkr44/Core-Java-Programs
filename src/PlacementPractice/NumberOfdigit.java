package PlacementPractice;

public class NumberOfdigit {
public static void main(String[] args) {
	int num=2434434;
	int count=0;
	while(num>0) {	
		num=num/10;
		count++;
		
	}
	System.out.println("number of digits are : "+count);
}
}
