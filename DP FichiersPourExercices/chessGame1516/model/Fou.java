package model;


import model.MovePieceStrategy.MovePieceStrategy;

/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD *
 */
public class Fou extends AbstractPiece {
	

	/**
	 * @param name
	 * @param couleur_de_piece
	 * @param coord
	 */
	public Fou(Couleur couleur_de_piece, Coord coord, String factory) {
		super(couleur_de_piece, coord, factory);
	}

	
}
