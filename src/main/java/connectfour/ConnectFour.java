package connectfour;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConnectFour {
    /*
    "A_Red",
    "B_Yellow",
    "A_Red",
    "B_Yellow",
    "A_Red",
    "B_Yellow",
    "G_Red",
    "B_Yellow"
     */
    public static final int MAX_COUNT = 4;


    public static String whoIsWinner(List<String> piecesPositionList) {
        // retrun "Red" or "Yellow" or "Draw"
        Board board = new Board(piecesPositionList);
        Dot dot = checkBoard(board);
        return "Draw";
    }

    private static Dot checkBoard(Board board) {
        for (Column value : Column.values()) {
            GameStatus is1 = checkVertical(board, value);
            boolean is2 = checkHorizontal(board, value);
            boolean is3 = checkSidePlusOne(board, value);
            System.out.println(value);
        }
        return null;
    }

    private static GameStatus checkVertical(Board board, Column value) {
        List<Dot> dots = board.getBoard().get(value);
        if(dots == null){
            return GameStatus.DRAW;
        }
        int rCount = 0;
        int yCount = 0;
        for (Dot dot : dots) {
            if (dot == Dot.RED) {
                if (yCount != 0) {
                    yCount = 0;
                }
                rCount++;
                if(rCount == MAX_COUNT){
                    return GameStatus.RED;
                }
            } else if (dot == Dot.YELLOW) {
                if (rCount != 0) {
                    rCount = 0;
                }
                yCount++;
                if(yCount == MAX_COUNT){
                    return GameStatus.YELLOW;
                }
            }

        }
        return GameStatus.DRAW;
    }

    private static boolean checkHorizontal(Board board, Column value) {
        return false;
    }

    private static boolean checkSidePlusOne(Board board, Column value) {
        return false;
    }

    @Getter
    static class Board {
        private final Map<Column, List<Dot>> board = new LinkedHashMap<>();

        Board(List<String> records) {
            for (String record : records) {
                String col = record.split("_")[0];
                String colour = record.split("_")[1];
                Dot dot = Dot.valueOf(colour.toUpperCase());
                Column column = Column.valueOf(col);

                board.putIfAbsent(column, new ArrayList<>());
                board.get(column).add(dot);
            }
        }
    }

    @Getter
    @RequiredArgsConstructor
    public enum Dot {
        RED("Red"), YELLOW("Yellow");

        private final String name;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Column {
        A(1), B(2), C(3), D(4), E(5), F(6), G(7);

        private final int count;
    }

    @Getter
    @RequiredArgsConstructor
    public enum GameStatus {
        RED("Red"), YELLOW("Yellow"), DRAW("Draw");

        private final String name;
    }
}