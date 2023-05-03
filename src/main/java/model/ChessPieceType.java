package model;

public enum ChessPieceType {
    KING ("K"),
    QUEEN ("Q"),
    ROOK ("R"),
    BISHOP ("B"),
    KNIGHT ("N"),
    PAWN ("P"),
    EMPTY ("E");

    private String name;

    ChessPieceType(String pName) {
        name = pName;
    }

    @Override
    public String toString() {
        return name;
    }

    public static String getEnumByString(String code){
        for(ChessPieceType e : ChessPieceType.values()){
            if(e.name.equals(code)) return e.name();
        }
        return null;
    }

    public ChessPieceType cloneEnum() {
        return valueOf(name);
    }
}
