package entities;

public class Champion {
	public String name;
	public int life;
	public int attack;
	public int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String toString() {
		return String.format(
				"\nNome: %s"
				+ ". Vida: %d"
				+ ". Ataque: %d"
				+ ". Armadura: %d"
				, name, life, attack, armor
			   );
	}
}
