package tetepremiere.commande.groupe;

public class Lampe {
	String localisation;
	int niveau;

	public Lampe(String localisation) {
		this.localisation = localisation;
	}

	public void marche() {
		niveau = 100;
		System.out.println(localisation+": lumière allumée");
	}

	public void arret() {
		niveau = 0;
		System.out.println(localisation+": lumière éteinte");
	}

	public void attenuer(int niveau) {
		this.niveau = niveau;
		if (niveau == 0) {
			arret();
		}
		else {
			System.out.println("Le niveau de la lampe est positionné sur " + niveau + "%");
		}
	}

	public int getNiveau() {
		return niveau;
	}
}
