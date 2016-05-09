package tetepremiere.patronmethode.barista;

public abstract class BoissonCafeinee {
  
	final void suivreRecette() {
		faireBouillirEau();
		preparer();
		verserDansTasse();
		ajouterSupplements();
	}
 
	abstract void preparer();
  
	abstract void ajouterSupplements();
 
	void faireBouillirEau() {
		System.out.println("Portage de l'eau à ébullition");
	}
  
	void verserDansTasse() {
		System.out.println("Remplissage de la tasse");
	}
}
