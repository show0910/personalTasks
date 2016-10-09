package secondTask;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class randomPuzzle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> cloneList = new ArrayList<Integer>();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		int search = 0;
		int num = 0;
		int k = 0;

		while (1 == 1) {

			list.clear();

			int length = scan.nextInt();

			int[][] array = new int[length][length];

			for (int i = 1; i < length + 1; i++) {
				list.add(i);
			}

			Collections.shuffle(list);

			for (int i = 0; i < length; i++) {
				array[0][i] = list.get(i);
			}

			for (int i = 1; i < length; i++) {

				cloneList.clear();
				cloneList = (ArrayList) list.clone();
				Collections.shuffle(cloneList);

				Loop: for (int j = 0; j < length; j++) {
					search = 0;
					num = cloneList.get(search);
					
					if (num==0) {
						System.out.println();
					}
					
					k = i;
					while (1 == 1) {
						k--;
						if (num == array[k][j]) { // 같은 것이 있는 경우 List에서 다른 것
													// 선택// search를 1 증가 k는 다시
													// 처음부터
							if (search == cloneList.size() - 1) {
								Loop1: for (int x = j - 1; x + 1 > 0; x--) {
									int aa = array[i][x]; // 마지막 수 num
									int valid = 0; // 이상 없을 때 0

									for (int bb = i - 1; bb + 1 > 0; bb--) {
										if (aa == array[bb][j]) {
											valid = 1;
											break;
										}
									}

									if (valid == 0) {

										for (int cc = i - 1; cc + 1 > 0; cc--) {
											if (num == array[cc][x]) {

											}

											array[i][j] = aa;
											array[i][x] = num;


											for(int sss=0; sss<cloneList.size();sss++) {
												System.out.print(cloneList.get(sss));
											}
											System.out.println();
											for (int ss = 0; ss < length; ss++) {
												for (int dd = 0; dd < length; dd++) {
													System.out.print(array[ss][dd] + " ");
												}
												System.out.println();
											}
											
											System.out.println();
											
											break Loop;	
											
											
										}

									}
								}
							}
							k = i;
							search++;
							
							num = cloneList.get(search);
							continue;
						}

						if (k == 0) {
							break;
						}
					}

					array[i][j] = cloneList.get(search);
					cloneList.remove(search);
					
					for (int ss = 0; ss < length; ss++) {
						for (int dd = 0; dd < length; dd++) {
							System.out.print(array[ss][dd] + " ");
						}
						System.out.println();
					}
					
					System.out.println();

				}

			}

			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}

			// System.out.println(dayTime.format(new
			// Date(System.currentTimeMillis())));
			// double start = System.currentTimeMillis();
			//
			//
			//
			// Collections.shuffle(list);
			//
			// for ( int i = 0 ; i < list.size(); i++) {
			// System.out.print(list.get(i)+ " ");
			// }
			//
			// System.out.println();
			//
			// list.remove(1);
			//
			// for ( int i = 0 ; i < list.size(); i++) {
			// System.out.print(list.get(i)+ " ");
			// }
			//
			// System.out.println();
			//
			// double end = System.currentTimeMillis();

			// System.out.println((end-start)/1000 + " 초 걸림"); // end-star를
			// 해준다음에
			// /1000 을 해줘야지 초단위가 나온다.

		}
	}

}
