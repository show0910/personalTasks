package thirdtask;

public class Unit extends Card {

	private int attack;
	private int health;
	private int specAbility;
	private int noActTurn;
	
	// Special Ability
	// 0 : 없음
	// 1. 돌진 : 바로 공격
	// 2. 도발 : 영웅 먼저 공격 X

	public Unit(String unit) {
		if (unit.equals("footMan")) {

			super.setSpecies("human");
			super.setConsumeMana(1);
			super.setName("Foot Man");
			super.setDescription("풋맨 기본");
			this.setAttack(1);
			this.setHealth(2);
			this.setSpecAbility(1);
			this.setNoActTurn(0);
			
		} else if (unit.equals("gryphon")) {
			super.setSpecies("human");
			super.setConsumeMana(6);
			super.setName("Gryphon");
			super.setDescription("하늘의 제왕 그리폰");
			this.setAttack(3);
			this.setHealth(6);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("knight")) {
			super.setSpecies("human");
			super.setConsumeMana(2);
			super.setName("Knight");
			super.setDescription("가성비 기사");
			this.setAttack(3);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("magician")) {
			super.setSpecies("human");
			super.setConsumeMana(6);
			super.setName("Magician");
			super.setDescription("딜러 법사");
			this.setAttack(6);
			this.setHealth(3);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("sniper")) {
			super.setSpecies("human");
			super.setConsumeMana(4);
			super.setName("Sniper");
			super.setDescription("백발백중 저격수");
			this.setAttack(4);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("swordMaster")) {
			super.setSpecies("human");
			super.setConsumeMana(7);
			super.setName("Sword Master");
			super.setDescription("공방 완성형 소드마스터");
			this.setAttack(6);
			this.setHealth(6);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("skeleton")) {
			super.setSpecies("demon");
			super.setConsumeMana(1);
			super.setName("Skeleton");
			super.setDescription("기본 뼈 병사");
			this.setAttack(1);
			this.setHealth(2);
			this.setSpecAbility(1);
			this.setNoActTurn(0);
		} else if (unit.equals("zombie")) {
			super.setSpecies("demon");
			super.setConsumeMana(2);
			super.setName("Zombie");
			super.setDescription("질질질 좀비");
			this.setAttack(3);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("shadow")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Shadow");
			super.setDescription("암살자 쉐도우");
			this.setAttack(4);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("vampire")) {
			super.setSpecies("demon");
			super.setConsumeMana(6);
			super.setName("Vampire");
			super.setDescription("공격 흡혈귀");
			this.setAttack(6);
			this.setHealth(3);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("warewolf")) {
			super.setSpecies("demon");
			super.setConsumeMana(6);
			super.setName("WareWolf");
			super.setDescription("탱킹 웨어울프");
			this.setAttack(3);
			this.setHealth(6);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("doomLord")) {
			super.setSpecies("demon");
			super.setConsumeMana(7);
			super.setName("Doom Lord");
			super.setDescription("지옥의 군주 둠로드");
			this.setAttack(6);
			this.setHealth(6);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		}
	}

	public int getNoActTurn() {
		return noActTurn;
	}

	public void setNoActTurn(int noActTurn) {
		this.noActTurn = noActTurn;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getSpecAbility() {
		return specAbility;
	}

	public void setSpecAbility(int specAbility) {
		this.specAbility = specAbility;
	}

}
