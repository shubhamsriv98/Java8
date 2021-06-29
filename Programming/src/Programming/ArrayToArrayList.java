package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToArrayList {
	public static int count=1;
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.add(6);
		System.out.println(list);
		
		List<Integer> li=new ArrayList<>();
		Collections.addAll(li, Arrays.stream(arr).boxed().toArray(Integer[]::new));
		System.out.println("===="+li);
		li.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		List<Integer> li1=Arrays.stream(arr).boxed().collect(Collectors.toList());
		li1.stream().forEach(ArrayToArrayList::alternate);
		
	}
	private static void alternate(int n) {
		
		if(count%2!=0) {
			System.out.println("==="+n);
		}
		count++;
	}
}
