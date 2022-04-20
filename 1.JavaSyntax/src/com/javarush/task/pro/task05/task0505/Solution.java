package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        if (N > 0){
            int[] array  = new int[N];
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
                if (N % 2 == 0){
                    for (int j = N-1; j >= 0 ; j--) {
                        System.out.println(array[j]);
                    }
                }else{
                    for (int i = 0; i < array.length ; i++) {
                        System.out.println(array[i]);
                    }

                }
        }
    }
}
