package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
        System.out.println();
        int[] numbers1 = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl1 = swap(numbers1, 2, 0);
        for (int index = 0; index < rsl1.length; index++) {
            System.out.println(rsl1[index]);
        }
    }
}