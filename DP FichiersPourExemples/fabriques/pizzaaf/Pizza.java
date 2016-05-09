package tetepremiere.fabrique.pizzaaf;

public abstract class Pizza {
	String nom;

	Pate pate;
	Sauce sauce;
	Legume legumes[];
	Fromage fromage;
	Poivrons poivrons;
	Moules moules;

	abstract void preparer();

	void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}

	void couper() {
		System.out.println("Découpage en parts triangulaires");
	}

	void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}

	void setNom(String nom) {
		this.nom = nom;
	}

	String getNom() {
		return nom;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + nom + " ----\n");
		if (pate != null) {
			result.append(pate);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (fromage != null) {
			result.append(fromage);
			result.append("\n");
		}
		if (legumes != null) {
			for (int i = 0; i < legumes.length; i++) {
				result.append(legumes[i]);
				if (i < legumes.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (moules != null) {
			result.append(moules);
			result.append("\n");
		}
		if (poivrons != null) {
			result.append(poivrons);
			result.append("\n");
		}
		return result.toString();
	}
}
