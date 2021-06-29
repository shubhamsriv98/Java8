package Programming;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaWithFilter {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		List<Integer> li=Arrays.stream(arr).boxed().collect(Collectors.toList());
		li.stream()
		.filter(number -> number%2==0) //Lambda Expression
		.forEach(System.out::println);
	}
}
