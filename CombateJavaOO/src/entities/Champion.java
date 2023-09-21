package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public int getArmor() {
		return this.armor;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public void takeDamage(int attack) {
		if(attack > getArmor()) {
			setLife(getLife() - (attack - getArmor()));
		}
		else {
			setLife(getLife() - 1);
		}
		
		
		if(getLife() < 0) {
			setLife(0);
		}
		
	}
	
	public String status() {
		String lifeStatus = "";
		if(getLife() == 0) {
			lifeStatus = " (morreu)";
		}
		
		return String.format(
			    "%s: "
				+ "%d de vida%s\n"
			    , getName(), getLife(), lifeStatus
			   );
	}
}
