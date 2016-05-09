package tetepremiere.commande.groupe;

public class CommandeAllumerLampeSejour implements Commande {
	Lampe lampe;

	public CommandeAllumerLampeSejour(Lampe lampe) {
		this.lampe = lampe;
	}
	public void executer() {
		lampe.arret();
	}
	public void annuler() {
		lampe.marche();
	}
}
