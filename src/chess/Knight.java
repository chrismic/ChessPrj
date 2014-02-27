package chess;

public class Knight extends ChessPiece{
	/******************************************************************
	 * constructor that also calls the ChessPiece constructor
	 * @param player black or white piece
	 ***************************************************************/
	public Knight(Player player) {
		super(player);
	}
	
	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public String type() {
		return "Knight";
	}
	
	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			if(board[move.toRow][move.toColumn]==
					board[move.fromRow+1][move.fromColumn+2]) {
				return true;
			}
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow-1][move.fromColumn+2]) {
				return true;
			}
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow+2][move.fromColumn+1]) {
				return true;
			}
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow+2][move.fromColumn-1]) {
				return true;
			}
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow-1][move.fromColumn-2]) {
				return true;
			}
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow+1][move.fromColumn-2]) {
				return true;
			}
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow-2][move.fromColumn-1]) {
				return true;
			}
			else if(board[move.toRow][move.toColumn]==
					board[move.fromRow-2][move.fromColumn+1]) {
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
