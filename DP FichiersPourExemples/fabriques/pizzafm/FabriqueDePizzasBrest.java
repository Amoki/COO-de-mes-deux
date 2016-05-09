package tetepremiere.fabrique.pizzafm;

public class FabriqueDePizzasBrest extends Pizzeria {

	Pizza creerPizza(String item) {
		if (item.equals("fromage")) {
			return new PizzaFromageStyleBrest();
		} else if (item.equals("vegetarienne")) {
			return new PizzaVegetarienneStyleBrest();
		} else if (item.equals("fruitsDeMer")) {
			return new PizzaFruitsDeMerStyleBrest();
		} else if (item.equals("poivrons")) {
			return new PizzaPoivronsStyleBrest();
		} else return null;
	}
}
