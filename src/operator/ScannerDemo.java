package operator;

import java.util.Scanner;


public class ScannerDemo {
	public static void main(String[] args) {
		// How to take input from console

		Scanner vaibhav = new Scanner(System.in); // Creating object of Scanner class

		while(true) {
			System.out.println("Enter Your 2 digit Number");
			int input = vaibhav.nextInt();
			System.out.println("What is Expected as per Requirement -");
			int expcetedAnswer = vaibhav.nextInt();

			int sum = input%10 + input/10;
			if(sum == expcetedAnswer) {
				System.out.println("Pass");
			}else {
				System.err.println("Fail - Expected - " +
						expcetedAnswer + ", but actual - " +sum );
			}
		}
	}
}
