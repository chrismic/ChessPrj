/******************************************************************
 * @author Michael Christensen, Steven Monroe, Ryan Moyer
 * 
 * @version 7.92.03.14
 * @date today
 ***************************************************************/

/******************************************************************
 * TODO
 * 
 * verify that rows and columns are never confused with the other
 * make sure that black and white sections of isValidMove have no 
 * 		copy/paste issues
 ***************************************************************/

package chess;

public class Pawn extends ChessPiece{

	/******************************************************************
	 * constructor that also calls the ChessPiece constructor
	 * @param player black or white piece
	 ***************************************************************/
	public Pawn(Player player) {
		super(player);
	}

	/******************************************************************
	 * returns the ChessPice type
	 * @return String type
	 *****************************************************************/
	public String type() {
		return "Pawn";
	}

	/*****************************************************************
	 * returns true if the move is valid
	 * @return true if it is valid, else false
	 *****************************************************************/
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		// verifies that the constructor of the super class returns true
		if(super.isValidMove(move, board)) {
			// all the code within this if statement pertains to
			// a white chess piece
			if(this.player()==Player.WHITE) {

				// returns true if the player is trying to move forward
				// and there isn't a player infront of it
				if(board[move.toRow][move.toColumn]==
						board[move.fromRow-1][move.fromColumn]) {
					if(board[move.toRow][move.toColumn].player()!=Player.BLACK) {
						return true;
					}
					else {
						return false;
					}
				}
				
				// checks to see if pawn is at starting location
				else if(move.fromRow == 6){
					// checks to see if possible to move 2 spaces
					if(board[move.toRow][move.toColumn]==
							board[move.fromRow-2][move.fromColumn]) {
						// checks to see if space one ahead is clear
						if((board[move.fromRow-1][move.fromColumn].player()
								!=Player.BLACK) || (board[move.fromRow-1]
										[move.fromColumn].player()
										!=Player.WHITE)) {
							// checks to see if space two ahead is clear
							if(board[move.toRow-2][move.toColumn].player()
									!=player().BLACK){
								return true;
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
				

				//returns true if the player is trying to move diagonally
				//and there is a player of the opposite team there
				else if (board[move.toRow][move.toColumn]==
						board[move.fromRow-1][move.fromColumn+1]) {
					if(board[move.toRow][move.toColumn].player()==Player.BLACK) {
						return true;
					}
					else {
						return false;
					}
				}
				//returns true if the player is trying to move diagonally
				//and there is a player of the opposite team there
				else if(board[move.toRow][move.toColumn]==
						board[move.fromRow-1][move.fromColumn-1]) {
					if(board[move.toRow][move.toColumn].player()==Player.BLACK) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}

			}
			
			
			
			/**********************************************************
			 * BLACK BLACK BLACK BLACK BLACK BLACK BLACK
			 * begins checking if player is black			BLACK
			 * BLACK BLACK BLACK BLACK BLACK BLACK BLACK
			 **********************************************************/
			else if(this.player()==Player.BLACK) {
				//returns true if the player is trying to move forward
				//and there isn't a player infront of it
				if(board[move.toRow][move.toColumn]==
						board[move.fromRow+1][move.fromColumn]) {
					if(board[move.toRow][move.toColumn].player()!=Player.WHITE) {
						return true;
					}
					else {
						return false;
					}
				}
				
				
				// checks to see if pawn is at starting location
				else if(move.fromRow == 1){
					// checks to see if possible to move 2 spaces
					if(board[move.toRow][move.toColumn]==
							board[move.fromRow+2][move.fromColumn]) {
						// checks to see if space one ahead is clear
						if((board[move.fromRow+1][move.fromColumn].player()
								!=Player.BLACK) || (board[move.fromRow+1]
										[move.fromColumn].player()
										!=Player.WHITE)) {
							// checks to see if space two ahead is clear
							if(board[move.toRow+2][move.toColumn].player()
									!=player().WHITE){
								return true;
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
				
				//returns true if the player is trying to move diagonally
				//and there is a player of the opposite team there
				else if (board[move.toRow][move.toColumn]==
						board[move.fromRow+1][move.fromColumn+1]) {
					if(board[move.toRow][move.toColumn].player()==Player.WHITE) {
						return true;
					}
					else {
						return false;
					}
				}
				//returns true if the player is trying to move diagonally
				//and there is a player of the opposite team there
				else if(board[move.toRow][move.toColumn]==
						board[move.fromRow+1][move.fromColumn-1]) {
					if(board[move.toRow][move.toColumn].player()==Player.WHITE) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
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


}
