package chessSystem.Chess;

import chessSystem.Chess.pieces.King;
import chessSystem.Chess.pieces.Rook;
import chessSystem.boardgame.Board;
import chessSystem.boardgame.Position;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		
		board = new Board(8,8);
		initialSetup();
	}
	
	
	public ChessPiece[][] getpieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];
		for (int i = 0; i < board.getRow(); i++) {
			for (int j = 0; j <board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
				
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece( new Rook(board,Color.WHITE), new Position(2,1));
		board.placePiece( new King(board,Color.BLACK), new Position(0,4));
		board.placePiece( new Rook(board,Color.BLACK), new Position(4,1));
	}
}









