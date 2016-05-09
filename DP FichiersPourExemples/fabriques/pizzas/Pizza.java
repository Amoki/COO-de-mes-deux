package tetepremiere.fabrique.pizzas;

import java.util.ArrayList;

abstract public class Pizza {
	String nom;
	String pate;
	String sauce;
	ArrayList garnitures = new ArrayList();

	public String getNom() {
		return nom;
	}

	public void preparer() {
		System.out.println("Préparation de " + nom);
	}

	public void cuire() {
		System.out.println("Cuisson de " + nom);
	}

	public void couper() {
		System.out.println("Découpage de " + nom);
	}

	public void emballer() {
		System.out.println("Emballage de " + nom);
	}

	public String toString() {
		// code pour afficher le nom de la pizza et de ses garnitures
		StringBuffer affichage = new StringBuffer();
		affichage.append("---- " + nom + " ----\n");
		affichage.append(pate + "\n");
		affichage.append(sauce + "\n");
		for (int i = 0; i < garnitures.size(); i++) {
			affichage.append((String )garnitures.get(i) + "\n");
		}
		return affichage.toString();
	}
}

