package tetepremiere.patronmethode.barista;

import java.io.*;

public class CafeAvecAdaptateur extends BoissonAvecAdaptateur {
 
	public void preparer() {
		System.out.println("Passage du café");
	}
 
	public void ajouterSupplements() {
		System.out.println("Ajout du lait et du sucre");
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
		String reponse = null;

		System.out.print("Voulez-vous du lait et du sucre (o/n)? ");

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
