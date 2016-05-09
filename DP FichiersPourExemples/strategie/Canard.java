package tetepremiere.strategie;

public abstract class Canard {
	ComportementVol comportementVol;
	ComportementCancan comportementCancan;
 
	public Canard() {
	}
 
	public void setComportementVol (ComportementVol fb) {
		comportementVol = fb;
	}
 
	public void setComportementCancan(ComportementCancan qb) {
		comportementCancan = qb;
	}
 
	abstract void afficher();
 
	public void effectuerVol() {
		comportementVol.voler();
	}
 
	public void effectuerCancan() {
		comportementCancan.cancaner();
	}
 
	public void nager() {
		System.out.println("Tous les canards flottent, même les leurres!");
	}
}
