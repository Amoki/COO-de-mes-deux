package tetepremiere.commande.groupe;

public class CommandeEteindreLampeSejour implements Commande {
	Lampe lampe;

	public CommandeEteindreLampeSejour(Lampe lampe) {
		this.lampe = lampe;
	}
	public void executer() {
		lampe.marche();
	}
	public void annuler() {
		lampe.arret();
	}
}
