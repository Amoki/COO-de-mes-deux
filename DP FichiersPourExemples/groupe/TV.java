package tetepremiere.commande.groupe;

public class TV {
	String localisation;
	int canal;

	public TV(String location) {
		this.localisation = location;
	}

	public void marche() {
		System.out.println(localisation + ": la télé est allumée");
	}

	public void arret() {
		System.out.println(localisation + ": la télé est éteinte");
	}

	public void selectionnerCanal() {
		this.canal = 3;
		System.out.println(localisation + ": le canal est positionné sur VCR");
	}
}
