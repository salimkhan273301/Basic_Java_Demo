package ForLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Ener the number:");
		int n = sc.nextInt();
		sc.close();
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}

}
