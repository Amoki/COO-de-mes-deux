package tetepremiere.etat.bonbon;

public class TestDistributeur {

	public static void main(String[] args) {
		Distributeur distributeur = new Distributeur(5);

		System.out.println(distributeur);

		distributeur.insererPiece();
		distributeur.tournerPoignee();

		System.out.println(distributeur);

		distributeur.insererPiece();
		distributeur.ejecterPiece();
		distributeur.tournerPoignee();

		System.out.println(distributeur);

		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.ejecterPiece();

		System.out.println(distributeur);

		distributeur.insererPiece();
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.insererPiece();
		distributeur.tournerPoignee();
		distributeur.insererPiece();
		distributeur.tournerPoignee();

		System.out.println(distributeur);
	}
}
