package tetepremiere.commande.groupe;

public class CommandeAllumerStereo implements Commande {
	Stereo stereo;

	public CommandeAllumerStereo(Stereo stereo) {
		this.stereo = stereo;
	}

	public void executer() {
		stereo.marche();
	}

	public void annuler() {
		stereo.arret();
	}
}
