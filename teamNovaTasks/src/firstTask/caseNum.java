package firstTask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class caseNum {

	comFunction cf = new comFunction();
	Scanner sc = new Scanner(System.in);

	int inputValue;
	int randomNum;

	public void zeroPage(model md) throws IOException {

		while (1 == 1) {

			inputValue = 0;

			System.out.println("******************************");
			System.out.println("******************************");
			System.out.println("********FISHING EXPERT********");
			System.out.println("******************************");
			System.out.println("******************************");
			System.out.println("���� �� �� �Է½� �ùٸ��� �Է� �� ������ ���");
			System.out.println();
			System.out.println();
			System.out.println("1. ó�� �����ϱ�");
			System.out.println("2. ���� Data �ҷ�����");

			while (!(inputValue == 1 || inputValue == 2)) {

				inputValue = sc.nextInt();

			}

			if (inputValue == 1) {

				System.out.print("�̸� : ");
				md.setName(sc.next());
				md.setPrice(5000);
				md.setRoadType(1);
				md.setOwnRoad(2);
				md.setLine(1);
				break;

			} else if (inputValue == 2) {

				System.out.print("�̸� : ");
				md.setName(sc.next());

				String path = "C:/fishingData/" + md.getName() + ".txt";

				File file = new File(path);

				if (file.exists()) {

					Scanner scan = new Scanner(file);

					md.setPrice(Integer.parseInt(scan.nextLine()));
					md.setRoadType(Integer.parseInt(scan.nextLine()));
					md.setOwnRoad(Integer.parseInt(scan.nextLine()));

					scan.close();

					break;

				} else {

					System.out.println("�ش� ���ò��� �����ϴ�. �ٽ� �Է����ּ���.");
					continue;

				}

			}
		}
	}

	// ���� �޴�
	public int onePage(model md) throws IOException {

		while (1 == 1) {

			inputValue = 0;

			System.out.println("***********************");
			System.out.println("*******Main Menu*******");
			System.out.println("***********************");
			System.out.println("��       �� : " + md.getName());
			System.out.println("�� �� �� �� : " + md.getPrice());
			System.out.println("���� ���ô� : " + cf.ownRoad(md.getOwnRoad()));
			System.out.println("***********************");
			System.out.println("1. ��   ��   ��   ��");
			System.out.println("2. ���ô�/�� ��Ʈ");
			System.out.println("3. �� �� �� �� ȯ");
			System.out.println("4. �� �� �� ��");
			System.out.println("5. ��         ��");
			System.out.println("***********************");
			System.out.println();

			while (!(inputValue == 1 || inputValue == 2 || inputValue == 3
					|| inputValue == 4 || inputValue == 5 || inputValue == 777)) {

				inputValue = sc.nextInt();

			}

			if (inputValue == 1) {

				return 1;

			} else if (inputValue == 2) {

				return 2;

			} else if (inputValue == 3) {

				return 3;

			} else if (inputValue == 4) {

				String path = "C:/fishingData/";

				File file = new File(path);

				if (!(file.exists())) {
					file.mkdirs();
				}

				FileWriter fw = new FileWriter(path + md.getName() + ".txt");
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(Integer.toString(md.getPrice()));
				bw.newLine();
				bw.write(Integer.toString(md.getRoadType()));
				bw.newLine();
				bw.write(Integer.toString(md.getOwnRoad()));

				bw.close();

				continue;

			} else if (inputValue == 5) {

				System.exit(0);

			} else if (inputValue == 777) {

				md.setPrice(10000000);

			}
			return 0;
		}

	}

	// ���ô�, �� ����
	public void twoPage(model md) {

		while (1 == 1) {

			inputValue = 0;

			System.out.println("****************************");
			System.out.println("*********���ô�/�� ��Ʈ**********");
			System.out.println("****************************");
			System.out.println("�� �� �� �� : " + md.getPrice());
			System.out.println("���� ���ô� : " + cf.roadType(md.getRoadType()));
			System.out.println("****************************");
			System.out.println("1. 20 - 380 (���ô�) : 12,500��");
			System.out.println("2. 30 - 530 (���ô�) : 18,000��");
			System.out.println("3. ��             ��  (��   ��) :  1,200��");
			System.out.println("4. ��  Ʈ        ��  ��  ��");
			System.out.println("****************************");
			System.out.println();

			while (!(inputValue == 1 || inputValue == 2 || inputValue == 3 || inputValue == 4)) {

				inputValue = sc.nextInt();

			}

			if (inputValue == 1) {

				if (md.getPrice() < 12500) {
					System.out.println("�ݾ��� �����մϴ�.");
					continue;
				} else if (md.getRoadType() == 2 || md.getRoadType() == 4) {
					System.out.println("�̹� 20 - 380 ���ô븦 ������ �ֽ��ϴ�.");
					continue;
				}

				md.setPrice(md.getPrice() - 12500);

				if (md.getRoadType() == 1) {
					md.setRoadType(2);
				} else if (md.getRoadType() == 3) {
					md.setRoadType(4);
					;
				}

				continue;

			} else if (inputValue == 2) {
				if (md.getPrice() < 18000) {
					System.out.println("�ݾ��� �����մϴ�.");
					continue;
				} else if (md.getRoadType() == 3 || md.getRoadType() == 4) {
					System.out.println("�̹� 20 - 380 ���ô븦 ������ �ֽ��ϴ�.");
					continue;
				}

				md.setPrice(md.getPrice() - 18000);

				if (md.getRoadType() == 1) {
					md.setRoadType(3);
				} else if (md.getRoadType() == 2) {
					md.setRoadType(4);
				}

				continue;

			} else if (inputValue == 3) {
				if (md.getPrice() < 1200) {
					System.out.println("�ݾ��� �����մϴ�.");
					continue;
				} else if (md.getLine() == 2) {
					System.out.println("�̹� �ջ縦 ������ �ֽ��ϴ�.");
					continue;
				}

				md.setPrice(md.getPrice() - 1200);
				md.setLine(2);

				continue;

			} else if (inputValue == 4) {
				return;
			}
		}
	}

	public void threePage(model md) {

		inputValue = 0;

		System.out.println("****************************");
		System.out.println("*********������ ����**********");
		System.out.println("****************************");
		System.out.println("1. ��   ��   ��");
		System.out.println("2. ��   ��   ��");
		System.out.println("3. ��         ��");
		System.out.println("****************************");
		System.out.println();

		while (!(inputValue == 1 || inputValue == 2 || inputValue == 3)) {

			inputValue = sc.nextInt();

		}

		if (inputValue == 1) {
			md.setLocation(1);
			return;
		} else if (inputValue == 2) {
			md.setLocation(2);
			return;
		} else if (inputValue == 3) {
			md.setLocation(3);
			return;
		}
	}

	public int fourPage(model md) {

		inputValue = 0;

		System.out.println("****************************");
		System.out.println("********������ �ұ��???*********");
		System.out.println("****************************");
		System.out.println("1. �̳� ���� �� ĳ����");
		System.out.println("2. ���θ޴��� �� ��");
		System.out.println("****************************");
		System.out.println();

		while (!(inputValue == 1 || inputValue == 2)) {

			inputValue = sc.nextInt();

		}

		if (inputValue == 1) {
			return 1;
		} else if (inputValue == 2) {
			return 2;
		}

		return 0;
	}

	public void fivePage(model md) {

		while (1 == 1) {

			inputValue = 0;

			System.out.println("****************************");
			System.out.println("****� �̳��� ���� �Ͻðڽ��ϱ�??****");
			System.out.println("****�� �� �� �� : " + md.getPrice());
			System.out.println("1. �� �� �� �� : 0��");
			System.out.println("2. ��   ¡   �� : 200��");
			System.out.println("3. �� �� �� �� : 300��");
			System.out.println("****************************");
			System.out.println();

			while (!(inputValue == 1 || inputValue == 2 || inputValue == 3)) {

				inputValue = sc.nextInt();

			}

			if (inputValue == 1) {
				md.setBait(1);
				return;
			} else if (inputValue == 2) {
				if (md.getPrice() < 200) {
					System.out.println("�����ݾ��� �����մϴ�.");
					continue;
				}
				md.setPrice(md.getPrice() - 200);
				md.setBait(2);
				return;

			} else if (inputValue == 3) {

				if (md.getPrice() < 300) {
					System.out.println("�����ݾ��� �����մϴ�.");
					continue;
				}

				md.setPrice(md.getPrice() - 300);
				md.setBait(3);
				return;
			}
		}
	}

	public int sixPage(model md) throws IOException {

		randomNum = cf.randomNum();

		// ������ + �̳� Ȯ�� ��ŭ ����⸦ ���� �� �ִ�.
		if (randomNum < (cf.locChance(md.getLocation()) + cf.bait(md.getBait()))) {
			System.out.println("����Ⱑ ������...!!!");
			System.out.println("Enter Ű�� �����ø� ��� �����մϴ�.");

			System.in.read();

			return 1;

		} else { // ����⸦ ���ƴ�.

			return 2;
		}
	}

	public void sevenPage() throws IOException {

		System.out.println("����Ⱑ ��������...");
		System.out.println("Enter Ű�� �����ø� �����ͷ� �̵��մϴ�.");

		System.in.read();
		return;
	}

	public void eightPage(model md) {

		String fishName = null;

		fishName = cf.fishName(md); // � ��������� �Ǵ�

		md.setFishName(fishName);
	}

	public int ninePage(model md) { // �д� ����

		int cycle = (int) (Math.random() * 3) + 3;
		int valid = 0; // 0�̸� ���ƴ�. 1�̸� ��Ҵ�.

		for (int i = 0; i < cycle; i++) {

			randomNum = cf.randomNum();
			inputValue = 0;

			System.out.println("****************************");
			System.out.println("*****� �ൿ�� �Ͻðڽ��ϱ�???*****");
			System.out.println("1. ��     ��");
			System.out.println("2. Ǯ     ��");
			System.out.println("****************************");
			System.out.println();

			while (!(inputValue == 1 || inputValue == 2)) {

				inputValue = sc.nextInt();

			}

			if (randomNum < 65) {

				if (md.getLine() == 0) { // ���̷�

					if (inputValue == 1) { // 1. ����

						if (randomNum < 90) { // 70% Ȯ�� ���
							System.out.println("���̽�! ��� ����...!");
						} else { // 30% Ȯ�� ���ƴ�.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}

					} else if (inputValue == 2) { // 2. Ǯ��
						if (randomNum < 90) { // 30% Ȯ�� ���
							System.out.println("���̽�! ��� ����...!");
						} else { // 70% Ȯ�� ���ƴ�.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}
					}

				} else if (md.getLine() == 1) { // �ջ�

					if (inputValue == 1) { // 1. ����

						if (randomNum < 90) { // 75% Ȯ�� ���
							System.out.println("���̽�! ��� ����...!");
						} else { // 25% Ȯ�� ���ƴ�.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}

					} else if (inputValue == 2) { // 2. Ǯ��
						if (randomNum < 90) { // 25% Ȯ�� ���
							System.out.println("���̽�! ��� ����...!");
						} else { // 75% Ȯ�� ���ƴ�.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}
					}
				}

			} else {

				if (md.getLine() == 0) { // ���̷�

					if (inputValue == 1) { // 1. ����

						if (randomNum < 30) { // 70% Ȯ�� ���
							System.out.println("���̽�! ��� ����...!");
						} else { // 30% Ȯ�� ���ƴ�.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}

					} else if (inputValue == 2) { // 2. Ǯ��
						if (randomNum < 70) { // 30% Ȯ�� ���
							System.out.println("���̽�! ��� ����...!");
						} else { // 70% Ȯ�� ���ƴ�.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}
					}

				} else if (md.getLine() == 1) { // �ջ�

					if (inputValue == 1) { // 1. ����

						if (randomNum < 25) { // 25% Ȯ�� ���ƴ�.
							System.out.println("���̽�! ��� ����...!");
						} else { // 25% Ȯ�� ���ֵ�.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}

					} else if (inputValue == 2) { // 2. Ǯ��
						if (randomNum < 75) { // 75% Ȯ�� ���ƴ�
							System.out.println("���̽�! ��� ����...!");
						} else { // 75% Ȯ�� ���.
							System.out.println("����⸦ ���ƴ�...!");
							break;
						}
					}
				}

			}

			if (i == (cycle - 1)) {
				valid = 1;
			}

		}

		return valid;
	}

	public int tenPage(model md) throws IOException {

		int fishPrice = cf.fishPrice(md.getFishName());

		md.setPrice((md.getPrice() + fishPrice));

		System.out.println("******************************");
		System.out.println("*****Congratulation....!!!****");
		System.out.println("******************************");
		System.out.println(md.getFishName() + " �� ��ҽ��ϴ�...!!!");
		System.out.println("�Ǹ� �ݾ���  " + fishPrice + "�� �Դϴ�.");
		System.out.println("�� ���� �ݾ��� " + md.getPrice() + "�� �Դϴ�.");
		System.out.println("Enter Ű�� �����ø� �����ͷ� �ٽ� �����մϴ�.");
		System.out.println("****************************");
		System.out.println();

		System.in.read();

		return 0;
	}

	public int elevenPage() {

		return 0;
	}

	public int twelvePage() {

		return 0;
	}

	public void thirteenPage(model md) {

		while (1 == 1) {

			inputValue = 0;

			System.out.println("***********************");
			System.out.println("********���ô� ��ȯ********");
			System.out.println("***********************");

			if (md.getRoadType() == 1) {
				System.out.println("1. 25 - 450 ���ô�");
				System.out.println("2. ���θ޴��� �̵�");
				System.out.println();

				while (!(inputValue == 1 || inputValue == 2)) {
					inputValue = sc.nextInt();
				}

				if (inputValue == 1) {
					continue;
				} else if (inputValue == 2) {
					return;
				}

			} else if (md.getRoadType() == 2) {
				System.out.println("1. 20 - 380 ���ô�");
				System.out.println("2. 25 - 450 ���ô�");
				System.out.println("3. ���θ޴��� �̵�");
				System.out.println();

				while (!(inputValue == 1 || inputValue == 2 || inputValue == 3)) {
					inputValue = sc.nextInt();
				}

				if (inputValue == 1) {
					md.setOwnRoad(1);
					continue;
				} else if (inputValue == 2) {
					md.setOwnRoad(2);
					continue;
				} else if (inputValue == 3) {
					return;
				}

			} else if (md.getRoadType() == 3) {
				System.out.println("1. 25 - 450 ���ô�");
				System.out.println("2. 30 - 530 ���ô�");
				System.out.println("3. ���θ޴��� �̵�");
				System.out.println();

				while (!(inputValue == 1 || inputValue == 2 || inputValue == 3)) {
					inputValue = sc.nextInt();
				}

				if (inputValue == 1) {
					md.setOwnRoad(2);
					continue;
				} else if (inputValue == 2) {
					md.setOwnRoad(3);
					continue;
				} else if (inputValue == 3) {
					return;
				}

			} else if (md.getRoadType() == 4) {
				System.out.println("1. 20 - 380 ���ô�");
				System.out.println("2. 25 - 450 ���ô�");
				System.out.println("3. 30 - 530 ���ô�");
				System.out.println("4. ���θ޴��� �̵�");
				System.out.println();

				while (!(inputValue == 1 || inputValue == 2 || inputValue == 3 || inputValue == 4)) {
					inputValue = sc.nextInt();
				}

				if (inputValue == 1) {
					md.setOwnRoad(1);
					continue;
				} else if (inputValue == 2) {
					md.setOwnRoad(2);
					continue;
				} else if (inputValue == 3) {
					md.setOwnRoad(3);
					continue;
				} else if (inputValue == 4) {
					return;
				}
			}
		}
	}
}
