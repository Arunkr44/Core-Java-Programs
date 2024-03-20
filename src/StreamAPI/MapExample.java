package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
public static void main(String[] args) {
	List<String> fruits=Arrays.asList("Banana","Watermelon","Carrot","Apple");
	Stream<String> strm=fruits.stream();
	
	Stream<String> resultStrm=strm.map((xy) -> {return xy.toLowerCase();});
	
	resultStrm.forEach(System.out::println);
}
}
