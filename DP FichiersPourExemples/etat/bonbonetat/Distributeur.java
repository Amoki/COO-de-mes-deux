package tetepremiere.etat.bonbonetat;

public class Distributeur {
 
	Etat etatEpuise;
	Etat etatSansPiece;
	Etat etatAPiece;
	Etat etatVendu;
 
	Etat etat = etatEpuise;
	int nombre = 0;
 
	public Distributeur(int nombreBonbons) {
		etatEpuise = new EtatEpuise(this);
		etatSansPiece = new EtatSansPiece(this);
		etatAPiece = new EtatAPiece(this);
		etatVendu = new EtatVendu(this);

		this.nombre = nombreBonbons;
 		if (nombreBonbons > 0) {
			etat = etatSansPiece;
		} 
	}
 
	public void insererPiece() {
		etat.insererPiece();
	}
 
	public void ejecterPiece() {
		etat.ejecterPiece();
	}
 
	public void tournerPoignee() {
		etat.tournerPoignee();
		etat.delivrer();
	}

	void setEtat(Etat etat) {
		this.etat = etat;
	}
 
	void liberer() {
		System.out.println("Un bonbon va sortir...");
		if (nombre != 0) {
			nombre = nombre - 1;
		}
	}
 
	int getNombre() {
		return nombre;
	}
 
	void refill(int nombre) {
		this.nombre = nombre;
		etat = etatSansPiece;
	}

    public Etat getEtat() {
        return etat;
    }

    public Etat getEtatEpuise() {
        return etatEpuise;
    }

    public Etat getEtatSansPiece() {
        return etatSansPiece;
    }

    public Etat getEtatAPiece() {
        return etatAPiece;
    }

    public Etat getEtatVendu() {
        return etatVendu;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nDistribon, SARL.");
		result.append("\nDistributeur compatible Java, modèle 2004");
		result.append("\nStock : " + nombre + " bonbon");
		if (nombre != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("L'appareil " + etat + "\n");
		return result.toString();
	}
}
