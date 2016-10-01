package secondTask;

import java.util.Scanner;

public class dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (1 == 1) {

			int length = sc.nextInt();
		
			if (length == 777) {
				break;
			}
			
			int depth = 1 + (length * 2); // 3
			int centerDepth = (depth + 1) / 2; // 2

			for (int i = 1; i < (depth + 1); i++) {

				int a = Math.abs(centerDepth - i);

				for (int j = 0; j < a; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < depth - (a * 2); j++) {
					System.out.print("*");
				}

				for (int j = 0; j < a; j++) {
					System.out.print(" ");
				}

				System.out.println();

			}
		}
	}
}
