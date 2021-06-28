package interviewPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
//Two Strings are said to be anagram when all characters in two string are matching.

		String s1 = "Ram raj";
		String s2 = "jarmar";

		String a = s1.replaceAll("\\s", "");
		String b = s2.replaceAll("\\s", "");

		boolean status = true;

		if (a.length() != b.length())
			status = false;
		else {
			char[] String1 = a.toLowerCase().toCharArray();
			char[] String2 = b.toLowerCase().toCharArray();

			Arrays.sort(String1);
			Arrays.sort(String2);

			status = Arrays.equals(String1, String2);
		}

		if (status)
			System.out.println("String is anagram");
		else
			System.out.println("String is not anagram");
	}

}
