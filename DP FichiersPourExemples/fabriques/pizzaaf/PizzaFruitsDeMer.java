package tetepremiere.fabrique.pizzaaf;

public class PizzaFruitsDeMer extends Pizza {
	FabriqueIngredientsPizza fabriqueIngredients;
 
	public PizzaFruitsDeMer(FabriqueIngredientsPizza fabriqueIngredients) {
		this.fabriqueIngredients = fabriqueIngredients;
	}
 
	void preparer() {
		System.out.println("Préparation de " + nom);
		pate = fabriqueIngredients.creerPate();
		sauce = fabriqueIngredients.creerSauce();
		fromage = fabriqueIngredients.creerFromage();
		moules = fabriqueIngredients.creerMoules();
	}
}
