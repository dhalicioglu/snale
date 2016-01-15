package boardUnits;

public class Board {
	private Slot slots[][];
	private final int boardWidth;
	private final int boardHeight;
	private final int boardSize;
	private Snale snale;
	
	
	// constructor
	public Board(int width, int height){
		this.boardWidth =width;
		this.boardHeight = height;
		this.boardSize = width*height;
		this.slots = new Slot[width][height];
		this.snale = new Snale();
		
		for(int h=0; h<height; h++){
			for(int w=0; w<width; w++){
				slots[w][h] = new Slot();
			}
		}
		
		this.slots[0][0].setPassed(true);
		this.snale.setSnaleCoordinateX(0);
		this.snale.setSnaleCoordinateY(0);
	}

		
	// getters for private attributes
	public int getBoardWidth() {
		return boardWidth;
	}
	public int getBoardHeight() {
		return boardHeight;
	}
	public int getBoardSize() {
		return boardSize;
	}
	public Slot[][] getSlots() {
		return slots;
	}
	public Snale getSnale(){
		return this.snale;
	}

	// setters for private attributes
	public void setSlots(Slot slots[][]) {
		this.slots = slots;
	}
	

}
