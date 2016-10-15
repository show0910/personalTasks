package thirdtask;

public class Spell extends Card {

	private int damage;
	private int abilityNum;

	// ability
	// 1 : Unit �Ǵ� ĳ���Ϳ��� 2 Damage
	// 2 : �ϳ��� Unit�� 2�ϰ� �󸰴�.
	// 3 : Unit���� 4 Damage
	// 4 : �� ���� ��ü�� 1�ϰ� �󸰴�.

	public Spell(String spell) {
		if (spell.equals("blizzard")) {
			super.setSpecies("human");
			super.setConsumeMana(4);
			super.setName("Blizzard");
			super.setDescription("������ ������ 1 ����ü ������ 1�ϰ� �󸰴�.");
			this.setDamage(0);
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
			super.setDescription("�� Unit �ϳ��� 2�ϰ� �󸰴�.");
			this.setDamage(0);
			this.setAbilityNum(2);
		} else if (spell.equals("hellFire")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Hell Fire");
			super.setDescription("������ �Ҳ����� �� 1 Unit���� 4���ظ� �ش�.");
			this.setDamage(4);
			this.setAbilityNum(3);
		} else if (spell.equals("ringOfDeath")) {
			super.setSpecies("demon");
			super.setConsumeMana(2);
			super.setName("Ice Of Ring");
			super.setDescription("������ ���� ��ȯ�Ͽ� 1 Unit�� 2�ϰ� ���´�.");
			this.setDamage(0);
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
			super.setName("Ice Field");
			super.setDescription("�� ��ü�� 2�ϰ� ������Ų��.");
			this.setDamage(0);
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
