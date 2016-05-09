package tetepremiere.etat.bonbonetat;

public class EtatSansPiece implements Etat {
    Distributeur distributeur;
 
    public EtatSansPiece(Distributeur distributeur) {
        this.distributeur = distributeur;
    }
 
	public void insererPiece() {
		System.out.println("Vous avez inséré une pièce");
		distributeur.setEtat(distributeur.getEtatAPiece());
	}
 
	public void ejecterPiece() {
		System.out.println("Vous n'avez pas inséré de pièce");
	}
 
	public void tournerPoignee() {
		System.out.println("Vous avez tourné, mais il n'y a pas de pièce");
	 }
 
	public void delivrer() {
		System.out.println("Il faut payer d'abord");
	} 
 
	public String toString() {
		return "attend une pièce";
	}
}
