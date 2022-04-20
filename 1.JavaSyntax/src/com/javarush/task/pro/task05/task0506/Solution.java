package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        
        int proverka = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            if (array[i] < proverka){
                proverka = array[i];
            }
        }
        System.out.print(proverka);
    }
}
