package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FP02Structure {
	public static boolean isEven(Integer n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		List l=Arrays.asList(arr);
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.stream()
		.filter(FP02Structure::isEven)//only Allow Even numbers 
		.forEach(System.out::println);//Method Refrence
	}
}
