import model.ChessBoard;
import model.ChessPos;
import model.Move;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessBoard chessBoard = new ChessBoard("r1bqkbnr/ppp2ppp/2np4/4p3/2B1P3/5Q2/PPPP1PPP/RNB1K1NR w KQkq - 0 4");

        System.out.println(chessBoard);
        System.out.println();
        while (!chessBoard.isGameOver()) {
            System.out.println("Input a move: <StartSquare> <MoveSquare>");
            String input = scanner.nextLine();
            String[] moveFields = input.split(" ");
            if (moveFields.length == 2 && moveFields[0].length() == 2 && moveFields[1].length() == 2) {
                try {
                    ChessPos from = new ChessPos(moveFields[0]);
                    ChessPos to = new ChessPos(moveFields[1]);

                    Move move = new Move(from, to);
                    boolean pieceMoved = chessBoard.movePiece(move);

                    if (pieceMoved) {
                        System.out.println(chessBoard);
                        System.out.println(chessBoard.isGameOver());
                        System.out.println();
                    } else {
                        System.out.println("Illegal Move!");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("This move cannot be accepted");
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
