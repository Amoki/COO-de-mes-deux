package tetepremiere.fabrique.pizzaaf;

public class PizzaVegetarienne extends Pizza {
	FabriqueIngredientsPizza fabriqueIngredients;
 
	public PizzaVegetarienne(FabriqueIngredientsPizza fabriqueIngredients) {
		this.fabriqueIngredients = fabriqueIngredients;
	}
 
	void preparer() {
		System.out.println("Préparation de  " + nom);
		pate = fabriqueIngredients.creerPate();
		sauce = fabriqueIngredients.creerSauce();
		fromage = fabriqueIngredients.creerFromage();
		legumes = fabriqueIngredients.creerLegumes();
	}
}
