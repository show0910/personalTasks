package thirdtask;

public class Hero {

	private String species;
	private String name;
	private int life;
	private int mana;
	private int shuffleAble;
	private int turnInit;
	
	public int getTurnInit() {
		return turnInit;
	}

	public void setTurnInit(int turnInit) {
		this.turnInit = turnInit;
	}
	
	public int getShuffleAble() {
		return shuffleAble;
	}

	public void setShuffleAble(int shuffleAble) {
		this.shuffleAble = shuffleAble;
	}

	public Hero(int check) {

		if (check == 1) {
			this.species = "human";
			this.life = 20;
			this.mana = 1;
			this.shuffleAble = 1;
			this.name = "James";
			this.turnInit = 0;
		} else if (check == 2) {
			this.species = "demon";
			this.life = 20;
			this.mana = 1;
			this.name = "Ilidan";
			this.turnInit = 0;
		}
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
}
