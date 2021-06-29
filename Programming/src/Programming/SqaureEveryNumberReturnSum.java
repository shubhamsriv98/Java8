package Programming;


import java.util.*;
import java.util.stream.Collectors;

public class SqaureEveryNumberReturnSum {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		
		
		List <Integer> li=Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(li.stream()
				.map(n -> n*n)
				.reduce(0,(x,y)-> x+y));
		
	}
}
