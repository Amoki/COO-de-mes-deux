package tetepremiere.commande.groupe;

public class Jacuzzi {
	boolean allume;
	int temperature;

	public Jacuzzi() {
	}

	public void allumer() {
		allume = true;
	}

	public void eteindre() {
		allume = false;
	}

	public void bouillonner() {
		if (allume) {
			System.out.println("Le jaccuzi bouillonne !");
		}
	}

	public void marche() {
		if (allume) {
			System.out.println("Le jaccuzi est en marche");
		}
	}

	public void arret() {
		if (allume) {
			System.out.println("Le jaccuzi est arrêté");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("Le jacuzzi chauffe à " + temperature + "°");
		}
		else {
			System.out.println("Le jaccuzi refroidit à " + temperature + "°");
		}
		this.temperature = temperature;
	}
}
