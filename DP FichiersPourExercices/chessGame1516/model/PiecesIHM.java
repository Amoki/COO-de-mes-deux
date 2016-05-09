package model;

/**
 * Created by MSIgamer on 29/04/2016.
 */
public class PiecesIHM {

    private Pieces piece;

    public PiecesIHM(Pieces piece){
        this.piece = piece;
    }

    public int getX(){
        return piece.getX();
    }

    public int getY(){
        return piece.getY();
    }

    public  Couleur getCouleur(){
        return piece.getCouleur();
    }

    public String getName(){
        return piece.getName();
    }

    public String getCode(){
        return piece.getCode();
    }

    @Override
    public String toString() {
        return "Piece IHM : " + getName() +
                " - Position : x:" + getX() + " y:" + getY() +
                " - Couleur : " + getCouleur();
    }
}
