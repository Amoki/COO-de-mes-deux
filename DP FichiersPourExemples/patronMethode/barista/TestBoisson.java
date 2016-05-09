package tetepremiere.patronmethode.barista;

public class TestBoisson {
	public static void main(String[] args) {
 
		The the = new The();
		Cafe cafe = new Cafe();
 
		System.out.println("\nPréparation du thé...");
		the.suivreRecette();
 
		System.out.println("\nPréparation du café...");
		cafe.suivreRecette();

 
		TheAvecAdaptateur theAdapt = new TheAvecAdaptateur();
		CafeAvecAdaptateur cafeAdapt = new CafeAvecAdaptateur();
 
		System.out.println("\nPréparation du thé...");
		theAdapt.suivreRecette();
 
		System.out.println("\nPréparation du café...");
		cafeAdapt.suivreRecette();
	}
}
