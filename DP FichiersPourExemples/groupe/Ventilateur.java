package tetepremiere.commande.groupe;

public class Ventilateur {
	public static final int RAPIDE = 3;
	public static final int MOYEN = 2;
	public static final int LENT = 1;
	public static final int ARRET = 0;
	String localisation;
	int vitesse;
 
	public Ventilateur(String localisation) {
		this.localisation = localisation;
	}
  
	public void rapide() {
//		 regler le ventilateur sur rapide
		vitesse = RAPIDE;
		System.out.println(localisation + ": ventilateur sur rapide");
	} 

	public void moyen() {
		// regler le ventilateur sur moyen
		vitesse = MOYEN;
		System.out.println(localisation + ": ventilateur sur moyen");
	}

	public void lent() {
		// regler le ventilateur sur lent
		vitesse = LENT;
		System.out.println(localisation + ": ventilateur sur lent");
	}
 
	public void arreter() {
		// arrete le ventilateur
		vitesse = 0;
		System.out.println(localisation + ": ventilateur arrêté");
	}
 
	public int getVitesse() {
		return vitesse;
	}
}
