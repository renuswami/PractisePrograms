package programs.string;

import java.util.Scanner;

public class AnagramStringMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		AnagramString anagramString = new AnagramString();
		
		System.out.println("Please enter the two strings ot check strings are anagram of not");
		
		anagramString.isAnagram(scanner.nextLine(), scanner.nextLine());
		
	}

}
