package chess;

public class ChessModel implements IChessModel {	 
	protected ChessPiece[][] board;
	private Player player;
	//	 declare other instance variables as needed

	public ChessModel() {
		board = new ChessPiece[8][8];
		
		player = Player.WHITE;
		
		board[0][0] = new Rook(Player.BLACK);
		board[0][1] = new Knight(Player.BLACK);
		board[0][2] = new Bishop(Player.BLACK);
		board[0][3] = new Queen(Player.BLACK);
		board[0][4] = new King(Player.BLACK);
		board[0][5] = new Bishop(Player.BLACK);
		board[0][6] = new Knight(Player.BLACK);
		board[0][7] = new Rook(Player.BLACK);
		for(int i=0;i<8;i++){
			board[1][i] = new Pawn(Player.BLACK);
		}
		
		for(int x=2;x<6;x++){
			for(int y=0;y<8;y++){
				board[x][y] = new Empty(null);
			}
		}
		
		board[7][0] = new Rook(Player.WHITE);
		board[7][1] = new Knight(Player.WHITE);
		board[7][2] = new Bishop(Player.WHITE);
		board[7][3] = new Queen(Player.WHITE);
		board[7][4] = new King(Player.WHITE);
		board[7][5] = new Bishop(Player.WHITE);
		board[7][6] = new Knight(Player.WHITE);
		board[7][7] = new Rook(Player.WHITE);
		for(int i=0;i<8;i++){
			board[6][i] = new Pawn(Player.WHITE);
		}
		
	}

	public boolean isComplete() {
		return false;
	}

	public boolean isValidMove(Move move) {
		if(board[move.fromRow][move.fromColumn].player()==player){
			return true;
		}
		else{
			return false;
		}
	}

	public void move(Move move) {
		if(isValidMove(move)){
			if(board[move.fromRow][move.fromColumn].isValidMove(move, board)){
				board[move.toRow][move.toColumn] = board[move.fromRow][move.fromColumn];
				board[move.fromRow][move.fromColumn] = null;
				if(player==Player.WHITE){
					player = Player.BLACK;
				}
				else{
					player = Player.WHITE;
				}
			}
		}
	}

	public boolean inCheck(Player p) {
		return false;
	}

	public Player currentPlayer() {
		return player;
	}

//	public int numRows() {
//		// complete this
//	}
//
//	public int numColumns() {
//		// complete this
//	}

	public ChessPiece pieceAt(int row, int column) {
		return board[row][column];
	}
	
	public Player getPlayer(){
		return player;
	}
	

	// add other public or helper methods as needed
}

