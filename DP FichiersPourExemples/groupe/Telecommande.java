package tetepremiere.commande.groupe;

//
// Voici l'invocateur
//
public class Telecommande {
	Commande[] commandesMarche;
	Commande[] commandesArret;
	Commande commandeAnnulation;
 
	public Telecommande() {
		commandesMarche = new Commande[7];
		commandesArret = new Commande[7];
 
		Commande pasDeCommande = new PasDeCommande();
		for(int i=0;i<7;i++) {
			commandesMarche[i] = pasDeCommande;
			commandesArret[i] = pasDeCommande;
		}
		commandeAnnulation = pasDeCommande;
	}
  
	public void setCommande(int empt, Commande comMarche, Commande comArret) {
		commandesMarche[empt] = comMarche;
		commandesArret[empt] = comArret;
	}
 
	public void boutonMarchePresse(int empt) {
		commandesMarche[empt].executer();
		commandeAnnulation = commandesMarche[empt];
	}
 
	public void boutonArretPresse(int empt) {
		commandesArret[empt].executer();
		commandeAnnulation = commandesArret[empt];
	}

	public void boutonAnnulPresse() {
		commandeAnnulation.annuler();
	}
 
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Télécommande -------\n");
		for (int i = 0; i < commandesMarche.length; i++) {
			stringBuff.append("[empt " + i + "] " + commandesMarche[i].getClass().getName()
				+ "    " + commandesArret[i].getClass().getName() + "\n");
		}
		stringBuff.append("[annulation] " + commandeAnnulation.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
