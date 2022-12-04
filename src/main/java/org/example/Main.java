package org.example;

import java.util.Arrays;
import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив нечетных чисел: ");
        System.out.println(getOddNumbers(array));
    }
    public static ArrayList<Integer> getOddNumbers(int[] array){
        ArrayList<Integer> oddArray = new ArrayList<>();
        for (int j : array) {
            if (j % 2 != 0) {
                oddArray.add(j);
            }
        }
        return oddArray;
    }
}