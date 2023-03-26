package ru.home.homework.lesson3twoArrays;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        // Задание №6*
        int[] arr = {1, 5, 6, 7, 8, 9, 77, 2};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("==============================================");

        // Задание №7**
        int[] balance = new int[5];
        for (int i = 0; i < balance.length; i++) {
            balance[i] = i;
        }
        System.out.println(Arrays.toString(balance));
//        checkBalance();

        System.out.println("==============================================");

        //Задание №8***

        moveArray(arr, -1);
        System.out.println("==============================================");


    }

    public static void moveArray(int[] in, int n) {
        for (int i = 0; i < in.length; i++) {
            in[i] = in[i + n];
        }
        System.out.println(Arrays.toString(in));
    }
//    public static boolean checkBalance(int[] in) {
//
//    }
}
