import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {

		// check for 1 digit number, negative number

		System.out.println("Enter a Positive Integer : ");

		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("PLEASE TRY WITH  POSITIVE INTEGER\n\n");
		} else if (num >= 0 && num < 10) {
			System.out.println(num + " IS PALINDROME \n\n");
		} else {

			// calculate the reverse
			// match the reverse with original

			int original = num;
			int reverse = 0;
			int rem;

			while (num != 0) {
				rem = num % 10;
				reverse = reverse * 10 + rem;
				num /= 10;
			}

			if (original == reverse) {
				System.out.println(original + "  IS PALINDROME\n\n");
			} else {
				System.out.println(original + " IS NOT PALINDROME\n\n");
			}

		}

	}

	// function to printPattern

	public void printPattern() {
		
		System.out.println("Enter the Pattern Size: ");
		
		int size = sc.nextInt();
		
		for(int i = size; i>0; i--) {
			for (int j=i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {

		boolean flag = false;

		System.out.println("Enter a Positive Integer : ");

		int num = sc.nextInt();

		if (num <= 1) {
			flag = true;
		} else {

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
		}

		if (!flag)
			System.out.println(num + " IS PRIME\n\n");
		else {
			if (num < 0)
				System.out.println("Please Try with a Positive number > 1 \n\n");

			if (num >= 0)
				System.out.println(num + " IS NOT PRIME\n\n");

		}

	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;
		int next;
		
		
		System.out.println("Please Enter the Size of Fibonacci Series: ");
		int size = sc.nextInt();
		
		if(size < 2 ) {
			System.out.println("Please Try with Integer Number > 2 \n\n");
		}
		if(size >= 2) {
			System.out.print(first + "  " +second);
		
			for (int i = 2; i<size; i++) {
				
				next = first + second;
				System.out.print("  "+next);
				first = second;
				second = next;
			}
		}
		
		
		
		
		System.out.println("\n\n");

	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}