package secondTask;

import java.util.Scanner;

public class pentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (1 == 1) {

			int downDepth1 = scan.nextInt(); // ù��° ��ĭ ��������
			
			if ( downDepth1 == 77 ) {
				break;
			}
			
			int centerDepth = 1 + downDepth1;
			int addDepth = (downDepth1 + 1) / 2;
			int downDepth2 = downDepth1 + addDepth;
			int centerStar = 1 + (downDepth1 * 6);

			// downDepth1 = 1 downDepth2 = 2 : 3
			// ���� ���� Star = (1 + downDepth1 * 6)
			// ���� ó�� = (downDepth1 - 1) * (" ")
			// �� ó�� = (downDepth1 + 1) / 2 �� ��
			// �� �߰� = downDepth1 + ��ó��

			for (int i = 1; i < (downDepth1 + 2); i++) {

				for (int j = 0; j < (centerDepth - i); j++) {
					System.out.print("   ");
				}

				for (int j = 0; j < (i - 1) * 2; j++) {
					System.out.print("***");

				}

				System.out.print("*");

				for (int j = 0; j < (centerDepth - i); j++) {
					System.out.print("   ");
				}

				System.out.println();
			}

			// * ��ü �� : centerStart

			for (int i = 1; i < downDepth2 + 1; i++) {

				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < centerStar - (2*i); j++) {
					System.out.print("*");
				}

				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				
				System.out.println();
			}
		}
	}
}
