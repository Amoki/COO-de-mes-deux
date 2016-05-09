package tetepremiere.commande.groupe;

public class CommandeEteindreVentilateur implements Commande {
	Ventilateur ventilateur;
	int derniereVitesse;

	public CommandeEteindreVentilateur(Ventilateur ventilateur) {
		this.ventilateur = ventilateur;
	}
	public void executer() {
		derniereVitesse = ventilateur.getVitesse();
		ventilateur.arreter();
	}
	public void annuler() {
		switch (derniereVitesse) {
			case Ventilateur.RAPIDE: 	ventilateur.rapide(); break;
			case Ventilateur.MOYEN: ventilateur.moyen(); break;
			case Ventilateur.LENT: 	ventilateur.lent(); break;
			default: 				ventilateur.arreter(); break;
		}
	}
}
