package tetepremiere.etat.bonbon;

public class Distributeur {
 
	final static int EPUISE = 0;
	final static int SANS_PIECE = 1;
	final static int A_PIECE = 2;
	final static int VENDU = 3;
 
	int etat = EPUISE;
	int compte = 0;
  
	public Distributeur(int nombre) {
		this.compte = nombre;
		if (nombre > 0) {
			etat = SANS_PIECE;
		}
	}
  
	public void insererPiece() {
		if (etat == A_PIECE) {
			System.out.println("Vous ne pouvez plus insérer de pièces");
		} else if (etat == SANS_PIECE) {
			etat = A_PIECE;
			System.out.println("Vous avez inséré une pièce");
		} else if (etat == EPUISE) {
			System.out.println("Vous ne pouvez pas insérer de pièce, nous sommes en rupture de stock");
		} else if (etat == VENDU) {
        	System.out.println("Veuillez patienter, le bonbon va tomber");
		}
	}

	public void ejecterPiece() {
		if (etat == A_PIECE) {
			System.out.println("Pièce retournée");
			etat = SANS_PIECE;
		} else if (etat == SANS_PIECE) {
			System.out.println("Vous n'avez pas inséré de pièce");
		} else if (etat == VENDU) {
			System.out.println("Vous avez déjà tourné la poignée");
		} else if (etat == EPUISE) {
        	System.out.println("ejection impossible, vous n'avez pas inséré de pièce");
		}
	}
 

 
 
	public void tournerPoignee() {
		if (etat == VENDU) {
			System.out.println("Inutile de tourner deux fois !");
		} else if (etat == SANS_PIECE) {
			System.out.println("Vous avez tourné mais il n'y a pas de pièce");
		} else if (etat == EPUISE) {
			System.out.println("YVous avez tourné, mais il n'y a pas de bonbons");
		} else if (etat == A_PIECE) {
			System.out.println("Vous avez tourné...");
			etat = VENDU;
			delivrer();
		}
	}
 
	public void delivrer() {
		if (etat == VENDU) {
			System.out.println("Un bonbon va sortir");
			compte = compte - 1;
			if (compte == 0) {
				System.out.println("Aïe, plus de bonbons !");
				etat = EPUISE;
			} else {
				etat = SANS_PIECE;
			}
		} else if (etat == SANS_PIECE) {
			System.out.println("Il faut payer d'abord");
		} else if (etat == EPUISE) {
			System.out.println("Pas de bonbon délivré");
		} else if (etat == A_PIECE) {
			System.out.println("Pas de bonbon délivré");
		}
	}
 
	public void remplir(int numGumBalls) {
		this.compte = numGumBalls;
		etat = SANS_PIECE;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nDistribon, SARL.");
		result.append("\nDistributeur compatible Java, modèle 2004\n");
		result.append("Stock: " + compte + " bonbon");
		if (compte != 1) {
			result.append("s");
		}
		result.append("\nL'appareil ");
		if (etat == EPUISE) {
			result.append("n'a plus de bonbon");
		} else if (etat == SANS_PIECE) {
			result.append("attend une pièce");
		} else if (etat == A_PIECE) {
			result.append("attend que l'on tourne la poignée");
		} else if (etat == VENDU) {
			result.append("est en train de délivrer un bonbon");
		}
		result.append("\n");
		return result.toString();
	}
}


