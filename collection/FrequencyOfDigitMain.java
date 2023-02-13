package basic.programs.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FrequencyOfDigitMain {

	public static void main(String[] args) {
		
		FrequencyOfDigit feOfDigit = new FrequencyOfDigit();
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = Arrays.asList(10,30,10);
		int mostFrequentNo = feOfDigit.mostFrequent(list);
		System.out.println("Most frequent number is "+ mostFrequentNo);
		
		int listFrequent = feOfDigit.leastFrequent(list);
		System.out.println("Least frequent number is "+ listFrequent);
		
	}
}
