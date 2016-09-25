package firstTask;

import java.io.IOException;
import java.util.Scanner;

public class fishingExpert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		caseNum cn = new caseNum();
		model md = new model();

		int onePage = 0;
		int fourPage = 0;
		int sixPage = 0;

		cn.zeroPage(md);

		while (1 == 1) {

			onePage = cn.onePage(md); // 메인 메뉴

			if (onePage == 1) { // 낚시터로 이동

				cn.threePage(md); // 낚시터 선택

				while (1 == 1) {
					fourPage = cn.fourPage(md); // 낚시터 선택 후 행동

					if (fourPage == 1) { // 미끼 선택 후 캐스팅
						cn.fivePage(md); // 미끼 선택

						sixPage = cn.sixPage(md); // 입질 여부

						if (sixPage == 1) { // 물었다.!

							cn.eightPage(md); //몇성 물고기인지 판단							
							int result = cn.ninePage(md); //물고기와 밀당 시작!!
							
							if ( result == 1 ) {
								
								cn.tenPage(md); // 물고기 잡았다.
								continue; // 낚시터 입장 화면
								
							} else if ( result == 2 ) {
								
								cn.elevenPage(); // 물고기 놓쳤다.
								continue;
							}
							
						} else if (sixPage == 2) { // 도망갔다.
							cn.sevenPage();
							continue;
						}

					} else if (fourPage == 2) { // 메인메뉴로 이동
						break;
					}
				}

			} else if (onePage == 2) { // 낚시대, 줄 상점으로 이동

				cn.twoPage(md);
				continue;

			} else if (onePage == 3) { // 낚시대 교환

				cn.thirteenPage(md);
				continue;

			}
		}

	}
}
