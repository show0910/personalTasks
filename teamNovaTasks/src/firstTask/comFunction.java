package firstTask;

import java.util.ArrayList;
import java.util.Collections;

public class comFunction {

	public double locChance(int location) {
		// location
		// 1. 덕적도 : 44%
		// 2. 거제도 : 40%
		// 3. 속 초 : 37%

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
		// bait 미끼
		// 1. 갯지렁이 : +0%
		// 2. 오 징 어 : +5%
		// 3. 염전새우 : +8%

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
			lineName = "나일론";
		} else if (line == 2) {
			lineName = "합   사";
		}

		return lineName;
	}

	public int randomNum() {
		// 0 ~ 99 까지 랜덤으로 출력
		int num = (int) (Math.random() * 100);

		return num;
	}

	public String fishName(model md) { // 어떤 물고기인지??

		ArrayList<String> fishList = new ArrayList<String>();
		int[][] fishChance = new int[][] { { 73, 25, 2 }, { 75, 20, 5 },
				{ 72, 19, 9 } };

		int randomNum = 0;
		String fishName = null;

		randomNum = randomNum();

		if (randomNum < fishChance[(md.ownRoad - 1)][2]) { // 3성
			if (md.getLocation() == 1) { // 덕적도

				fishList = fishByLocation(md.getLocation(), 1); // 덕적도는 3성이
																// 안잡힌다.

				Collections.shuffle(fishList);

				fishName = fishList.get(0);

			} else if (md.getLocation() == 2) { // 거제도
				fishList = fishByLocation(md.getLocation(), 3);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			} else if (md.getLocation() == 3) { // 속 초
				fishList = fishByLocation(md.getLocation(), 3);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			}
		} else if (randomNum < fishChance[(md.ownRoad - 1)][1]) { // 2성
			if (md.getLocation() == 1) { // 덕적도

				fishList = fishByLocation(md.getLocation(), 2); // 덕적도는 3성이
																// 안잡힌다.

				Collections.shuffle(fishList);

				fishName = fishList.get(0);

			} else if (md.getLocation() == 2) { // 거제도
				fishList = fishByLocation(md.getLocation(), 2);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			} else if (md.getLocation() == 3) { // 속 초
				fishList = fishByLocation(md.getLocation(), 2);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			}
		} else { // 1성
			if (md.getLocation() == 1) { // 덕적도

				fishList = fishByLocation(md.getLocation(), 1); // 덕적도는 3성이
				Collections.shuffle(fishList);

				fishName = fishList.get(0);

			} else if (md.getLocation() == 2) { // 거제도
				fishList = fishByLocation(md.getLocation(), 1);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			} else if (md.getLocation() == 3) { // 속 초
				fishList = fishByLocation(md.getLocation(), 1);

				Collections.shuffle(fishList);

				fishName = fishList.get(0);
			}
		}
		return fishName;
	}

	public ArrayList<String> fishByLocation(int location, int type) {

		ArrayList<String> fishList = new ArrayList<String>();

		if (location == 1) { // 덕적도

			if (type == 1) { // 1성
				fishList.add("망둥어");
				fishList.add("붕장어");
				fishList.add("노래미");
				fishList.add("도다리");
				fishList.add("애럭");

			} else if (type == 2) { // 2성

				fishList.add("참돔");
				fishList.add("감성돔");
				fishList.add("우럭");
				fishList.add("숭어");

			}
		} else if (location == 2) { // 거제도

			if (type == 1) { // 1성
				fishList.add("망둥어");
				fishList.add("붕장어");
				fishList.add("도다리");
				fishList.add("애럭");

			} else if (type == 2) { // 2성

				fishList.add("참돔");
				fishList.add("감성돔");
				fishList.add("우럭");
				fishList.add("숭어");

			} else if (type == 3) { // 3성
				fishList.add("백미돔");

			}

		} else if (location == 3) { //속초
			if (type == 1) { // 1성
				fishList.add("망둥어");
				fishList.add("노래미");
				fishList.add("도다리");

			} else if (type == 2) { // 2성

				fishList.add("감성돔");
				fishList.add("숭어");

			} else if (type == 3) { // 3성
				fishList.add("돌돔");

			}
		}
		
		return fishList;
		
	}
	
	public int fishPrice(String fishName) {
	
		int fishPrice = 0;
		
		if ( fishName == "망둥어") {
			fishPrice = 1200;
		} else if ( fishName == "붕장어") {
			fishPrice = 1800;
		}else if ( fishName == "노래미") {
			fishPrice = 1600;
		}else if ( fishName == "도다리") {
			fishPrice = 1500;
		}else if ( fishName == "애럭") {
			fishPrice = 1000;
		}else if ( fishName == "우럭") {
			fishPrice = 3400;
		}else if ( fishName == "숭어") {
			fishPrice = 2900;
		}else if ( fishName == "참돔") {
			fishPrice = 3600;
		}else if ( fishName == "감성돔") {
			fishPrice = 3800;
		}else if ( fishName == "돌돔") {
			fishPrice = 5000;
		}else if ( fishName == "백미돔") {
			fishPrice = 4300;
		}
		
		return fishPrice;
		
	}	
}







