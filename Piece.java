public class Piece {
    private static int blackCount = 0;
    private static int whiteCount = 0;

    private boolean isBlack;
    private int xPos;
    private int yPos;

    public Piece(boolean isBlack, int xPos, int yPos) {
        this.isBlack = isBlack;
        this.yPos = yPos;
        this.xPos = xPos;
    }

    public String toString() {
        if (isBlack) {
            return "black";
        }
        return "white";
    }

    public static int getBlackCount() {
        return blackCount;
    }

    public static int getWhiteCount() {
        return whiteCount;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
