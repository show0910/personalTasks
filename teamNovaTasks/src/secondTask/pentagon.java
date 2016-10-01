package secondTask;

import java.util.Scanner;

public class pentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (1 == 1) {

			int downDepth1 = scan.nextInt(); // 첫번째 몇칸 내려갈지
			
			if ( downDepth1 == 77 ) {
				break;
			}
			
			int centerDepth = 1 + downDepth1;
			int addDepth = (downDepth1 + 1) / 2;
			int downDepth2 = downDepth1 + addDepth;
			int centerStar = 1 + (downDepth1 * 6);

			// downDepth1 = 1 downDepth2 = 2 : 3
			// 제일 많은 Star = (1 + downDepth1 * 6)
			// 공백 처리 = (downDepth1 - 1) * (" ")
			// 별 처리 = (downDepth1 + 1) / 2 의 몫
			// 밑 추가 = downDepth1 + 별처리

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

			// * 전체 별 : centerStart

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
