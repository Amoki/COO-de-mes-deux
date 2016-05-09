package tetepremiere.commande.groupe;

public class CommandeVentilateurMoyen implements Commande {
	Ventilateur ventilateur;
	int derniereVitesse;

	public CommandeVentilateurMoyen(Ventilateur ventilateur) {
		this.ventilateur = ventilateur;
	}
	public void executer() {
		derniereVitesse = ventilateur.getVitesse();
		ventilateur.moyen();
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
