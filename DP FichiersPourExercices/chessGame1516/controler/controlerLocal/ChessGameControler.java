package controler.controlerLocal;

import controler.ChessGameControlers;
import model.ChessGame;
import model.Coord;
import model.PiecesIHM;
import tools.Observer;
import tools.UndoRedo;

import java.util.ArrayList;

public class ChessGameControler implements ChessGameControlers, UndoRedo {

    private ChessGame chessGame;

    public ChessGameControler(ChessGame chessGame) {
        this.chessGame = chessGame;
    }

    @Override
    public boolean move(Coord initCoord, Coord finalCoord) {
        return this.chessGame.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
    }

    public ArrayList<Coord> getAvailableMove(Coord pieceToMoveCoord) {
        return this.chessGame.getAvailableMove(pieceToMoveCoord);
    }

    @Override
    public String getMessage() {
        return this.chessGame.getMessage();
    }

    @Override
    public boolean isEnd() {
        return this.chessGame.isEnd();
    }

    @Override
    public boolean isPlayerOK(Coord initCoord) {
        return this.chessGame.getPieceColor(initCoord.x, initCoord.y) == this.chessGame.getColorCurrentPlayer();
    }

    public void addObserver(Observer o) {
        this.chessGame.add(o);
    }

    public String toString() {
        return this.chessGame.toString();
    }

    public void undo() {
        this.chessGame.undo();
    }
    public void redon() {
        this.chessGame.redon();
    }
}
