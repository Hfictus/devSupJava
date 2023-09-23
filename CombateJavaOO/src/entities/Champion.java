package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		attack = damage;
		this.armor = armor;
	}
		
	
	public String getName() {
		return name;
	}
	public void getName(String name) {
		this.name = name;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
		
	public void takeDamage(Champion other) {
		
		int damage = other.attack - armor;
		if(damage > 0) {
			life -= damage;
		}
		else {
			life -= 1;
		}
		
		
		if(life < 0) {
			life = 0;
		}
		
	}
	
	public String status() {
		
		String lifeStatus = (getLife() == 0)?"(morreu)":"";
		
		return String.format(
					"%s: "
					 + "%d de vida %s\n"
					 , getName(), getLife(), lifeStatus
		       );
	}
}
/*Método takeDamage() do gabarito:
 * public void takeDamage(Champion other) {
 *		int damage = other.attack - armor;
 *		if (damage < 1) {
 *			damage = 1;
 *		}
 *		
 *		life = life - damage;
 *		if (life < 0) {
 *			life = 0;
 *		}
 *	}
 */ 
