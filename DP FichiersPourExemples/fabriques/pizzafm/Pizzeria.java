package tetepremiere.fabrique.pizzafm;

public abstract class Pizzeria {
 
	abstract Pizza creerPizza(String item);
 
	public Pizza commanderPizza(String type) {
		Pizza pizza = creerPizza(type);
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		return pizza;
	}
}
