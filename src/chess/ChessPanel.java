package chess;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChessPanel extends JPanel {

	private JButton[][] board;   
	private ChessModel model;
	private JPanel centerPanel;
	boolean Phase;
	private Move m,mover;
	private int row,col;


	// declare other instance variables as needed

	private ButtonListener buttonListener = new ButtonListener();

	public ChessPanel() {
		board = new JButton[8][8];
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(8,8));
		Phase = true;

		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				board[i][j] = new JButton("");
				board[i][j].addActionListener(buttonListener);
				centerPanel.add(board[i][j]);

			}
		}
		model = new ChessModel();
		add(centerPanel);
		displayBoard();

	}

	// method that updates the board
	private void displayBoard() {
		if(Phase){
			for(int j=0;j<8;j++){
				for(int i=0;i<8;i++){
					ChessPiece c;
					c = model.pieceAt(i,j);
					board[i][j].setEnabled(true);
					board[i][j].setBackground(null);
					
					if(model.pieceAt(i,j)==null){
						board[i][j].setText("");
					}
					else if((c.type()).equals("Pawn")){
						board[i][j].setText("Pawn");
					}
					else if(c.type().equals("Rook")){
						board[i][j].setText("Rook");
					}
					else if(c.type().equals("Knight")){
						board[i][j].setText("Knight");
					}
					else if(c.type().equals("Bishop")){
						board[i][j].setText("Bishop");
					}
					else if(c.type().equals("Queen")){
						board[i][j].setText("Queen");
					}
					else if(c.type().equals("King")){
						board[i][j].setText("King");
					}

				}
			}
		}
		else{
			for(int j=0;j<8;j++){
				for(int i=0;i<8;i++){
					ChessPiece f;
					f = model.pieceAt(row,col);

					mover = new Move(row,col,i,j);
					if(f.isValidMove(mover, model.board)){
						board[i][j].setEnabled(true);
						board[i][j].setBackground(Color.GREEN);
					}
					else{
						board[i][j].setEnabled(false);
					}
				}
			}
		}
	}

	// add other helper methods as needed

	// inner class that represents action listener for buttons
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			for (int r = 0; r < 8; r++) {
				for (int c = 0; c < 8; c++) {
					if (board[r][c] == e.getSource()) {
						if(Phase){
							if(model.board[r][c]==null){
								
							}
							else if(model.board[r][c].player()==model.getPlayer()){
								row = r;
								col = c;
								Phase = false;
								displayBoard();
							}
						}
						else{
							
							m = new Move(row,col,r,c);
							model.move(m);
							Phase = true;
							displayBoard();
							

						}
					}
				}
			}
		}
	}
}
