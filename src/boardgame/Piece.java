package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		super();
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean IsThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; i < mat.length; j++) {
				if (mat[i][j] == true) {
					return true;
				}

			}
			
		}

		return false;
	}
}