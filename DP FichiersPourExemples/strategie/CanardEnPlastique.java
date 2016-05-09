package tetepremiere.strategie;

public class CanardEnPlastique extends Canard {
 
	public CanardEnPlastique() {
		comportementVol = new NePasVoler();
		comportementCancan = new Coincoin();
	}
 
	public void afficher() {
		System.out.println("Je suis un canard en plastique");
	}
}
