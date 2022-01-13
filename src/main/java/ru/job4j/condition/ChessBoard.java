package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (x1 >= 0 && x1 <= 7 && y1 >= 0 && y1 <= 7 && x2 >= 0 && x2 <= 7 && y2 >= 0 && y2 <= 7) {
            result = Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(x2 - x1) : result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(way(1, 2, 6, 7));
    }
}