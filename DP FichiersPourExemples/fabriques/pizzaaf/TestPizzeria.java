package tetepremiere.fabrique.pizzaaf;

public class TestPizzeria {
 
	public static void main(String[] args) {
		Pizzeria pizzeriaBrest = new PizzeriaBrest();
		 
		Pizza pizza = pizzeriaBrest.commanderPizza("fromage");
		System.out.println("Luc a commandé une " + pizza + "\n");
 	
		pizza = pizzeriaBrest.commanderPizza("fruitsDeMer");
		System.out.println("Luc a commandé une  " + pizza + "\n");
 	
		pizza = pizzeriaBrest.commanderPizza("poivrons");
		System.out.println("Luc a commandé une " + pizza + "\n");
 		
		pizza = pizzeriaBrest.commanderPizza("vegetarienne");
		System.out.println("Luc a commandé une " + pizza + "\n");
 
		
	}
}
