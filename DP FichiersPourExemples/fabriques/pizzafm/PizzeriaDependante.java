package tetepremiere.fabrique.pizzafm;

public class PizzeriaDependante {
 
	public Pizza creerPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("Brest")) {
			if (type.equals("fromage")) {
				pizza = new PizzaFromageStyleBrest();
			} else if (type.equals("vegetarienne")) {
				pizza = new PizzaVegetarienneStyleBrest();
			} else if (type.equals("fruitsDeMer")) {
				pizza = new PizzaFruitsDeMerStyleBrest();
			} else if (type.equals("poivrons")) {
				pizza = new PizzaPoivronsStyleBrest();
			}
		} else if (style.equals("Strasbourg")) {
			if (type.equals("fromage")) {
				pizza = new PizzaFromageStyleStrasbourg();
			} else if (type.equals("vegetarienne")) {
				pizza = new PizzaVegetarienneStyleStrasbourg();
			} else if (type.equals("fruitsDeMer")) {
				pizza = new PizzaFruitsDeMerStyleStrasbourg();
			} else if (type.equals("poivrons")) {
				pizza = new PizzaPoivronsStyleStrasbourg();
			}
		} else {
			System.out.println("Erreur : type de pizza invalide");
			return null;
		}
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		return pizza;
	}
}
