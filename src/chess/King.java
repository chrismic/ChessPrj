package chess;

public class King extends ChessPiece{
	/******************************************************************
	 * constructor that also calls the ChessPiece constructor
	 * @param player black or white piece
	 ***************************************************************/
	public King(Player player) {
		super(player);
	}

	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public String type() {
		return "King";
	}

	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			// if the player is trying to move up left
			if(board[move.toRow][move.toColumn]==
					board[move.fromRow-1][move.fromColumn-1]) {
				return true;
			}
			// if the player is trying to move left
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow][move.fromColumn-1]) {
				return true;
			}
			// if the player is trying to move down left
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow+1][move.fromColumn-1]) {
				return true;
			}
			// if the player is trying to move up
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow-1][move.fromColumn]) {
				return true;
			}
			// if the player is trying to move down
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow+1][move.fromColumn]) {
				return true;
			}
			// if the player is trying to move down right
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow+1][move.fromColumn+1]) {
				return true;
			}
			// if the player is trying to move right
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow][move.fromColumn+1]) {
				return true;
			}
			// if the player is trying to move up right
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow-1][move.fromColumn+1]) {
				return true;
			}
			else {
				return false;
			}
		}
		else{
			return false;
		}
	}
}
