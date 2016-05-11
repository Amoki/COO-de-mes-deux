package model;

import model.MovePieceStrategy.MovePieceStrategy;

/**
 * Created by LEBRUN_NICOLAS on 29/04/16.
 */
public class PionNoir extends AbstractPiece {

    public PionNoir(Couleur couleur, Coord coord, String factory) {

        super(Couleur.NOIR, coord, factory);
    }
}