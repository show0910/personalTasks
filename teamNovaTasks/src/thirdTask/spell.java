package thirdTask;

public class spell extends card {

	private int damage;
	private int abilityNum;

	// ability
	// 1 : Unit �Ǵ� ĳ���Ϳ��� 2 Damage
	// 2 : Unit���� 3 Damage
	// 3 : Unit���� 4 Damage
	// 4 : Unit���� 5 Damage

	public spell(String spell) {
		if (spell.equals("blizzard")) {
			super.setSpecies("human");
			super.setConsumeMana(4);
			super.setName("Blizzard");
			super.setDescription("������ ������ 1 Unit���� 5�� ���ظ� �ش�.");
			this.setDamage(5);
			this.setAbilityNum(4);
		} else if (spell.equals("fireBall")) {
			super.setSpecies("human");
			super.setConsumeMana(2);
			super.setName("Fire Ball");
			super.setDescription("���̾�� ���� 1 Unit���� 2�� ���ظ� �ش�.");
			this.setDamage(2);
			this.setAbilityNum(1);
		} else if (spell.equals("fireSpear")) {
			super.setSpecies("human");
			super.setConsumeMana(4);
			super.setName("Fire Spear");
			super.setDescription("���� â���� 1 Unit���� 4 ���ظ� �ش�.");
			this.setDamage(4);
			this.setAbilityNum(3);
		} else if (spell.equals("frozen")) {
			super.setSpecies("human");
			super.setConsumeMana(2);
			super.setName("Frozen");
			super.setDescription("�� Unit 1���� 3 ���ظ� �ش�.");
			this.setDamage(3);
			this.setAbilityNum(2);
		} else if (spell.equals("hellFire")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Hell Fire");
			super.setDescription("������ �Ҳ����� �� 1Unit���� 4���ظ� �ش�.");
			this.setDamage(4);
			this.setAbilityNum(3);
		} else if (spell.equals("ringOfDeath")) {
			super.setSpecies("demon");
			super.setConsumeMana(2);
			super.setName("Ring Of Death");
			super.setDescription("������ ���� ��ȯ�Ͽ� 1 Unit���� 3���ظ� �ش�.");
			this.setDamage(3);
			this.setAbilityNum(2);
		} else if (spell.equals("spoil")) {
			super.setSpecies("demon");
			super.setConsumeMana(2);
			super.setName("Spoil");
			super.setDescription("�� 1�� ������ ���н��� 2 ���ظ� ������.");
			this.setDamage(2);
			this.setAbilityNum(1);
		} else if (spell.equals("hellFire")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Hell Fire");
			super.setDescription("������ �Ҳ����� �� 1Unit���� 4���ظ� �ش�.");
			this.setDamage(4);
			this.setAbilityNum(3);
		} else if (spell.equals("earthquake")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Earthquake");
			super.setDescription("������ ������ �� 1Unit���� 5���ظ� �ش�.");
			this.setDamage(5);
			this.setAbilityNum(4);
		}
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAbilityNum() {
		return abilityNum;
	}

	public void setAbilityNum(int abilityNum) {
		this.abilityNum = abilityNum;
	}
}
