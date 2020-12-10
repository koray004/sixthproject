package ru.mirea.project6;

import java.util.*;
public class Student {
    public static void main(String[] args) {
        int[] iDNumber = {5, 6, 5, 12, 9, 3, 4, 2, 8};
        System.out.println(Arrays.toString(iDNumber));
        insertSort(iDNumber);
    }

    public static void insertSort(int[] ToSort) {
        int element;
        int indexInsert;

        long start = System.nanoTime();
        for (int index = 0; index < ToSort.length; index++) {
            element = ToSort[index];
            indexInsert = index;
            while (indexInsert > 0
                    && ToSort[indexInsert - 1] > element) {
                ToSort[indexInsert] = ToSort[indexInsert - 1];
                indexInsert--;
                ToSort[indexInsert] = element;
            }
        }
        long stop = System.nanoTime();

        System.out.println(Arrays.toString(ToSort));
        System.out.println("Sorting time: " + (stop - start));
    }
}