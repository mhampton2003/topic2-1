package app;
import java.util.Random;

/**
 * 
 * @author Maya
 *
 */
public class Game {

	/**
	 * creates superhero objects and randomizes health
	 * @param args takes in any number of values
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int health1 = rand.nextInt(1000) + 1;
		int health2 = rand.nextInt(1000) + 1;
		Batman batman = new Batman(health1);
		Superman superman = new Superman(health2);
		
		/**
		 * while the heros are not dead, attack each other
		 * if dead, prints out who defeated who
		 */
		while((!superman.isDead()) && (!batman.isDead())) {
			superman.attack(batman);
			batman.attack(superman);

			if (superman.isDead()) {
				System.out.println("Batman defeated superman");
			}
			if (batman.isDead()) {
				System.out.println("Superman defeated batman");
			}
		}
	}

}
