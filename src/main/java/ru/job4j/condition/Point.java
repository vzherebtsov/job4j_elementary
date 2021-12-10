package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 2, 4);
        System.out.println("result (1, 2) to (2, 4) " + result);
    }
}
