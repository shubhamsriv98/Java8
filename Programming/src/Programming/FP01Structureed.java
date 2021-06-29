package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FP01Structureed {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(1,2,3,4,5));
		printAllNumberFromListStructure(al);
	}
	private static void printAllNumberFromListStructure(List<Integer> numbers) {
		for(int number:numbers) {
			System.out.println(number);
		}
	}
}
