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

			onePage = cn.onePage(md); // ���� �޴�

			if (onePage == 1) { // �����ͷ� �̵�

				cn.threePage(md); // ������ ����

				while (1 == 1) {
					fourPage = cn.fourPage(md); // ������ ���� �� �ൿ

					if (fourPage == 1) { // �̳� ���� �� ĳ����
						cn.fivePage(md); // �̳� ����

						sixPage = cn.sixPage(md); // ���� ����

						if (sixPage == 1) { // ������.!

							cn.eightPage(md); //� ��������� �Ǵ�							
							int result = cn.ninePage(md); //������ �д� ����!!
							
							if ( result == 1 ) {
								
								cn.tenPage(md); // ����� ��Ҵ�.
								continue; // ������ ���� ȭ��
								
							} else if ( result == 2 ) {
								
								cn.elevenPage(); // ����� ���ƴ�.
								continue;
							}
							
						} else if (sixPage == 2) { // ��������.
							cn.sevenPage();
							continue;
						}

					} else if (fourPage == 2) { // ���θ޴��� �̵�
						break;
					}
				}

			} else if (onePage == 2) { // ���ô�, �� �������� �̵�

				cn.twoPage(md);
				continue;

			} else if (onePage == 3) { // ���ô� ��ȯ

				cn.thirteenPage(md);
				continue;

			}
		}

	}
}
