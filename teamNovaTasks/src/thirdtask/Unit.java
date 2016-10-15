package thirdtask;

public class Unit extends Card {

	private int attack;
	private int health;
	private int specAbility;
	private int noActTurn;
	
	// Special Ability
	// 0 : ����
	// 1. ���� : �ٷ� ����
	// 2. ���� : ���� ���� ���� X

	public Unit(String unit) {
		if (unit.equals("footMan")) {

			super.setSpecies("human");
			super.setConsumeMana(1);
			super.setName("Foot Man");
			super.setDescription("ǲ�� �⺻");
			this.setAttack(1);
			this.setHealth(2);
			this.setSpecAbility(1);
			this.setNoActTurn(0);
			
		} else if (unit.equals("gryphon")) {
			super.setSpecies("human");
			super.setConsumeMana(6);
			super.setName("Gryphon");
			super.setDescription("�ϴ��� ���� �׸���");
			this.setAttack(3);
			this.setHealth(6);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("knight")) {
			super.setSpecies("human");
			super.setConsumeMana(2);
			super.setName("Knight");
			super.setDescription("������ ���");
			this.setAttack(3);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("magician")) {
			super.setSpecies("human");
			super.setConsumeMana(6);
			super.setName("Magician");
			super.setDescription("���� ����");
			this.setAttack(6);
			this.setHealth(3);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("sniper")) {
			super.setSpecies("human");
			super.setConsumeMana(4);
			super.setName("Sniper");
			super.setDescription("��߹��� ���ݼ�");
			this.setAttack(4);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("swordMaster")) {
			super.setSpecies("human");
			super.setConsumeMana(7);
			super.setName("Sword Master");
			super.setDescription("���� �ϼ��� �ҵ帶����");
			this.setAttack(6);
			this.setHealth(6);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("skeleton")) {
			super.setSpecies("demon");
			super.setConsumeMana(1);
			super.setName("Skeleton");
			super.setDescription("�⺻ �� ����");
			this.setAttack(1);
			this.setHealth(2);
			this.setSpecAbility(1);
			this.setNoActTurn(0);
		} else if (unit.equals("zombie")) {
			super.setSpecies("demon");
			super.setConsumeMana(2);
			super.setName("Zombie");
			super.setDescription("������ ����");
			this.setAttack(3);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("shadow")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Shadow");
			super.setDescription("�ϻ��� ������");
			this.setAttack(4);
			this.setHealth(2);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("vampire")) {
			super.setSpecies("demon");
			super.setConsumeMana(6);
			super.setName("Vampire");
			super.setDescription("���� ������");
			this.setAttack(6);
			this.setHealth(3);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("warewolf")) {
			super.setSpecies("demon");
			super.setConsumeMana(6);
			super.setName("WareWolf");
			super.setDescription("��ŷ �������");
			this.setAttack(3);
			this.setHealth(6);
			this.setSpecAbility(0);
			this.setNoActTurn(0);
		} else if (unit.equals("doomLord")) {
			super.setSpecies("demon");
			super.setConsumeMana(7);
			super.setName("Doom Lord");
			super.setDescription("������ ���� �ҷε�");
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
