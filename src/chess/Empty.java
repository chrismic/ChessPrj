package chess;

public class Empty extends ChessPiece{

	/******************************************************************
	 * constructor that also calls the ChessPiece constructor
	 * @param player black or white piece
	 ***************************************************************/
	public Empty(Player player) {
		super(player);
	}

	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public String type() {
		return "Empty";
	}

	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		return true;
	}

}
