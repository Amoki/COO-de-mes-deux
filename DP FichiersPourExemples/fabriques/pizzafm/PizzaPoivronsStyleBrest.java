package tetepremiere.fabrique.pizzafm;

public class PizzaPoivronsStyleBrest extends Pizza {

	public PizzaPoivronsStyleBrest() {
		nom = "Pizza style Brest et poivrons";
		pate = "Pâte fine";
		sauce = "Sauce Marinara";
 
		garnitures.add("Reggiano");
		garnitures.add("Champignons");
		garnitures.add("Oignons");
		garnitures.add("Poivrons rouges");
		garnitures.add("Poivrons verts");
	}
}
