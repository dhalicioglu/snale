package gameManagement;

import boardUnits.Board;

public class GameManager {
	private Board board;
	
	// constructor
	public GameManager(){
		
	}
	
	////////methods for setting up the game///////
	public void createBoard(int width, int height){
		this.board= new Board(width, height);
	}
	
	
	////////methods for movement/////////
	
	// move right
	public void moveRight(Board board){
		if(board.getSnale().getSnaleCoordinateX()%board.getBoardWidth() == board.getBoardWidth() - 1){
			// snale is already on the right edge of the board
		}else{
			board.getSnale().setSnaleCoordinateX(board.getSnale().getSnaleCoordinateX() + 1);
			board.getSlots()[board.getSnale().getSnaleCoordinateX()][board.getSnale().getSnaleCoordinateY()].setPassed(true);
		}
	}
	
	// move left
	public void moveLeft(Board board){
		if(board.getSnale().getSnaleCoordinateX()%board.getBoardWidth() == 0){
			// snale is already on the left edge of the board
		}else{
			board.getSnale().setSnaleCoordinateX(board.getSnale().getSnaleCoordinateX() - 1);
			board.getSlots()[board.getSnale().getSnaleCoordinateX()][board.getSnale().getSnaleCoordinateY()].setPassed(true);
		}
	}
	
	// move up
	public void moveUp(Board board){
		if(board.getSnale().getSnaleCoordinateY()%board.getBoardHeight() == board.getBoardHeight() - 1){
			// snale is already on the top edge of the board
		}else{
			board.getSnale().setSnaleCoordinateY(board.getSnale().getSnaleCoordinateY() + 1);
			board.getSlots()[board.getSnale().getSnaleCoordinateX()][board.getSnale().getSnaleCoordinateY()].setPassed(true);
		}
	}
	
	// move down
	public void moveDown(Board board){
		if(board.getSnale().getSnaleCoordinateY()%board.getBoardHeight() == 0){
			// snale is already on the bottom edge of the board
		}else{
			board.getSnale().setSnaleCoordinateY(board.getSnale().getSnaleCoordinateY() - 1);
			board.getSlots()[board.getSnale().getSnaleCoordinateX()][board.getSnale().getSnaleCoordinateY()].setPassed(true);
		}
	}

	
	// getters for private attributes
	public Board getBoard() {
		return board;
	}
}
