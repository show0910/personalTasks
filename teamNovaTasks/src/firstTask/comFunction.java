package firstTask;

import java.util.ArrayList;
import java.util.Collections;

public class comFunction {

	public double locChance(int location) {
		// location
		// 1. ������ : 44%
		// 2. ������ : 40%
		// 3. �� �� : 37%

		double chance = 0;

		if (location == 1) {
			chance = 44;
		} else if (location == 2) {
			chance = 4;
		} else if (location == 3) {
			chance = 37;
		}

		return chance;
	}

	public double bait(int bait) {
		// bait �̳�
		// 1. �������� : +0%
		// 2. �� ¡ �� : +5%
		// 3. �������� : +8%

		double chance = 0;

		if (bait == 1) {
			return 0;
		} else if (bait == 2) {
			return 5;
		} else if (bait == 3) {
			return 8;
		}

		return chance;
	}

	public String ownRoad(int ownRoad) {

		String roadName = null;

		if (ownRoad == 1) {
			roadName = "20 - 380";
		} else if (ownRoad == 2) {
			roadName = "25 - 450";
		} else if (ownRoad == 3) {
			roadName = "30 - 530";
		}
		return roadName;
	}

	public String roadType(int roadType) {

		String ownRoads = null;

		if (roadType == 1) {
			ownRoads = "25 - 450";
		} else if (roadType == 2) {
			ownRoads = "20 - 380 || 25 - 450";
		} else if (roadType == 3) {
			ownRoads = "25 - 450 || 30 - 530";
		} else if (roadType == 4) {
			ownRoads = "20 - 380 || 25 - 450 || 30 - 530";
		}

		return ownRoads;
	}

	public String line(int line) {
		String lineName = null;

		if (line == 1) {
			lineName = "���Ϸ�";
		} else if (line == 2) {
			lineName = "��   ��";
		}

		return lineName;
	}

	public int randomNum() {
		// 0 ~ 99 ���� �������� ���
		int num = (int) (Math.random() * 100);

		return num;
	}

	public String fishName(model md) { // � ���������??

		ArrayList<String> fishList = new ArrayList<String>();
		int[][] fishChance = new int[][] { { 73, 25, 2 }, { 75, 20, 5 },
				{ 72, 19, 9 } };

		int randomNum = 0;
		String fishName = null;

		randomNum = randomNum();

		if (randomNum < fishChance[(md.ownRoad - 1)][2]) { // 3��
			if (md.getLocation() == 1) { // ������

				fishList = fishByLocation(md.getLocation(), 1); // �������� 3����
																// ��������.

				Collections.shuffle(fishList);

				fishName = fishList.get(0);

			} else if (md.getLocation() == 2) { // ������
				fishList = fishByLocation(md.getLocation(), 3);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			} else if (md.getLocation() == 3) { // �� ��
				fishList = fishByLocation(md.getLocation(), 3);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			}
		} else if (randomNum < fishChance[(md.ownRoad - 1)][1]) { // 2��
			if (md.getLocation() == 1) { // ������

				fishList = fishByLocation(md.getLocation(), 2); // �������� 3����
																// ��������.

				Collections.shuffle(fishList);

				fishName = fishList.get(0);

			} else if (md.getLocation() == 2) { // ������
				fishList = fishByLocation(md.getLocation(), 2);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			} else if (md.getLocation() == 3) { // �� ��
				fishList = fishByLocation(md.getLocation(), 2);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			}
		} else { // 1��
			if (md.getLocation() == 1) { // ������

				fishList = fishByLocation(md.getLocation(), 1); // �������� 3����
				Collections.shuffle(fishList);

				fishName = fishList.get(0);

			} else if (md.getLocation() == 2) { // ������
				fishList = fishByLocation(md.getLocation(), 1);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			} else if (md.getLocation() == 3) { // �� ��
				fishList = fishByLocation(md.getLocation(), 1);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			}
		}
		return fishName;
	}

	public ArrayList<String> fishByLocation(int location, int type) {

		ArrayList<String> fishList = new ArrayList<String>();

		if (location == 1) { // ������

			if (type == 1) { // 1��
				fishList.add("���վ�");
				fishList.add("�����");
				fishList.add("�뷡��");
				fishList.add("���ٸ�");
				fishList.add("�ַ�");

			} else if (type == 2) { // 2��

				fishList.add("����");
				fishList.add("������");
				fishList.add("�췰");
				fishList.add("����");

			}
		} else if (location == 2) { // ������

			if (type == 1) { // 1��
				fishList.add("���վ�");
				fishList.add("�����");
				fishList.add("���ٸ�");
				fishList.add("�ַ�");

			} else if (type == 2) { // 2��

				fishList.add("����");
				fishList.add("������");
				fishList.add("�췰");
				fishList.add("����");

			} else if (type == 3) { // 3��
				fishList.add("��̵�");

			}

		} else if (location == 3) { //����
			if (type == 1) { // 1��
				fishList.add("���վ�");
				fishList.add("�뷡��");
				fishList.add("���ٸ�");

			} else if (type == 2) { // 2��

				fishList.add("������");
				fishList.add("����");

			} else if (type == 3) { // 3��
				fishList.add("����");

			}
		}
		
		return fishList;
		
	}
	
	public int fishPrice(String fishName) {
	
		int fishPrice = 0;
		
		if ( fishName == "���վ�") {
			fishPrice = 1200;
		} else if ( fishName == "�����") {
			fishPrice = 1800;
		}else if ( fishName == "�뷡��") {
			fishPrice = 1600;
		}else if ( fishName == "���ٸ�") {
			fishPrice = 1500;
		}else if ( fishName == "�ַ�") {
			fishPrice = 1000;
		}else if ( fishName == "�췰") {
			fishPrice = 3400;
		}else if ( fishName == "����") {
			fishPrice = 2900;
		}else if ( fishName == "����") {
			fishPrice = 3600;
		}else if ( fishName == "������") {
			fishPrice = 3800;
		}else if ( fishName == "����") {
			fishPrice = 5000;
		}else if ( fishName == "��̵�") {
			fishPrice = 4300;
		}
		
		return fishPrice;
		
	}	
}







