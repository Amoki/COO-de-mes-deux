package tetepremiere.fabrique.pizzaaf;

public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza {
 
	public Pate creerPate() {
		return new PateFine();
	}
 
	public Sauce creerSauce() {
		return new SauceMarinara();
	}
 
	public Fromage creerFromage() {
		return new Reggiano();
	}
 
	public Legume[] creerLegumes() {
		Legume legumes[] = { new Ail(), new Oignon(), new Champignon(), new PoivronRouge() };
		return legumes;
	}
 
	public Poivrons creerPoivrons() {
		return new PoivronsEnRondelles();
	}

	public Moules creerMoules() {
		return new MoulesFraiches();
	}
}
