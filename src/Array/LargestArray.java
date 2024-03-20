package Array;

public class LargestArray {
public static void main(String[] args) {
	int []array= {34,22,87,43,6,34,8};
	int largest=array[0];
	

	for(int i=0;i<array.length;i++) {
		if(largest<array[i]) {
//		array[i]=largest;
		largest=array[i];
		}
		
	}
	System.out.println("Largest element is "+largest);
}
}
