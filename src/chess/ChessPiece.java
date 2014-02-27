package chess;

public abstract class ChessPiece implements IChessPiece {

	private Player owner;

	/******************************************************************
	 * constuctor that sets owner to the parameter value
	 * @param player black or white piece
	 ***************************************************************/
	protected ChessPiece(Player player) {
		this.owner = player;
	}

	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public abstract String type();

	/******************************************************************
	 * Return the player that owns this piece.
	 *
	 * @return the player that owns this piece.
	 *****************************************************************/
	public Player player() {
		return owner;
	}

	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if((move.fromRow==move.toRow)&&
				(move.fromColumn==move.toColumn)) {
			return false;
		}
		else if(board[move.fromRow][move.fromColumn].player()==
				board[move.toRow][move.toColumn].player()) {
			return false;
		}
		else{
			return true;
		}
	}
}
