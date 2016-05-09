package tetepremiere.commande.groupe;

public class Stereo {
	String localisation;

	public Stereo(String location) {
		this.localisation = location;
	}

	public void marche() {
		System.out.println(localisation + ": stéréo allumée");
	}

	public void arret() {
		System.out.println(localisation + ": stéréo éteinte");
	}

	public void setCD() {
		System.out.println(localisation + ": stéréo réglée pour l'entrée CD");
	}

	public void setDVD() {
		System.out.println(localisation + ": stéréo réglée pour l'entrée DVD");
	}

	public void setRadio() {
		System.out.println(localisation + ": stéréo réglée pour la radio");
	}

	public void setVolume(int volume) {
		// code pour positionner le volume
		// plage valide: 1-11 (aprs tout, 11 c'est mieux que 10, non ?)
		System.out.println(localisation + ": le volume stéréo est " + volume);
	}
}
