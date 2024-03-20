package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MaxMin {
public static void main(String[] args) {
	List<Integer> nums=new ArrayList<Integer>();
	nums.add(234);
	nums.add(525);
	nums.add(4553);
	nums.add(53);
	nums.add(56456);
	nums.add(5335);
	nums.add(3463);
	nums.add(436);
	Stream<Integer> strm=nums.stream();
	
	int max_num=strm.max((x,y) ->x>y?1:-1).get();
	System.out.println("Max value is : " + max_num);
	
	int min_num=nums.stream().min((x,y) ->x<y?-1:1).get();
	System.out.println("Min_Value is : "+min_num);
}
}
