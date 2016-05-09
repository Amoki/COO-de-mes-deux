package tetepremiere.commande.groupe;

public class CommandeAllumerTV implements Commande {
	TV tv;

	public CommandeAllumerTV(TV tv) {
		this.tv= tv;
	}

	public void executer() {
		tv.marche();
		tv.selectionnerCanal();
	}

	public void annuler() {
		tv.arret();
	}
}
