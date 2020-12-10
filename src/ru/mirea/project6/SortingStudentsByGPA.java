package ru.mirea.project6;

import java.util.*;
public class SortingStudentsByGPA {
    static int[] massiv = {1, 23, 4, 5, 74, 4, 7, 2, 8};
    static Random generation = new Random();
    static int len = 30;
    static int[] MassivGeneration = new int[len];
    public static void MGen(){
        for (int i = 0; i < len; i++) {
            MassivGeneration[i] = generation.nextInt(50);
        }
    }

    private static void QuickSort(int[] arr, int first, int last){
        if(arr.length == 0){
            System.out.println("There is no array!");
            return;
        }
        if (first >= last) {
            return;
        }
        int i, j;
        i = first;
        j = last;
        int apora = arr[(i + j) / 2];
        do{
            while(arr[i] < apora){
                i++;
            }
            while (arr[j] > apora){
                j--;
            }
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }while (i <= j);
        if (first < j)
            QuickSort(arr, first, j);
        if (i < last){
            QuickSort(arr, i, last);
        }
    }

    public static void main(String[] args) {
        System.out.println("our Source array:");
        System.out.println(Arrays.toString(massiv));

        QuickSort(massiv,0,massiv.length - 1);
        System.out.println("our sorted array:");
        System.out.println(Arrays.toString(massiv));


        MGen();
        System.out.println("\nour Source array:");
        System.out.println(Arrays.toString(MassivGeneration));

        QuickSort(MassivGeneration,0,MassivGeneration.length - 1);
        System.out.println("sorted array (with random numbers):");
        System.out.println(Arrays.toString(MassivGeneration));
    }}
