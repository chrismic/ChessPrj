package chess;

/**
 * Packages the four components of a move into a single object.    (Instance variables are public because this object
 * is a simple container.)
 *
 * @author
 */


public class Move {

   public int fromRow, fromColumn, toRow, toColumn;

    public Move() {
    }

    public Move(int fromRow, int fromColumn, int toRow, int toColumn) {
      this.fromRow = fromRow;
      this.fromColumn = fromColumn;
      this.toRow = toRow;
      this.toColumn = toColumn;
   }
}