package ru.home.homework.lesson3arrays;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        /*
        Задание №6* | Задать одномерный массив и найти в нем минимальный и максимальный элементы.
        */
        int[] arr = {1, 5, 6, 7, 8, 9, 77, 2, 111, -2, -5};
        int min = arr[0];
        int max = arr[0];
        ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("==============================================");

        /*
        Задание №7** | Написать метод в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место,
        в котором сумма левой и правой части массива равны.
        */
//        int[] balance = new int[5];
//        for (int i = 0; i < balance.length; i++) {
//            balance[i] = i;
//        }
//        System.out.println(Arrays.toString(balance));
//        checkBalance();

        System.out.println("==============================================");

        /*
        Задание №8*** | Написать метод, которому на вход подается одномерный массив и число n
        (может быть положительным и отрицательным),
        при этом метод должен сместить все элементы массива на n позиций.
        Элементы смещаются циклично.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры:
        [1, 2, 3] при n = 1 (на один вправо) -> [3, 1, 2]
        [3, 5, 6, 1] при n = -2 (на два влево) -> [6, 1, 3, 5]
        */
//        int[] newArray = {1, 2, 3};
//        moveArray(newArray, -1);
//        System.out.println("==============================================");


    }

//    public static int[] moveArray(int[] in, int n) {
//        for (int i = 0; i < in.length; i++) {
//            if (n % in.length == 0) {
//                return in;
//            }
//            if (n < 0) {
//            }
//            if (n > 0) {
//                
//            }
//        }
//        System.out.println(Arrays.toString(in));
//    }
//    public static boolean checkBalance(int[] in) {
//
//    }
}