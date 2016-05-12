package launcher.localLauncher;

import java.awt.Dimension;
import java.util.Observer;

import javax.swing.*;

import controler.ChessGameControlers;
import controler.controlerLocal.ChessGameControler;
import model.ChessGame;
import vue.ChessGameGUI;


/**
 * @author francoise.perrin
 * Lance l'exécution d'un jeu d'échec en mode graphique.
 * La vue (ChessGameGUI) observe le modèle (ChessGame)
 * les échanges passent par le contrôleur (ChessGameControlers)
 * 
 */
public class LauncherGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ChessGame chessGame;
		ChessGameControlers chessGameControler;
		JFrame frame;
		Dimension dim;

		dim = new Dimension(800, 800);


		chessGame = new ChessGame();
		chessGameControler = new ChessGameControler(chessGame);

		frame = new ChessGameGUI("Jeu d'échec", chessGameControler,  dim);
		Object[] options = {"Classique",
				"Tempête"};

		int n = JOptionPane.showOptionDialog(frame,
				"À quel type de jeu voulez vous jouer?",
				"",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]);

		if (n == 0) {
			chessGame.setGameMode("ClassicBehaviourFactory");
		} else {
			chessGame.setGameMode("StormBehaviourFactory");
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(600, 10);
		frame.setPreferredSize(dim);
		frame.pack();
		frame.setVisible(true);
	}
}
