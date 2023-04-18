import model.*;

import java.util.List;

public class CodeStorage {

//    x = kingPosition.getAsCoordinates()[0] - 1;
//    y = kingPosition.getAsCoordinates()[1];
//        while (x >= 0) {
//        if (board[x][y].isEnemyColorTo(color) && (board[x][y].getPiece().equals(ChessPieceType.ROOK)
//                || board[x][y].getPiece().equals(ChessPieceType.QUEEN))) {
//            return true;
//        } else if (board[x][y].getColor().equals(color)) {
//            break;
//        }
//        x--;
//    }
//    x = kingPosition.getAsCoordinates()[0] + 1;
//    y = kingPosition.getAsCoordinates()[1];
//        while (x < BOARD_SIZE) {
//        if (board[x][y].isEnemyColorTo(color) && (board[x][y].getPiece().equals(ChessPieceType.ROOK)
//                || board[x][y].getPiece().equals(ChessPieceType.QUEEN))) {
//            return true;
//        } else if (board[x][y].getColor().equals(color)) {
//            break;
//        }
//        x++;
//    }
//    x = kingPosition.getAsCoordinates()[0];
//    y = kingPosition.getAsCoordinates()[1] - 1;
//        while (y >= 0) {
//        if (board[x][y].isEnemyColorTo(color) && (board[x][y].getPiece().equals(ChessPieceType.ROOK)
//                || board[x][y].getPiece().equals(ChessPieceType.QUEEN))) {
//            return true;
//        } else if (board[x][y].getColor().equals(color)) {
//            break;
//        }
//        y--;
//    }
//    x = kingPosition.getAsCoordinates()[0];
//    y = kingPosition.getAsCoordinates()[1] + 1;
//        while (y < BOARD_SIZE) {
//        if (board[x][y].isEnemyColorTo(color) && (board[x][y].getPiece().equals(ChessPieceType.ROOK)
//                || board[x][y].getPiece().equals(ChessPieceType.QUEEN))) {
//            return true;
//        } else if (board[x][y].getColor().equals(color)) {
//            break;
//        }
//        y++;
//    }
//        return true;





//    int i = 1;
//        while (xCord + i < BOARD_SIZE && yCord + i < BOARD_SIZE && !board[xCord + i][yCord + i].hasPiece()) {
//        possibleMoves.add(new ChessPos(xCord + i, yCord + i));
//        i++;
//    }
//        if (xCord + i < BOARD_SIZE && yCord + i < BOARD_SIZE && !board[xCord + i][yCord + i].isEnemyColorTo(c)) {
//        possibleMoves.add(new ChessPos(xCord + i, yCord + i));
//    }
//    i = 1;
//        while (xCord + i < BOARD_SIZE && yCord - i < BOARD_SIZE && !board[xCord + i][yCord - i].hasPiece()) {
//        possibleMoves.add(new ChessPos(xCord + i, yCord - i));
//        i++;
//    }
//        if (xCord + i < BOARD_SIZE && yCord - i < BOARD_SIZE && !board[xCord + i][yCord - i].isEnemyColorTo(c)) {
//        possibleMoves.add(new ChessPos(xCord + i, yCord - i));
//    }
//    i = 1;
//        while (xCord - i < BOARD_SIZE && yCord + i < BOARD_SIZE && !board[xCord - i][yCord + i].hasPiece()) {
//        possibleMoves.add(new ChessPos(xCord - i, yCord + i));
//        i++;
//    }
//        if (xCord - i < BOARD_SIZE && yCord + i < BOARD_SIZE && !board[xCord - i][yCord + i].isEnemyColorTo(c)) {
//        possibleMoves.add(new ChessPos(xCord - i, yCord + i));
//    }
//    i = 1;
//        while (xCord - i < BOARD_SIZE && yCord - i < BOARD_SIZE && !board[xCord - i][yCord - i].hasPiece()) {
//        possibleMoves.add(new ChessPos(xCord - i, yCord - i));
//        i++;
//    }
//        if (xCord - i < BOARD_SIZE && yCord - i < BOARD_SIZE && !board[xCord - i][yCord - i].isEnemyColorTo(c)) {
//        possibleMoves.add(new ChessPos(xCord - i, yCord - i));
//    }





//    private boolean isMovementPossible(Move move) {
//        if (move.from.equals(move.to)) {
//            return false;
//        }
//        int xFrom = move.from.getAsCoordinates()[0];
//        int yFrom = move.from.getAsCoordinates()[1];
//        int xTo = move.to.getAsCoordinates()[0];
//        int yTo = move.to.getAsCoordinates()[1];
//
//        ChessPiece chessPiece = board[xFrom][yFrom];
//
//        switch (chessPiece.getPieceType()) {
//            case KING:
//                char castleKingSide = chessPiece.getColor().equals(ChessPieceColor.WHITE) ? 'K' : 'k';
//                char castleQueenSide = chessPiece.getColor().equals(ChessPieceColor.WHITE) ? 'Q' : 'q';
//
//                boolean isRegularKingMove = Math.abs(xFrom - xTo) <= 1 && Math.abs(yFrom - yTo) <= 1;
//                boolean isKingSideCastle = yFrom == yTo && xFrom == xTo + 2 && !board[xFrom + 1][yFrom].hasPiece()
//                        && !board[xFrom + 2][yFrom].hasPiece() && castleOptions.contains(castleKingSide);
//                boolean isQueenSideCastle = yFrom == yTo && xFrom == xTo - 2 && !board[xFrom - 1][yFrom].hasPiece() &&
//                        !board[xFrom - 2][yFrom].hasPiece() && !board[xFrom - 3][yFrom].hasPiece()
//                        && castleOptions.contains(castleQueenSide);
//
//                return  isRegularKingMove || isKingSideCastle || isQueenSideCastle;
//            case QUEEN:
//                return (isRookMove(move) || isBishopMove(move)) && inBetweenFieldsEmpty(move)
//                        && (isCapture(move) || !board[xTo][yTo].hasPiece());
//            case ROOK:
//                return isRookMove(move) && inBetweenFieldsEmpty(move) && (isCapture(move) || !board[xTo][yTo].hasPiece());
//            case BISHOP:
//                return isBishopMove(move) && inBetweenFieldsEmpty(move) && (isCapture(move) || !board[xTo][yTo].hasPiece());
//            case KNIGHT:
//                return ((Math.abs(xFrom - xTo) == 1 && Math.abs(yFrom - yTo) == 2)
//                        || (Math.abs(xFrom - xTo) == 2 && Math.abs(yFrom - yTo) == 1))
//                        && (isCapture(move) || !board[xTo][yTo].hasPiece());
//            case PAWN:
//                int colorFactor = chessPiece.getColor().equals(ChessPieceColor.WHITE) ? -1 : 1;
//                return (xFrom == xTo && yFrom + colorFactor == yTo && !board[xTo][yTo].hasPiece()) ||
//                        (xFrom == xTo && yFrom + colorFactor * 2 == yTo
//                                && !board[xTo][yFrom + colorFactor].hasPiece() && !board[xTo][yTo].hasPiece()) ||
//                        (yFrom + colorFactor == yTo && Math.abs(xFrom - xTo) == 1 && (isCapture(move) || move.to.equals(possibleEnPassant)));
//            default:
//                return false;
//        }
//    }

//    List<ChessPos> rookPositions = beforeMove.searchPiece(new ChessPiece(ChessPieceType.ROOK, moveMadeBy));
//                if (rookPositions.size() > 1 && beforeMove.inBetweenFieldsEmpty(
//                        new Move(rookPositions.get(0), rookPositions.get(1)))) {
//        if (rookPositions.get(0).getAsCoordinates()[1] == rookPositions.get(1).getAsCoordinates()[1]
//                && rookPositions.get(0).getAsCoordinates()[1] == yTo) {
//            halfMoveNotation = "R" + ((char) (xFrom + 'a')) + move.to;
//        } else if (rookPositions.get(0).getAsCoordinates()[0] == rookPositions.get(1).getAsCoordinates()[0]
//                && rookPositions.get(0).getAsCoordinates()[0] == xTo) {
//            halfMoveNotation = "R" + (8 - yFrom) + move.to;
//        } else {
//            halfMoveNotation = "R" + move.to;
//        }
//    } else {
//        halfMoveNotation = "R" + move.to;
//    }
//                break;
}

/*
String currentMove = move.replaceAll("[x+#]", "");
            char pieceChar = currentMove.charAt(0);
            if (Character.isLowerCase(pieceChar)) {
                //Pawn took
                int direction = currentPlayer.equals(ChessPieceColor.BLACK) ? 1 : -1;
                ChessPos to = new ChessPos(currentMove.substring(1));
                ChessPos from = new ChessPos(pieceChar - 'a', to.getAsCoordinates()[1] - direction);
                return movePiece(new Move(from, to));
            } else {
                ChessPieceType pieceType = ChessPieceType.valueOf(ChessPieceType.
                        getEnumByString(Character.toString(pieceChar)));
                List<ChessPos> from = searchPiece(new ChessPiece(pieceType, currentPlayer));
                if (from.isEmpty()) {
                    throw new IllegalArgumentException("Move " + move + "is not legal");
                }
                if (currentMove.length() == 3) {
                    ChessPos to = new ChessPos(currentMove.substring(1));
                    return movePiece(new Move(from.get(0), to)) || movePiece(new Move(from.get(1), to));
                } else {
                    ChessPos to = new ChessPos(currentMove.substring(2));
                    char rowColumnInfo = Character.toLowerCase(currentMove.charAt(1));
                    int indexFrom = 0;
                    if (from.size() > 1) {
                        if (rowColumnInfo - 'a' >= 0 && rowColumnInfo - 'a' < 8) {
                            if (from.get(1).getAsCoordinates()[0] == rowColumnInfo - 'a') {
                                indexFrom = 1;
                            }
                        } else {
                            if (from.get(1).getAsCoordinates()[1] == rowColumnInfo - '0') {
                                indexFrom = 1;
                            }
                        }
                    }
                    return movePiece(new Move(from.get(indexFrom), to));
                }

    public ChessBoard clone() {
         return new ChessBoard(board.clone(), moveOptions, fallenPieces, currentPlayer, promotionSquare, moves,
         whiteMove, winner, possibleEnPassant, castleOptions, halfMovesSinceLastPawnPushOrCapture,
         completedMoves, isGameOver, needsPromotionInput);
        return new ChessBoard(getAsFEN());
    }
 */