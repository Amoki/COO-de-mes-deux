package tetepremiere.commande.groupe;

public class CommandeAllumerJacuzzi implements Commande {
	Jacuzzi jacuzzi;

	public CommandeAllumerJacuzzi(Jacuzzi jacuzzi) {
		this.jacuzzi = jacuzzi;
	}
	public void executer() {
		jacuzzi.allumer();
		jacuzzi.setTemperature(40);
		jacuzzi.bouillonner();
	}
	public void annuler() {
		jacuzzi.eteindre();
	}
}
