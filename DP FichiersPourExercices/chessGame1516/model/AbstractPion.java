package model;

/**
 * Created by MSIgamer on 29/04/2016.
 */
public abstract class AbstractPion extends AbstractPiece {

    private boolean premierCoup;

    /**
     * @param couleur
     * @param coord
     */
    public AbstractPion(Couleur couleur, Coord coord) {
        super(couleur, coord);
        this.premierCoup = true;
    }

    /* (non-Javadoc)
	 * @see model.AbstractPiece#isMoveOk(int, int)
	 */
    @Override
    public boolean isMoveOk(int xFinal, int yFinal, boolean isCatchOk,
                            boolean isCastlingPossible) {
        boolean ret = false;

        if (!isCatchOk && !isCastlingPossible) {

            if ((xFinal == this.getX())
                    && (Math.abs(yFinal - this.getY()) <= 1 ||
                    (Math.abs(yFinal - this.getY()) <= 2 && this.premierCoup))) {

                if (this.isMoveVerticalOk(xFinal, yFinal) && this.isMoveHorizontalOk(xFinal, yFinal)) {
                    ret = true;
                }
            }
        }
        return ret;
    }

    public abstract boolean isMoveVerticalOk(int xFinal, int yFinal);

    public abstract boolean isMoveHorizontalOk(int xFinal, int yFinal);


    /* (non-Javadoc)
     * @see model.AbstractPiece#move(int, int)
     */
    @Override
    public boolean move(int x, int y){

        boolean ret = false;

        if(Coord.coordonnees_valides(x,y)){
            this.premierCoup = false;
            ret = super.move(x, y);
        }
        return ret;
    }

}
