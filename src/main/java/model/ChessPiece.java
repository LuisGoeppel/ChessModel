package model;

public class ChessPiece {
    private final ChessPieceType piece;
    private final ChessPieceColor color;

    public ChessPiece(ChessPieceType piece, ChessPieceColor color) {
        if (piece.equals(ChessPieceType.EMPTY) && !color.equals(ChessPieceColor.EMPTY) ||
                !piece.equals(ChessPieceType.EMPTY) && color.equals(ChessPieceColor.EMPTY)) {
            throw new IllegalArgumentException("If the Piece is empty both Params should be EMPTY");
        }
        this.piece = piece;
        this.color = color;
    }

    public ChessPieceType getPieceType() {
        return piece;
    }

    public ChessPieceColor getColor() {
        return color;
    }

    public boolean isEnemyColorTo(ChessPieceColor color) {
        return (this.color.equals(ChessPieceColor.BLACK) && color.equals(ChessPieceColor.WHITE)) ||
                (this.color.equals(ChessPieceColor.WHITE) && color.equals(ChessPieceColor.BLACK));
    }

    public boolean hasPiece() {
        return !piece.equals(ChessPieceType.EMPTY);
    }

    public char getAsChar() {
        char out = piece.toString().charAt(0);
        if (color.equals(ChessPieceColor.BLACK)) {
            return Character.toLowerCase(out);
        }
        return out;
    }

    @Override
    public ChessPiece clone() {
        return new ChessPiece(piece, color);
    }

    @Override
    public String toString() {
        return color.toString() + " " + piece.toString();
    }

    @Override
    public boolean equals(Object rhs) {
        if (rhs == null) {
            return false;
        }
        if (!(rhs instanceof ChessPiece)) {
            return false;
        }
        ChessPiece rhsPiece = (ChessPiece) (rhs);
        return piece.equals(rhsPiece.piece) && color.equals(rhsPiece.color);
    }
}
