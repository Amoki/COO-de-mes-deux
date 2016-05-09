package tetepremiere.etat.bonbonetat;

public class EtatVendu implements Etat {
 
    Distributeur distributeur;
 
    public EtatVendu(Distributeur distributeur) {
        this.distributeur = distributeur;
    }
       
	public void insererPiece() {
		System.out.println("Veuillez patienter, le bonbon va tomber");
	}
 
	public void ejecterPiece() {
		System.out.println("Vous avez déjà tourné la poignée");
	}
 
	public void tournerPoignee() {
		System.out.println("Inutile de tourner deux fois !");
	}
 
	public void delivrer() {
		distributeur.liberer();
		if (distributeur.getNombre() > 0) {
			distributeur.setEtat(distributeur.getEtatSansPiece());
		} else {
			System.out.println("Aïe, plus de bonbons !");
			distributeur.setEtat(distributeur.getEtatEpuise());
		}
	}
 
	public String toString() {
		return "délivre un bonbon";
	}
}


