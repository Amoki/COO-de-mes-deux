package launcher.localLauncher;

import controler.ChessGameControlers;

import javax.swing.*;
import java.awt.*;

/**
 * Created by MSIgamer on 29/04/2016.
 */
public class ChessGameGUI extends JFrame {

    //new ChessGameGUI("Jeu d'échec", chessGameControler,  dim)
    private String gameName;
    private ChessGameControlers chessGameControlers;

    public ChessGameGUI(String gameName, ChessGameControlers chessGameControlers, Dimension dim) {
        this.gameName = gameName;
        this.chessGameControlers = chessGameControlers;
        this.setPreferredSize(dim);
    }
}
