package model;

/**
 * Created by LEBRUN_NICOLAS on 29/04/16.
 */
public class PionBlanc extends Pion {

    public PionBlanc(Couleur couleur, Coord coord) { //TODO Voir pour enlever le paramètre couleur inutile (cf ChessPiecesFactory)
        super(Couleur.BLANC, coord);
    }

    public boolean isMoveVerticalOk(int yFinal) {
        return (yFinal - this.getY()) < 0;
    }

    public boolean isMoveDiagonalOk(int xFinal, int yFinal) {
        Boolean ret = false;
        if ((yFinal == this.getY()-1 && xFinal == this.getX()+1)
                || (yFinal == this.getY()-1 && xFinal == this.getX()-1)) {
            ret = true;
        }
        return ret;
    }


}

