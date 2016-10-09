package thirdTask;

public class hero {

	private String species;
	private String name;
	private int life;
	private int mana;
	
	public hero(int check) {

		if (check == 1) {
			this.setSpecies("human");
			this.life = 20;
			this.mana = 1;
		} else if (check == 2) {
			this.setSpecies("demon");
			this.life = 20;
			this.mana = 1;
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
