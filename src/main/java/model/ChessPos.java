package model;

public class ChessPos {
    private int row;
    private char column;

    public ChessPos(char column, int row) {
        if (row <= 0 || row > 8) {
            throw new IllegalArgumentException("That row doesn't exist!");
        }
        if (Character.toLowerCase(column) - 'a' < 0 || Character.toLowerCase(column) - 'a' >= 8) {
            throw new IllegalArgumentException("That column doesn't exist!");
        }
        this.row = row;
        this.column = Character.toLowerCase(column);
    }

    public ChessPos(int x, int y) {
        if (y < 0 || y >= 8 || x < 0 || x > 8) {
            throw new IllegalArgumentException("Values have to be in the range 0 - 7 (inclusive)!");
        }
        row = 8 - y;
        column = (char) ('a' + x);
    }

    public ChessPos(String input) {
        if (input.length() != 2) {
            throw new IllegalArgumentException("Input has the wrong length!");
        }
        try {
            int row = Integer.parseInt(String.valueOf(input.charAt(1)));
            char column = input.charAt(0);
            if (row <= 0 || row > 8) {
                throw new IllegalArgumentException("That row doesn't exist!");
            }
            if (Character.toLowerCase(column) - 'a' < 0 || Character.toLowerCase(column) - 'a' >= 8) {
                throw new IllegalArgumentException("That column doesn't exist!");
            }
            this.row = row;
            this.column = Character.toLowerCase(column);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Wrong Format!");
        }
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }
    public int[] getAsCoordinates() {
        int[] output = new int[2];
        output[0] = column - 'a';       //x-Coordinate
        output[1] = 8 - row;            //y-Coordinate
        return output;
    }

    @Override
    public String toString() {
        return String.valueOf(column) + row;
    }

    @Override
    public boolean equals(Object rhs) {
        if (rhs == null) {
            return false;
        }
        if (!(rhs instanceof ChessPos)) {
            return false;
        }
        ChessPos rhsPos = (ChessPos) (rhs);
        return column == rhsPos.column && row == rhsPos.row;
    }
}
