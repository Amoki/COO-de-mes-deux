package tetepremiere.fabrique.pizzas;

public class PizzaVegetarienne extends Pizza {
	public PizzaVegetarienne() {
		nom = "Pizza végétarienne";
		pate = "normale";
		sauce = "Sauce Marinara";
		garnitures.add("Mozzarella");
		garnitures.add("Parmesan");
		garnitures.add("oignons");
		garnitures.add("Champignons");
		garnitures.add("Poivrons rouges");
		garnitures.add("Olives noires");
	}
}
