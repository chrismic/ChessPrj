package chess;

public class Queen extends ChessPiece{
	/******************************************************************
	 * constructor that also calls the ChessPiece constructor
	 * @param player black or white piece
	 ***************************************************************/
	public Queen(Player player) {
		super(player);
	}

	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public String type() {
		return "Queen";
	}


	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			// if its diagonal
			if(Math.abs(move.toColumn-move.toRow)==Math.abs(move.fromColumn-move.fromRow)){

				// if the move is down
				if(move.toRow>move.fromRow){
					// if the move is down right
					if(move.toColumn>move.fromColumn){
						int count = 0;
						int c = move.fromColumn+1;
						int r = move.fromRow+1;
						for(int i=move.fromRow;i<move.toRow;i++){
							if(board[r][c].player()==Player.BLACK ||
									board[r][c].player()==Player.WHITE){
								count++;
							}
							else{

							}
							c++;
							r++;
						}
						if(count==0){
							return true;
						}
						else{
							return false;
						}
					}
					// if the move is down left
					else if(move.toColumn<move.fromColumn){
						int count = 0;
						int c = move.fromColumn-1;
						int r = move.fromRow+1;
						for(int i=move.fromRow;i<move.toRow;i++){
							if(board[r][c].player()==Player.BLACK ||
									board[r][c].player()==Player.WHITE){
								count++;
							}
							else{

							}
							c--;
							r++;
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

				// if the move is up
				else if(move.toRow<move.fromRow){

					// if the move is up right
					if(move.toColumn>move.fromColumn){
						int count = 0;
						int c = move.fromColumn+1;
						int r = move.fromRow-1;
						for(int i=move.fromRow;i>move.toRow;i--){
							if(board[r][c].player()==Player.BLACK ||
									board[r][c].player()==Player.WHITE){
								count++;
							}
							else{

							}
							c++;
							r--;
						}
						if(count==0){
							return true;
						}
						else{
							return false;
						}
					}

					// if the move is up left
					else if(move.toColumn<move.fromColumn){
						int count = 0;
						int c = move.fromColumn-1;
						int r = move.fromRow-1;
						for(int i=move.fromRow;i>move.toRow;i--){
							if(board[r][c].player()==Player.BLACK ||
									board[r][c].player()==Player.WHITE){
								count++;
							}
							else{

							}
							c--;
							r--;
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
				else {
					return false;
				}
			}
			// if the selected move is in the same row
			if(move.fromRow==move.toRow){
				
				// if the player wants to move left
				if(move.toColumn<move.fromColumn){
					int count = 0;
					for(int i=move.fromColumn-1;i>move.toColumn;i--){
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
					for(int i=move.fromColumn+1;i<move.toColumn;i++){
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
				
				// if the player wants to move down
				if(move.toRow>move.fromRow){
					int count = 0;
					for(int i=move.fromRow+1;i<move.toRow;i++){
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
					int count = 0;
					for(int i=move.fromRow-1;i>move.toRow;i--){
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
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}
