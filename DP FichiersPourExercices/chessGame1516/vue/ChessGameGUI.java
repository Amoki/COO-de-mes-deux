package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controler.ChessGameControlers;
import model.ChessGame;
import model.Coord;
import model.Couleur;
import tools.ChessImageProvider;
import model.Couleur;
import model.Deplacement;
import model.Messages;
import model.ResponseChessGame;
import model.observable.ChessGame;
import tools.ChessImageProvider;
import tools.Utils;

public class ChessGameGUI extends JFrame implements MouseListener, MouseMotionListener, Observer {

    private static final long serialVersionUID = 1L;

    protected JLayeredPane layeredPane;
    protected JPanel chessBoard;
    protected JLabel chessPiece;
    protected int xAdjustment;
    protected int yAdjustment;
    protected Map<JPanel, Coord> mapCoord = new HashMap<JPanel, Coord> ();
    protected Coord coordPieceSelected;
    protected ChessGameControlers chessGameControlers;

    public ChessGameGUI (String title, ChessGameControlers chessGameControler, Dimension dim) {

        this.chessGameControlers = chessGameControler;

        // Use a Layered Pane for this this application
        this.setTitle (title);
        this.setResizable (false);
        layeredPane = new JLayeredPane ();
        getContentPane ().add (layeredPane);
        layeredPane.setPreferredSize (dim);
        layeredPane.addMouseListener (this);
        layeredPane.addMouseMotionListener (this);

        // Add a chess board to the Layered Pane
        chessBoard = new JPanel ();
        layeredPane.add (chessBoard, JLayeredPane.DEFAULT_LAYER);
        chessBoard.setLayout (new GridLayout (8, 8));
        chessBoard.setPreferredSize (dim);
        chessBoard.setBounds (0, 0, dim.width, dim.height);

        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel (new BorderLayout ());
            chessBoard.add (square);

            int pairLine = (i / 8) % 2;
            if (pairLine == 0) {
                square.setBackground (i % 2 == 0 ? Color.white : Color.black);
            }
            else {
                square.setBackground (i % 2 == 0 ? Color.black : Color.white);
            }

            DecimalFormat df = new DecimalFormat ("#");
            df.setRoundingMode (RoundingMode.DOWN);
            int row = Integer.parseInt (df.format (i / 8));
            int column = i % 8;

            this.mapCoord.put (square, new Coord (column, row));

            // Add all pieces to the board
            if (ChessImageProvider.isCoordOK (row, column)) {
                String type = ChessImageProvider.getType (row, column);
                Couleur couleur = ChessImageProvider.getCouleur (row, column);
                JLabel piece = new JLabel (new ImageIcon (ChessImageProvider.getImageFile (type, couleur)));
                JPanel panel = (JPanel) chessBoard.getComponent (i);
                panel.add (piece);
            }
        }
    }

    @ Override
    public void mousePressed (MouseEvent e) {
        chessPiece = null;
        Component c = chessBoard.findComponentAt (e.getX (), e.getY ());

        if (c instanceof JPanel) {
            return;
        }

        Point parentLocation = c.getParent ().getLocation ();
        this.coordPieceSelected = this.mapCoord.get (c.getParent ());
        xAdjustment = parentLocation.x - e.getX ();
        yAdjustment = parentLocation.y - e.getY ();
        chessPiece = (JLabel) c;
        chessPiece.setLocation (e.getX () + xAdjustment, e.getY () + yAdjustment);
        chessPiece.setSize (chessPiece.getWidth (), chessPiece.getHeight ());
        layeredPane.add (chessPiece, JLayeredPane.DRAG_LAYER);
    }

    @ Override
    public void mouseDragged (MouseEvent e) {
        if (chessPiece == null) {
            return;
        }
        chessPiece.setLocation (e.getX () + xAdjustment, e.getY () + yAdjustment);
    }

    @ Override
    public void mouseReleased (MouseEvent e) {
        if (chessPiece == null) {
            return;
        }

        chessPiece.setVisible (false);
        Component c = chessBoard.findComponentAt (e.getX (), e.getY ());
        Container parent = null;

        if (c instanceof JLabel) { // Il y a déjà une pièce
            parent = c.getParent ();
        }
        else if (c instanceof JPanel) { // Case vide
            parent = (Container) c;
        }
        else {
            parent = Utils.getKeyByValue (mapCoord, coordPieceSelected);
        }
        Coord coordNewBox = this.mapCoord.get (parent);

        this.chessGameControlers.move (coordPieceSelected, coordNewBox);

        chessPiece.setVisible (true);
        coordPieceSelected = null;
    }

    @ Override
    public void mouseClicked (MouseEvent e) {

    }

    @ Override
    public void mouseMoved (MouseEvent e) {

    }

    @ Override
    public void mouseEntered (MouseEvent e) {

    }

    @ Override
    public void mouseExited (MouseEvent e) {

    }

    @ Override
    public void update (Observable o, Object arg) {
        if (o instanceof ChessGame) {
            ResponseChessGame args = (ResponseChessGame) arg;
            JPanel panel = new JPanel ();
            Couleur couleur = args.sens == -1 ? Couleur.BLANC : Couleur.NOIR;

            // MAJ capture
            JPanel panelCapture = null;
            if (args.ret == Deplacement.CAPTURE || args.ret == Deplacement.CAPTURE_PROMOTION) {
                panelCapture = Utils.getKeyByValue (this.mapCoord, new Coord (args.xFinal, args.yFinal));
            }
            else if (args.ret == Deplacement.CAPTURE_PASSANT) {
                panelCapture = Utils.getKeyByValue (this.mapCoord, new Coord (args.xFinal, args.yFinal - args.sens));
            }

            if (panelCapture != null) {
                panelCapture.removeAll ();
                this.repaint ();
            }

            // MAJ déplacement
            if (args.ret != Deplacement.IMMOBILE) {
                panel = Utils.getKeyByValue (this.mapCoord, new Coord (args.xFinal, args.yFinal));
            }
            else {
                panel = Utils.getKeyByValue (this.mapCoord, new Coord (args.xInit, args.yInit));
            }

            // Promotion
            if (args.ret == Deplacement.CAPTURE_PROMOTION || args.ret == Deplacement.DEPLACEMENT_PROMOTION) {
                PopupPromotion popup = new PopupPromotion (couleur, this.chessGameControlers);
                String type = popup.getNewPiece ();
                if (!type.equals ("")) {
                    this.chessPiece = new JLabel (new ImageIcon (ChessImageProvider.getImageFile (type, couleur)));
                }
            }

            panel.add (this.chessPiece);
            this.pack ();
            this.repaint ();
            Messages message = this.chessGameControlers.getMessage ();
            if (message.isToDisplay ()) {
                JOptionPane.showMessageDialog (this, this.chessGameControlers.getMessage ().toString (), message.getTitre (), message.getTypeMessage ());
            }
        }
    }
}