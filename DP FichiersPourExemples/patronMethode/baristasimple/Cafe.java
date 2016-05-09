package tetepremiere.patronmethode.baristasimple;

public class Cafe {
 
	void suivreRecette() {
		faireBouillirEau();
		filtrerCafe();
		verserDansTasse();
		ajouterLaitEtSucre();
	}
 
	public void faireBouillirEau() {
		System.out.println("L'eau bout");
	}
 
	public void filtrerCafe() {
		System.out.println("Le café passe");
	}
 
	public void verserDansTasse() {
		System.out.println("Je verse dans la tasse");
	}
 
	public void ajouterLaitEtSucre() {
		System.out.println("Ajout de lait et de sucre");
	}
}
