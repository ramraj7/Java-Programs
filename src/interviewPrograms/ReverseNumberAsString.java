package interviewPrograms;

import java.util.Scanner;

public class ReverseNumberAsString {

	public static void main(String[] args) {
		// reversing integer which ends with zero

		String str = "";

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		String realnum = String.valueOf(s.nextInt());
		
		System.out.println(realnum.length());

		for (int i = realnum.length() - 1; i >= 0; i--) {
			str = str + realnum.charAt(i);
		}
		System.out.println(str);
	}

}
