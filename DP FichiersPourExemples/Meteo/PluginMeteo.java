public class PluginMeteo implements Observateur {
    protected DonneesMeteo donneesMeteo;
    protected double temperature;
    protected double pressionCourante, dernierePression;
   

    public PluginMeteo(DonneesMeteo donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.ajoute(this);
        this.actualise();
    }

    public void actualise() {
        temperature = donneesMeteo.getTemperature();
        dernierePression = pressionCourante;
		pressionCourante = donneesMeteo.getPression();
        affiche();
    }

	public void affiche()
	{
		System.out.println("Le Plugin affiche une température de: "
						+ temperature);
		System.out.print("Prévision : ");
		if (pressionCourante > dernierePression)
		{
			System.out.println("Amélioration en cours !");
		}
		else if (pressionCourante == dernierePression)
		{
			System.out.println("Le temps se rafraîchit");
		}
		else if (pressionCourante < dernierePression)
		{
			System.out.println("Dépression bien installée");
		}
	}
}
	