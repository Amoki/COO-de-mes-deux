package model;

import tools.Observable;
import tools.UndoRedo;

import java.util.ArrayList;

/**
 * Created by MSIgamer on 29/04/2016.
 */
public class ChessGame extends Observable {

    private Echiquier echiquier;

    public ChessGame(){
        this.echiquier = new Echiquier();
    }

    public void setGameMode(String gameMode) {
        this.echiquier.setGameMode(gameMode);
    }

    public boolean move (int xInit, int yInit, int xFinal, int yFinal) {
        Boolean moved = false;

        if (this.echiquier.isMoveOk(xInit, yInit, xFinal, yFinal)) {

            moved = this.echiquier.move(xInit, yInit, xFinal, yFinal);
            if (moved) {
                this.echiquier.switchJoueur();
            }
        }
        notify(this.echiquier.getPiecesIHM());
        System.out.println(this.echiquier.getMessage());
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

    public ArrayList<Coord> getAvailableMove(Coord pieceToMoveCoord) {
        return echiquier.getAvailableMove(pieceToMoveCoord);
    }


    @Override
    public String toString() {
        return echiquier.toString() + "\n" + getMessage();
    }

    public void undo() {
        this.echiquier.undo();
        notify(this.echiquier.getPiecesIHM());
    }

    public void redon() {
        this.echiquier.redon();
        notify(this.echiquier.getPiecesIHM());
    }
}
