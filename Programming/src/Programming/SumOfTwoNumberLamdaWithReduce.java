package Programming;

import java.util.*;
import java.util.stream.Collectors;

public class SumOfTwoNumberLamdaWithReduce {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		List <Integer> li=Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		int sum=findSum(li);
		System.out.println(sum);
	}
	
//	public static int sum(int a,int b) {
//		System.out.println(a+"=="+b);
//		return (a+b);
//	}
//	private static int findSum(List<Integer> li) {
//		return li.stream().reduce(0,SumOfTwoNumberLamdaWithReduce::sum);
//	}
	
//	private static int findSum(List<Integer> li) {
//		return li.stream().reduce(0,(x,y) -> x+y);
//	}
	
	
	  private static int findSum(List<Integer> li) { return li.stream()
	  .reduce(0,Integer::sum); }
	 
	 
}