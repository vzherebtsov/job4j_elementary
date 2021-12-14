package ru.job4j.condition;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.max(30, 20);
        System.out.println(result);
        result = Max.max(10, 20);
        System.out.println(result);
        result = Max.max(10, 10);
        System.out.println(result);
    }
}
