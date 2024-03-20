package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterApi {
public static void main(String[] args) {
	List<Integer> nums=new ArrayList<Integer>();
	nums.add(54);
	nums.add(65);
	nums.add(23);
	nums.add(65);
	nums.add(76);
	nums.add(22);
	nums.add(86);
	Stream<Integer> numStrm=nums.stream();
	
//	List<Integer> newLst=(List<integer>)
			Stream<Integer> rs =numStrm.filter(n->n>60);
			rs.forEach(System.out::println);
	
}
}
