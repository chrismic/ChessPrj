package chess;

public class Rook extends ChessPiece{
	/******************************************************************
	 * constructor that also calls the ChessPiece constructor
	 * @param player black or white piece
	 ***************************************************************/
	public Rook(Player player) {
		super(player);
	}

	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public String type() {
		return "Rook";
	}

	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {

			// if the player is white
			if(this.player()==Player.WHITE){
				// if the selected move is in the same row
				if(move.fromRow==move.toRow){
					int spaces = Math.abs(move.toColumn-move.fromColumn);
					
					// if the player wants to move left
					if(move.toColumn<move.fromColumn){
						int count = 0;
						for(int i=move.fromColumn;i>move.toColumn;i--){
							//if there is a player on any of the spaces
							if(board[move.toRow][i].player()==
									Player.BLACK||board[move.toRow]
											[i].player()==Player.WHITE){
								count++;
							}
							else{
								
							}
						}
						if(count==0){
							return true;
						}
						else{
							return false;
						}
					}
					// if the player wanted to move right
					else if(move.toColumn>move.fromColumn){
						int count = 0;
						for(int i=move.fromColumn;i<spaces;i++){
							//if there is a player on any of the spaces
							if(board[move.toRow][i].player()==
									Player.BLACK||board[move.toRow]
											[i].player()==Player.WHITE){
								count++;
							}
							else{
								
							}
						}
						if(count==0){
							return true;
						}
						else{
							return false;
						}
					}
					else{
						return false;
					}

				}
				// if the selected move is in the same column
				else if(move.fromColumn==move.toColumn){
					int spaces = Math.abs(move.toRow-move.fromRow);
					
					// if the player wants to move down
					if(move.toRow>move.fromRow){
						int count = 0;
						for(int i=move.fromRow;i<spaces;i++){
							//if there is a player on any of the spaces
							if(board[move.toRow][i].player()==
									Player.BLACK||board[move.toRow]
											[i].player()==Player.WHITE){
								count++;
							}
							else{
								
							}
						}
						if(count==0){
							return true;
						}
						else{
							return false;
						}
					}
					//if the player wants to move up
					else if(move.toRow<move.fromRow){

					}
					else{
						return false;
					}
				}
				else{
					return false;
				}
			}

			// if the player is black
			else if(this.player()==Player.BLACK){
				// if the selected move is in the same row
				if(move.fromRow==move.toRow){
					// if the player wants to move left
					if(move.toColumn<move.fromColumn){

					}
					// if the player wanted to move right
					else if(move.toColumn>move.fromColumn){

					}
					else{
						return false;
					}
				}
				// if the selected move is in the same column
				else if(move.fromColumn==move.toColumn){
					// if the player wants to move down
					if(move.toRow>move.fromRow){

					}
					//if the player wants to move up
					else if(move.toRow<move.fromRow){

					}
					else{
						return false;
					}
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}
