package tetepremiere.commande.groupe;

public class CommandeEteindreTV implements Commande {
	TV tv;

	public CommandeEteindreTV(TV tv) {
		this.tv= tv;
	}

	public void executer() {
		tv.arret();
	}

	public void annuler() {
		tv.marche();
	}
}
