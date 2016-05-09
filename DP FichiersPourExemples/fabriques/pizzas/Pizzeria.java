package tetepremiere.fabrique.pizzas;

public class Pizzeria {
	SimpleFabriqueDePizzas fabrique;
 
	public Pizzeria(SimpleFabriqueDePizzas fabrique) { 
		this.fabrique = fabrique;
	}
 
	public Pizza commanderPizza(String type) {
		Pizza pizza;
 
		pizza = fabrique.creerPizza(type);
 
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}

}
