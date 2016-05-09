package tetepremiere.etat.bonbonetat;

public class EtatEpuise implements Etat {
    Distributeur distributeur;
 
    public EtatEpuise(Distributeur distributeur) {
        this.distributeur = distributeur;
    }
 
	public void insererPiece() {
		System.out.println("Vous ne pouvez pas insérer de pièces, nous sommes en rupture de stock");
	}
 
	public void ejecterPiece() {
		System.out.println("éjection impossible, vous n'avez pas inséré de pièce");
	}
 
	public void tournerPoignee() {
		System.out.println("Vous avez tourné, mais il n'y a pas de bonbons");
	}
 
	public void delivrer() {
		System.out.println("Pas de bonbon délivré");
	}
 
	public String toString() {
		return "est en rupture de stock";
	}
}
