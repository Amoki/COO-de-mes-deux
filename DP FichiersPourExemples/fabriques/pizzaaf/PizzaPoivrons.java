package tetepremiere.fabrique.pizzaaf;

public class PizzaPoivrons extends Pizza {
	FabriqueIngredientsPizza fabriqueIngredients;
 
	public PizzaPoivrons(FabriqueIngredientsPizza fabriqueIngredients) {
		this.fabriqueIngredients = fabriqueIngredients;
	}
 
	void preparer() {
		System.out.println("Préparation de " + nom);
		pate = fabriqueIngredients.creerPate();
		sauce = fabriqueIngredients.creerSauce();
		fromage = fabriqueIngredients.creerFromage();
		legumes = fabriqueIngredients.creerLegumes();
		poivrons = fabriqueIngredients.creerPoivrons();
	}
}
