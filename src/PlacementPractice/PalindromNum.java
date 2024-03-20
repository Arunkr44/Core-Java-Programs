package PlacementPractice;

public class PalindromNum {
public static void main(String[] args) {
	int num=1331;
	int temp=num;
	int rev=0,rem;
	while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(rev==num) {
		System.out.println("Palindrom Number");
	}
	else {
		System.out.println("Not a Palindrom Number");
	}
}
}
