package tetepremiere.fabrique.pizzafm;

public class TestPizzeria {
 
	public static void main(String[] args) {
		Pizzeria fabriqueBrest = new FabriqueDePizzasBrest();

 		Pizza pizza = fabriqueBrest.commanderPizza("fromage");
		System.out.println("Luc a commandé une " + pizza.getNom() + "\n");
 		
		pizza = fabriqueBrest.commanderPizza("fruitsDeMer");
		System.out.println("Luc a commandé une " + pizza.getNom() + "\n");
 
		pizza = fabriqueBrest.commanderPizza("poivrons");
		System.out.println("Luc a commandé une " + pizza.getNom() + "\n");
 	
		pizza = fabriqueBrest.commanderPizza("vegetarienne");
		System.out.println("Luc a commandé une " + pizza.getNom() + "\n");
 		
	}
}
