package tetepremiere.commande.groupe;

public class CommandeEteindreStereo implements Commande {
	Stereo stereo;
 
	public CommandeEteindreStereo(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void executer() {
		stereo.arret();
	}

	public void annuler() {
		stereo.marche();
	}
}
