package tetepremiere.fabrique.pizzas;

public class TestPizzeria {
 
	public static void main(String[] args) {
		SimpleFabriqueDePizzas fabrique = new SimpleFabriqueDePizzas();
		Pizzeria store = new Pizzeria(fabrique);

		Pizza pizza = store.commanderPizza("fromage");
		System.out.println("Nous avons commandé une pizza " + pizza.getNom() + "\n");
 
		pizza = store.commanderPizza("vegetarienne");
		System.out.println("Nous avons commandé une pizza " + pizza.getNom() + "\n");
	}
}
