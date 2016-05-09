package tetepremiere.fabrique.pizzaaf;

public interface FabriqueIngredientsPizza {
 
	public Pate creerPate();
	public Sauce creerSauce();
	public Fromage creerFromage();
	public Legume[] creerLegumes();
	public Poivrons creerPoivrons();
	public Moules creerMoules();
 
}
