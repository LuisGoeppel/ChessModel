package model;

import java.util.List;

public interface ChessBoardInterface {

    //Input methods
    boolean movePiece(Move move);

    boolean executeMoves(String moves);

    boolean selectPieceForPromotion(ChessPieceType piece);

    //Output methods
    ChessPiece[][] getBoard();

    ChessWinner getWinner();

    boolean isGameOver();
    List<ChessPiece> getFallenPieces();

    int getFallenPiecesValue(ChessPieceColor color);

    ChessPieceColor getCurrentPlayer();

    boolean needsPromotionInput();

    List<ChessPos> getPossibleMoves(ChessPos chessPos);

    String getAsFEN();

    List<String> getMoves();
}
