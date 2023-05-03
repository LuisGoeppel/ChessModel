import model.ChessBoard;
import model.Move;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String position5 = "rnbq1k1r/pp1Pbppp/2p5/8/2B5/8/PPP1NnPP/RNBQK2R w KQ - 1 8";
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(position5);
        Long startTime = System.currentTimeMillis();
        System.out.println(getNumberOfGamesWithNMoves(chessBoard, 3));
        Long endTime = System.currentTimeMillis();
        System.out.println("Time needed: " + (endTime - startTime) + "ms");
    }

    private static int getNumberOfGamesWithNMoves(ChessBoard chessBoard, int n) {
        if (n == 1) {
            return chessBoard.getPossibleMoves().size();
        }
        List<Move> possibleMoves = chessBoard.getPossibleMoves();
        int nMoves = 0;
        for (Move move : possibleMoves) {
            ChessBoard clonedBoard = chessBoard.clone();
            clonedBoard.movePiece(move);
            nMoves += getNumberOfGamesWithNMoves(clonedBoard, n - 1);
        }
        return nMoves;
    }
}