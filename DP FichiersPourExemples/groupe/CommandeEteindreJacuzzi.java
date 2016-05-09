package tetepremiere.commande.groupe;

public class CommandeEteindreJacuzzi implements Commande {
	Jacuzzi jacuzzi;

	public CommandeEteindreJacuzzi(Jacuzzi jacuzzi) {
		this.jacuzzi = jacuzzi;
	}

	public void executer() {
		jacuzzi.setTemperature(36);
		jacuzzi.eteindre();
	}
	public void annuler() {
		jacuzzi.allumer();
	}
}
