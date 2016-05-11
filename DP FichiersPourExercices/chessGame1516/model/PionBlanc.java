package model;

import model.MovePieceStrategy.MovePieceStrategy;

/**
 * Created by LEBRUN_NICOLAS on 29/04/16.
 */
public class PionBlanc extends AbstractPiece {

    public PionBlanc(Couleur couleur, Coord coord, String factory) { //TODO Voir pour enlever le paramètre couleur inutile (cf ChessPiecesFactory)

        super(Couleur.BLANC, coord, factory);
    }


}

