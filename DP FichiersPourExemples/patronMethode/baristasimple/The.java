package tetepremiere.patronmethode.baristasimple;

public class The {
 
	void suivreRecette() {
		faireBouillirEau();
		tremperSachet();
		verserDansTasse();
		ajouterCitron();
	}
 
	public void faireBouillirEau() {
		System.out.println("L'eau bout");
	}
 
	public void tremperSachet() {
		System.out.println("Le thé infuse");
	}
 
	public void ajouterCitron() {
		System.out.println("Ajout de citron");
	}
 
	public void verserDansTasse() {
		System.out.println("Je verse dans la tasse");
	}
}
