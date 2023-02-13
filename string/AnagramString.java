package programs.string;

import java.util.Arrays;

public class AnagramString {

	public void isAnagram(String s1, String s2) {

		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();

		if (s1.length() == s2.length()) {

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Strings are anagram..");
			} else {
				System.out.println("Strings are not anagram..");
			}

		} else {
			System.out.println("Strings are not anagram..");
		}

	}

}
