package main;

import gamepieces.Blank;
import gamepieces.GamePiece;
import gamepieces.O;

import java.util.Random;

public class Board {
	
	private GamePiece[][] board = new GamePiece[3][3];
	private boolean gameFinished = false;
	private String winner = "";

	/**
	 * First number is the row, second is the column
	 * {{0,0,0},
	 *  {0,0,0},
	 *  {0,0,0}};
	 *  
	 * For example with [0,2]
	 * {{0,0,X},
	 *  {0,0,0},
	 *  {0,0,0}};
	 *  
	 *  
	 * NUMBER VALUES FOR X AND O
	 * 0 = Blank
	 * 1 = X
	 * 2 = O
	 */

	Board() {
		reset();
	}

	/**
	 * Places the gamepiece on the board
	 * @param absPos The absolute position for the piece to be placed on the board
	 * @param gamePiece The type of the gamepiece (i.e. X or O)
	 */
	void placePiece(int absPos, GamePiece gamePiece) {
		int row = getRow(absPos);
		int col = getColumn(absPos);
		placePiece(row,col,gamePiece);
	}

	/**
	 * Places the gamepiece on the board
	 * @param row The row for the gamepiece to be positioned on
	 * @param col The column for the gamepiece to be positioned on
	 * @param gamePiece The type of the gamepiece (i.e. X or O)
	 */
	private void placePiece(int row, int col, GamePiece gamePiece) {
		board[row][col] = gamePiece;
	}

	/**
	 * Appends the board to a string to be able to printed to a new line
	 * @return The board that is able to be printed to the console or output box
	 */
	String printBoard() {
		StringBuilder boardToPrint = new StringBuilder();
		for (GamePiece[] row : board) {
			for (GamePiece column : row) {
				boardToPrint.append(column.getSymbol());
			}
			boardToPrint.append("\n");
		}
		return boardToPrint.toString();
	}

	/**
	 * Generates a random area to place the AI piece on
	 * If the area is occupied it continues to generate locations
	 */
	int placeAI() {
		// Default starting position
		int position = 1;

		// Generates locations to place the gamepiece while the generated location is occupied
		while (!board[getRow(position)][getColumn(position)].getType().equalsIgnoreCase("blank")) {
			Random rand = new Random();
			position = rand.nextInt(9) + 1;
		}

		// Places the gamepiece
		placePiece(position,new O());

		return position;
	}

	/**
	 * Converts the absolute position into a row for the 2d array
	 * @param absPos The absolute position needing to be converted to a row
	 * @return The row that the absolute position is within
	 */
	private int getRow(int absPos) {
		return (absPos-1)/3;
	}

	/**
	 * Converts the absolute position into a column for the 2d array
	 * @param absPos The absolute position needing to be converted to a column
	 * @return The column that the absolute position is within
	 */
	private int getColumn(int absPos) {
		return (absPos-1)%3;
	}

	public void checkForWin(int absPos, String player) {

		int row = getRow(absPos);
		int col = getColumn(absPos);

		String Player = board[row][col].getType();

		int r = row;
		int c = col;

		boolean onDiagonal = (row == col) || (col == -1 * row + (board.length-1));
		boolean HorizontalWin = true, VerticalWin = true;
		boolean DiagonalWinOne = true, DiagonalWinTwo = true;

		// Check the rows and columns
		for(int n = 0; n < board.length; n++){
			if(!board[r][n].getType().equalsIgnoreCase(Player))
				HorizontalWin = false;
			if(!board[n][c].getType().equalsIgnoreCase(Player))
				VerticalWin = false;
		}

		// Only check diagonals if the move is on a diagonal
		if(onDiagonal){
			// Check the diagonals
			for(int n = 0; n < board.length; n++){
				if(!board[n][n].getType().equalsIgnoreCase(Player))
					DiagonalWinOne = false;
				if(!board[n][-1*n+(board.length-1)].getType().equalsIgnoreCase(Player))
					DiagonalWinTwo = false;
			}
		}
		else{
			DiagonalWinOne = false;
			DiagonalWinTwo = false;
		}

		boolean hasWon = (HorizontalWin || VerticalWin || DiagonalWinOne || DiagonalWinTwo);

		if (hasWon) {
			winner = player;
			gameFinished = true;
		}
	}

	/**
	 * Checks to see if the position input is filled by a gamepiece
	 * @param position The position needing to be checked
	 * @return Whether the position is taken or not
	 */
	boolean isFilled(int position) {
		return !board[getRow(position)][getColumn(position)].getType().equalsIgnoreCase("blank");
	}

	String getWinner() {
		return winner;
	}

	/**
	 * Checks to see if the game is finished
	 * @return Whether the game is finished or not
	 */
	boolean isFinished() {
		return gameFinished;
	}

	/**
	 * Resets the game board back to the default position
	 */
	void reset() {
		int symbol = 0;
		for (int row = 0;row < board.length;row++) {
			for(int column = 0;column < board[row].length;column++) {
				symbol++;
				board[row][column] = new Blank(Integer.toString(symbol));
			}
		}

		gameFinished = false;
	}
}
