package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        int summ = 0;
        for (int i = 0; i < coordinates.length; i++) {
            if (i % 2 == 0){
                coordinates[i] = summ;
                summ = summ + 1;
            }else{
                coordinates[i] = summ;
                summ = summ + 9;
            }
            System.out.print(coordinates[i] + ", ");
        }

    }
}