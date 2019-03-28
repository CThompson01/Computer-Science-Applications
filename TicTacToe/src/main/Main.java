package main;

import gamepieces.GamePiece;
import gamepieces.X;

import javax.swing.*;

public class Main {
	
	

	public static void main(String[] args) {
		Board ticTacToe = new Board();
		boolean keepPlaying = true;

		while (keepPlaying) {
			ticTacToe.reset();
			while (!ticTacToe.isFinished()) {
				// Gets Player Input to place piece
				int playerPiece = Integer.parseInt(JOptionPane.showInputDialog(null,
						ticTacToe.printBoard() + "\nChoose a location to place a piece.",
						"TicTacToe", JOptionPane.INFORMATION_MESSAGE));

				// Continues to get player input until they select a non occupied space
				while (ticTacToe.isFilled(playerPiece)) {
					playerPiece = Integer.parseInt(JOptionPane.showInputDialog(null,
							ticTacToe.printBoard() + "\nThat location is occupied, please select another.",
							"TicTacToe", JOptionPane.INFORMATION_MESSAGE));
				}

				// Places the player piece
				ticTacToe.placePiece(playerPiece, new X());

				// Checks to see if there is a win condition
				ticTacToe.checkForWin(playerPiece, "You");

				// Places the AI piece
				int aiPosition = ticTacToe.placeAI();

				// Checks to see if there is a win condition
				ticTacToe.checkForWin(aiPosition, "AI");
			}

			keepPlaying = JOptionPane.showConfirmDialog(null, ticTacToe.getWinner() + " won!!!!\n" +
					"Would you like to play again?") == JOptionPane.YES_OPTION;
		}

	}

}
