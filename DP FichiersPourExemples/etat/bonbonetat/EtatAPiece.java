package tetepremiere.etat.bonbonetat;


public class EtatAPiece implements Etat {
	Distributeur distributeur;
 
	public EtatAPiece(Distributeur distributeur) {
		this.distributeur = distributeur;
	}
  
	public void insererPiece() {
		System.out.println("Vous ne pouvez pas insérer d'autre pièce");
	}
 
	public void ejecterPiece() {
		System.out.println("Pièce retournée");
		distributeur.setEtat(distributeur.getEtatSansPiece());
	}
 
	public void tournerPoignee() {
		System.out.println("Vous avez tourné....");
		distributeur.setEtat(distributeur.getEtatVendu());
	}

    public void delivrer() {
        System.out.println("Pas de bonbon délivré");
    }
 
	public String toString() {
		return "attend que la poignée soit tournée";
	}
}
