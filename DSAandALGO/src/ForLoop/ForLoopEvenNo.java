package ForLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForLoopEvenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Please Enter the last Rang:");
		int last = sc.nextInt();
		for (int i = 0; i <= last; i++) {
			if (i % 2 == 0)
				System.out.print(i + ",");
		}

	}

}
