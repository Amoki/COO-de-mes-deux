package model;

import tools.Observable;

/**
 * Created by MSIgamer on 29/04/2016.
 */
public class ChessGame extends Observable {

    private Echiquier echiquier;

    public ChessGame(){
        this.echiquier = new Echiquier();
    }

    public boolean move (int xInit, int yInit, int xFinal, int yFinal) {
        Boolean moved = false;

        if (this.echiquier.isMoveOk(xInit, yInit, xFinal, yFinal)) {

            moved = this.echiquier.move(xInit, yInit, xFinal, yFinal);
            if (moved) {
                notify(this.echiquier.getPiecesIHM());
                this.echiquier.switchJoueur();
            }
        }
        return moved;
    }

    public boolean isEnd(){
        return echiquier.isEnd();
    }

    public String getMessage(){
        return echiquier.getMessage();
    }

    public Couleur getColorCurrentPlayer(){
        return echiquier.getColorCurrentPlayer();
    }

    public Couleur getPieceColor(int x, int y){
        return echiquier.getPieceColor(x, y);
    }


    @Override
    public String toString() {
        return echiquier.toString() + "\n" + getMessage();
    }

}
