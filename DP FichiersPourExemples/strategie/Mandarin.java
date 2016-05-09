package tetepremiere.strategie;

public class Mandarin extends Canard {
 
	public Mandarin() {
		comportementVol = new VolerAvecDesAiles();
		comportementCancan = new Cancan();
	}
 
	public void afficher() {
		System.out.println("Je suis un vrai mandarin");
	}
}
