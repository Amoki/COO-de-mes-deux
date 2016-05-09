package tetepremiere.commande.groupe;

public class MacroCommande implements Commande {
	Commande[] commandes;
 
	public MacroCommande(Commande[] commandes) {
		this.commandes = commandes;
	}
 
	public void executer() {
		for (int i = 0; i < commandes.length; i++) {
			commandes[i].executer();
		}
	}
 
	public void annuler() {
		for (int i = 0; i < commandes.length; i++) {
			commandes[i].annuler();
		}
	}
}

