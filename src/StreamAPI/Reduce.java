package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
public static void main(String[] args) {
	List<Integer> num= new ArrayList<Integer>();
	num.add(76);
	num.add(45);
	num.add(34);
	num.add(54);
	num.add(677);
	num.add(76);
	num.add(64);
	

	long cout=num.stream().count();
	System.out.println("Count is : "+cout);
	

	Optional<Integer> sumnum= num.stream().reduce(Integer::sum);
	System.out.println("Sum = "+sumnum.get());
}
}
