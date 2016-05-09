package tetepremiere.fabrique.pizzaaf;

public abstract class Pizzeria {
 
	protected abstract Pizza creerPizza(String item);
 
	public Pizza commanderPizza(String type) {
		Pizza pizza = creerPizza(type);
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		return pizza;
	}
}
