package tetepremiere.patronmethode.barista;

import java.io.*;

public class TheAvecAdaptateur extends BoissonAvecAdaptateur {
 
	public void preparer() {
		System.out.println("Infusion du thé");
	}
 
	public void ajouterSupplements() {
		System.out.println("Ajout du citron");
	}
 
	public boolean clientVeutSupplements() {

		String answer = getReponseUtilisateur();

		if (answer.toLowerCase().startsWith("o")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getReponseUtilisateur() {
		// obtenir la réponse de l'utilisateur
		String reponse = null;

		System.out.print("Voulez-vous du citron (o/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			reponse = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Erreur d'ES. Choix non proposé");
		}
		if (reponse == null) {
			return "non";
		}
		return reponse;
	}
}
