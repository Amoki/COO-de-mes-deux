package tetepremiere.strategie;

public class Leurre extends Canard {
	public Leurre() {
		setComportementVol(new NePasVoler());
		setComportementCancan(new CancanMuet());
	}
	public void afficher() {
		System.out.println("Je suis un leurre");
	}
}
