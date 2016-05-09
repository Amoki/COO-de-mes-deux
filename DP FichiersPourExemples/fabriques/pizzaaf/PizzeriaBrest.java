package tetepremiere.fabrique.pizzaaf;

public class PizzeriaBrest extends Pizzeria {
 
	protected Pizza creerPizza(String item) {
		Pizza pizza = null;
		FabriqueIngredientsPizza fabriqueIngredients = 
			new FabriqueIngredientsPizzaBrest();
 
		if (item.equals("fromage")) {
  
			pizza = new PizzaFromage(fabriqueIngredients);
			pizza.setNom("Pizza style Brest et fromage");
  
		} else if (item.equals("vegetarienne")) {
 
			pizza = new PizzaVegetarienne(fabriqueIngredients);
			pizza.setNom("Pizza végétarienne style Brest");
 
		} else if (item.equals("fruitsDeMer")) {
 
			pizza = new PizzaFruitsDeMer(fabriqueIngredients);
			pizza.setNom("Pizza style Brest aux fruits de mer");
 
		} else if (item.equals("poivrons")) {

			pizza = new PizzaPoivrons(fabriqueIngredients);
			pizza.setNom("Pizza style Brest aux poivrons");
 
		} 
		return pizza;
	}
}
