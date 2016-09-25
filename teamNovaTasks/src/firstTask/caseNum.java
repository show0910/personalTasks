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
			System.out.println("숫자 잘 못 입력시 올바르게 입력 할 때까지 대기");
			System.out.println();
			System.out.println();
			System.out.println("1. 처음 시작하기");
			System.out.println("2. 기존 Data 불러오기");

			while (!(inputValue == 1 || inputValue == 2)) {

				inputValue = sc.nextInt();

			}

			if (inputValue == 1) {

				System.out.print("이름 : ");
				md.setName(sc.next());
				md.setPrice(5000);
				md.setRoadType(1);
				md.setOwnRoad(2);
				md.setLine(1);
				break;

			} else if (inputValue == 2) {

				System.out.print("이름 : ");
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

					System.out.println("해당 낚시꾼이 없습니다. 다시 입력해주세요.");
					continue;

				}

			}
		}
	}

	// 메인 메뉴
	public int onePage(model md) throws IOException {

		while (1 == 1) {

			inputValue = 0;

			System.out.println("***********************");
			System.out.println("*******Main Menu*******");
			System.out.println("***********************");
			System.out.println("이       름 : " + md.getName());
			System.out.println("보 유 금 액 : " + md.getPrice());
			System.out.println("현재 낚시대 : " + cf.ownRoad(md.getOwnRoad()));
			System.out.println("***********************");
			System.out.println("1. 낚   시   출   발");
			System.out.println("2. 낚시대/줄 마트");
			System.out.println("3. 낚 시 대 교 환");
			System.out.println("4. 저 장 하 기");
			System.out.println("5. 종         료");
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

	// 낚시대, 줄 상점
	public void twoPage(model md) {

		while (1 == 1) {

			inputValue = 0;

			System.out.println("****************************");
			System.out.println("*********낚시대/줄 마트**********");
			System.out.println("****************************");
			System.out.println("보 유 금 액 : " + md.getPrice());
			System.out.println("보유 낚시대 : " + cf.roadType(md.getRoadType()));
			System.out.println("****************************");
			System.out.println("1. 20 - 380 (낚시대) : 12,500원");
			System.out.println("2. 30 - 530 (낚시대) : 18,000원");
			System.out.println("3. 합             사  (합   사) :  1,200원");
			System.out.println("4. 마  트        나  가  기");
			System.out.println("****************************");
			System.out.println();

			while (!(inputValue == 1 || inputValue == 2 || inputValue == 3 || inputValue == 4)) {

				inputValue = sc.nextInt();

			}

			if (inputValue == 1) {

				if (md.getPrice() < 12500) {
					System.out.println("금액이 부족합니다.");
					continue;
				} else if (md.getRoadType() == 2 || md.getRoadType() == 4) {
					System.out.println("이미 20 - 380 낚시대를 가지고 있습니다.");
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
					System.out.println("금액이 부족합니다.");
					continue;
				} else if (md.getRoadType() == 3 || md.getRoadType() == 4) {
					System.out.println("이미 20 - 380 낚시대를 가지고 있습니다.");
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
					System.out.println("금액이 부족합니다.");
					continue;
				} else if (md.getLine() == 2) {
					System.out.println("이미 합사를 가지고 있습니다.");
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
		System.out.println("*********낚시터 선택**********");
		System.out.println("****************************");
		System.out.println("1. 덕   적   도");
		System.out.println("2. 거   제   도");
		System.out.println("3. 속         초");
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
		System.out.println("********무엇을 할까요???*********");
		System.out.println("****************************");
		System.out.println("1. 미끼 선택 후 캐스팅");
		System.out.println("2. 메인메뉴로 이 동");
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
			System.out.println("****어떤 미끼를 선택 하시겠습니까??****");
			System.out.println("****보 유 금 액 : " + md.getPrice());
			System.out.println("1. 갯 지 렁 이 : 0원");
			System.out.println("2. 오   징   어 : 200원");
			System.out.println("3. 염 전 새 우 : 300원");
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
					System.out.println("보유금액이 부족합니다.");
					continue;
				}
				md.setPrice(md.getPrice() - 200);
				md.setBait(2);
				return;

			} else if (inputValue == 3) {

				if (md.getPrice() < 300) {
					System.out.println("보유금액이 부족합니다.");
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

		// 낚시터 + 미끼 확률 만큼 물고기를 낚을 수 있다.
		if (randomNum < (cf.locChance(md.getLocation()) + cf.bait(md.getBait()))) {
			System.out.println("물고기가 물었다...!!!");
			System.out.println("Enter 키를 누르시면 계속 진행합니다.");

			System.in.read();

			return 1;

		} else { // 물고기를 놓쳤다.

			return 2;
		}
	}

	public void sevenPage() throws IOException {

		System.out.println("물고기가 도망갔다...");
		System.out.println("Enter 키를 누르시면 낚시터로 이동합니다.");

		System.in.read();
		return;
	}

	public void eightPage(model md) {

		String fishName = null;

		fishName = cf.fishName(md); // 어떤 물고기인지 판단

		md.setFishName(fishName);
	}

	public int ninePage(model md) { // 밀당 시작

		int cycle = (int) (Math.random() * 3) + 3;
		int valid = 0; // 0이면 놓쳤다. 1이면 잡았다.

		for (int i = 0; i < cycle; i++) {

			randomNum = cf.randomNum();
			inputValue = 0;

			System.out.println("****************************");
			System.out.println("*****어떤 행동을 하시겠습니까???*****");
			System.out.println("1. 감     기");
			System.out.println("2. 풀     기");
			System.out.println("****************************");
			System.out.println();

			while (!(inputValue == 1 || inputValue == 2)) {

				inputValue = sc.nextInt();

			}

			if (randomNum < 65) {

				if (md.getLine() == 0) { // 나이롱

					if (inputValue == 1) { // 1. 감기

						if (randomNum < 90) { // 70% 확률 통과
							System.out.println("나이스! 계속 진행...!");
						} else { // 30% 확률 놓쳤다.
							System.out.println("물고기를 놓쳤다...!");
							break;
						}

					} else if (inputValue == 2) { // 2. 풀기
						if (randomNum < 90) { // 30% 확률 통과
							System.out.println("나이스! 계속 진행...!");
						} else { // 70% 확률 놓쳤다.
							System.out.println("물고기를 놓쳤다...!");
							break;
						}
					}

				} else if (md.getLine() == 1) { // 합사

					if (inputValue == 1) { // 1. 감기

						if (randomNum < 90) { // 75% 확률 통과
							System.out.println("나이스! 계속 진행...!");
						} else { // 25% 확률 놓쳤다.
							System.out.println("물고기를 놓쳤다...!");
							break;
						}

					} else if (inputValue == 2) { // 2. 풀기
						if (randomNum < 90) { // 25% 확률 통과
							System.out.println("나이스! 계속 진행...!");
						} else { // 75% 확률 놓쳤다.
							System.out.println("물고기를 놓쳤다...!");
							break;
						}
					}
				}

			} else {

				if (md.getLine() == 0) { // 나이롱

					if (inputValue == 1) { // 1. 감기

						if (randomNum < 30) { // 70% 확률 통과
							System.out.println("나이스! 계속 진행...!");
						} else { // 30% 확률 놓쳤다.
							System.out.println("물고기를 놓쳤다...!");
							break;
						}

					} else if (inputValue == 2) { // 2. 풀기
						if (randomNum < 70) { // 30% 확률 통과
							System.out.println("나이스! 계속 진행...!");
						} else { // 70% 확률 놓쳤다.
							System.out.println("물고기를 놓쳤다...!");
							break;
						}
					}

				} else if (md.getLine() == 1) { // 합사

					if (inputValue == 1) { // 1. 감기

						if (randomNum < 25) { // 25% 확률 놓쳤다.
							System.out.println("나이스! 계속 진행...!");
						} else { // 25% 확률 집있디.
							System.out.println("물고기를 놓쳤다...!");
							break;
						}

					} else if (inputValue == 2) { // 2. 풀기
						if (randomNum < 75) { // 75% 확률 놓쳤다
							System.out.println("나이스! 계속 진행...!");
						} else { // 75% 확률 통과.
							System.out.println("물고기를 놓쳤다...!");
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
		System.out.println(md.getFishName() + " 을 잡았습니다...!!!");
		System.out.println("판매 금액은  " + fishPrice + "원 입니다.");
		System.out.println("총 보유 금액은 " + md.getPrice() + "원 입니다.");
		System.out.println("Enter 키를 누르시면 낚시터로 다시 입장합니다.");
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
			System.out.println("********낚시대 교환********");
			System.out.println("***********************");

			if (md.getRoadType() == 1) {
				System.out.println("1. 25 - 450 낚시대");
				System.out.println("2. 메인메뉴로 이동");
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
				System.out.println("1. 20 - 380 낚시대");
				System.out.println("2. 25 - 450 낚시대");
				System.out.println("3. 메인메뉴로 이동");
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
				System.out.println("1. 25 - 450 낚시대");
				System.out.println("2. 30 - 530 낚시대");
				System.out.println("3. 메인메뉴로 이동");
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
				System.out.println("1. 20 - 380 낚시대");
				System.out.println("2. 25 - 450 낚시대");
				System.out.println("3. 30 - 530 낚시대");
				System.out.println("4. 메인메뉴로 이동");
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
