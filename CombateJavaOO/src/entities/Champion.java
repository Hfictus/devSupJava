package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
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
		if(attack > this.armor) {
			this.life -= (attack - this.armor);
		}
		else {
			this.life -= 1;
		}
		
		
		if(this.life < 0) {
			this.life = 0;
		}
		
	}
	
	public String status() {
		String lifeStatus = "";
		if(this.life == 0) {
			lifeStatus = " (morreu)";
		}
		
		return String.format(
			    "Nome: %s\n"
				+ "Vida: %d%s\n"
			    , name, life, lifeStatus
			   );
	}
}
