package Programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,4,5,5,6,10,7,5,2};
		
		
		List <Integer> li=Arrays.stream(arr).boxed().collect(Collectors.toList());
		li.stream()
				.sorted()
				.forEach(System.out::println);
		
	}
}
