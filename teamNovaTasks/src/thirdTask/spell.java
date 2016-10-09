package thirdTask;

public class spell extends card {

	private int damage;
	private int abilityNum;

	// ability
	// 1 : Unit 또는 캐릭터에게 2 Damage
	// 2 : Unit에게 3 Damage
	// 3 : Unit에게 4 Damage
	// 4 : Unit에게 5 Damage

	public spell(String spell) {
		if (spell.equals("blizzard")) {
			super.setSpecies("human");
			super.setConsumeMana(4);
			super.setName("Blizzard");
			super.setDescription("눈보라를 일으켜 1 Unit에게 5의 피해를 준다.");
			this.setDamage(5);
			this.setAbilityNum(4);
		} else if (spell.equals("fireBall")) {
			super.setSpecies("human");
			super.setConsumeMana(2);
			super.setName("Fire Ball");
			super.setDescription("파이어볼을 날려 1 Unit에게 2의 피해를 준다.");
			this.setDamage(2);
			this.setAbilityNum(1);
		} else if (spell.equals("fireSpear")) {
			super.setSpecies("human");
			super.setConsumeMana(4);
			super.setName("Fire Spear");
			super.setDescription("불의 창으로 1 Unit에게 4 피해를 준다.");
			this.setDamage(4);
			this.setAbilityNum(3);
		} else if (spell.equals("frozen")) {
			super.setSpecies("human");
			super.setConsumeMana(2);
			super.setName("Frozen");
			super.setDescription("적 Unit 1에게 3 피해를 준다.");
			this.setDamage(3);
			this.setAbilityNum(2);
		} else if (spell.equals("hellFire")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Hell Fire");
			super.setDescription("지옥의 불꽃으로 적 1Unit에게 4피해를 준다.");
			this.setDamage(4);
			this.setAbilityNum(3);
		} else if (spell.equals("ringOfDeath")) {
			super.setSpecies("demon");
			super.setConsumeMana(2);
			super.setName("Ring Of Death");
			super.setDescription("죽음의 고리를 소환하여 1 Unit에게 3피해를 준다.");
			this.setDamage(3);
			this.setAbilityNum(2);
		} else if (spell.equals("spoil")) {
			super.setSpecies("demon");
			super.setConsumeMana(2);
			super.setName("Spoil");
			super.setDescription("적 1개 유닛을 부패시켜 2 피해를 입힌다.");
			this.setDamage(2);
			this.setAbilityNum(1);
		} else if (spell.equals("hellFire")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Hell Fire");
			super.setDescription("지옥의 불꽃으로 적 1Unit에게 4피해를 준다.");
			this.setDamage(4);
			this.setAbilityNum(3);
		} else if (spell.equals("earthquake")) {
			super.setSpecies("demon");
			super.setConsumeMana(4);
			super.setName("Earthquake");
			super.setDescription("지진을 일으켜 적 1Unit에게 5피해를 준다.");
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
