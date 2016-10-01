package secondTask;

import java.util.ArrayList;
import java.util.Scanner;

public class circle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (1 == 1) {

			int length = sc.nextInt() + 1;
			
			if(length == 77 || length == 0) {
				break;
			}
			
			int centerStar = length * 10;
			int centerLine = (length + 1) / 3;
			int arraySize = length + 1;
			int lastLine = centerStar;
			int count = 0;

			for (int i = arraySize; i > 0; i--) {

				count++;

				if (count == 1 || count == 2) {
					list.add(i);
				} else if (count == 3) {
					list.add(i);
					list.add(i);
				} else if (count == 4) {
					list.add(i);
					list.add(i);
					list.add(i);
				} else {
					list.add(i);
					list.add(i);
					list.add(i);
					list.add(i);
				}
			}

			// Lastline 구하기
			int start = 0;
			for (int i = list.size(); i > 0; i--) {

				lastLine = (lastLine - 2 * (list.get(i - 1)));

				if (lastLine < 11) {
					start = i - 1;
					break;
				}

			}

			// 윗 부분 그리기
			for (int z = start; z < list.size(); z++) {
				count = 0;
				for (int i = z; i < list.size(); i++) {
					for (int j = 0; j < list.get(i); j++) {
						count++;
						System.out.print(" ");
					}
				}

				for (int i = 0; i < centerStar - (count * 2); i++) {
					System.out.print("*");
				}

				for (int i = z; i < list.size(); i++) {
					for (int j = 0; j < list.get(i); j++) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

			// 중간부분
			for (int i = 0; i < centerLine; i++) {
				for (int j = 0; j < centerStar; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			// 아래부분
			for (int z = list.size() - 1; z > start - 1; z--) {

				count = 0;
				for (int i = list.size() - 1; z < i + 1; i--) {
					for (int j = 0; j < list.get(i); j++) {
						count++;
						System.out.print(" ");
					}
				}

				for (int i = 0; i < centerStar - (count * 2); i++) {
					System.out.print("*");
				}

				for (int i = list.size() - 1; z < i + 1; i--) {
					for (int j = 0; j < list.get(i); j++) {
						System.out.print(" ");
					}
				}

				System.out.println();
			}
		}
	}
}
