package Programming;

import java.util.ArrayList;
import java.util.Arrays;

public class FP01Functional {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		al.add(6);
		al.add(7);
		printAllNumberFromFuctional(al);
	}
	private static void print(int num) {
		System.out.println(num);
	}
	private static void printAllNumberFromFuctional(ArrayList<Integer> al) {
		al.stream().forEach(FP01Functional::print);	
		
	}
}
