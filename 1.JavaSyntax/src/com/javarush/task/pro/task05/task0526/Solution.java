package com.javarush.task.pro.task05.task0526;
import java.util.Arrays;
/* 
Атака вирусов
*/

public class Solution {
    public static int[][] array;

    public static void main(String[] args) {
        /*printArray();*/
        array = new int[][]{{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}};
        int[] mas = array[0];
        array[0] = array[2];
        array[2] = mas;
        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
