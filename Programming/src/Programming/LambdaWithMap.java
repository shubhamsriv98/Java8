package Programming;


import java.util.*;
import java.util.stream.Collectors;

public class LambdaWithMap {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		String s[]= {"shubh", "harry", "Nik","Rown","Ema"};
		
		List <Integer> li=Arrays.stream(arr).boxed().collect(Collectors.toList());
		li.stream().map(n -> n*n*n).forEach(System.out::println);
		
		List<String> li1=new ArrayList<>(Arrays.asList(s));
		li1.stream().map(n -> n.length()).forEach(System.out::println);
	}
}
