package tetepremiere.patronmethode.baristasimple;

public class Barista {
 
	public static void main(String[] args) {
		The the = new The();
		Cafe cafe = new Cafe();
		System.out.println("Faire du thé...");
		the.suivreRecette();
		System.out.println("Faire du café...");
		cafe.suivreRecette();
	}
}
