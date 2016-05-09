public class DonneesMeteo extends Sujet {    protected Double temperature;    protected Double pression;    protected Double tauxHumidite;    public Double getTemperature() {        return temperature;    }    public void setTemperature(Double temperature) {        this.temperature = temperature;        notifie();    }    public Double getPression() {
		return pression;    }

	public void setPression(Double pression)
	{
		this.pression = pression;        notifie();    }    public Double getTauxHumidite() {        return tauxHumidite;    }    public void setTauxHumidite(Double tauxHumidite) {        this.tauxHumidite = tauxHumidite;        notifie();    }}