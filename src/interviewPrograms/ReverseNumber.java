package interviewPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 0;
		int reversenum = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();

		for (; num != 0;) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse num is" + reversenum);
	}

}
