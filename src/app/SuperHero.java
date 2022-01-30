package app;
import java.util.Random;

public class SuperHero {
	private String name;
	private int health;
	private boolean isDead;
	
	/**
	 * SuperHero constructor
	 * @param name the name of the superhero
	 * @param health the health of the superhero
	 */
	public SuperHero(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	/**
	 * Attacks opponent by removing random amount of damage from health
	 * @param opponent the superhero's opponent
	 */
	public void attack(SuperHero opponent) {
		Random rand = new Random();
		int damage = (rand.nextInt(10) + 1);
		opponent.determineHealth(damage);
		System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage, opponent.health));
	}
	
	/**
	 * Returns if the hero is dead or not
	 * @return is.Dead
	 */
	public boolean isDead() {
		return this.isDead;
	}
	
	/**
	 * Determines the health of the hero
	 * @param damage the damage the hero receives
	 */
	private void determineHealth(int damage) {
		if (this.health - damage <= 0) {
			this.health = 0;
			this.isDead = true;
		}
		else {
			this.health = this.health - damage;
		}
	}

}
