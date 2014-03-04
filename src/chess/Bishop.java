package chess;

public class Bishop extends ChessPiece{

	/******************************************************************
	 * constructor that also calls the ChessPiece constructor
	 * @param player black or white piece
	 ***************************************************************/
	public Bishop(Player player) {
		super(player);
	}

	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public String type() {
		return "Bishop";
	}


	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(super.isValidMove(move, board)) {
			// if the move is a diagonal
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
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}

}
