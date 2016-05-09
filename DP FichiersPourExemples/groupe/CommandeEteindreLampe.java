package tetepremiere.commande.groupe;

public class CommandeEteindreLampe implements Commande {
	Lampe lampe;

	public CommandeEteindreLampe(Lampe lampe) {
		this.lampe = lampe;
	}

	public void executer() {
		lampe.arret();
	}

	public void annuler() {
		lampe.marche();
	}
}
