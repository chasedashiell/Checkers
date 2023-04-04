import java.util.Arrays;

class Board {
    private Piece[][] board;

    public Board(int size) {
        this.board = new Piece[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (r < 3 && c % 2 != 0) {
                    board[r][c] = new Piece(true, r, c);
                } else if (r > 4 && c % 2 == 0) {
                    board[r][c] = new Piece(false, r, c);
                }
            }
        }
    }

    public Piece[][] getBoard() {
        return board;
    }

    public String toString() {
        String[][] sol = new String[board.length][board.length];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board.length; c++) {
                sol[r][c] = board[r][c].toString();
            }
        }
    }
}