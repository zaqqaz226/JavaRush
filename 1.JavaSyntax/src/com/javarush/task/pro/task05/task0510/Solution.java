package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        int q = 1;
        for (int a = 0; a < result.length; a++){
            result[a] = new int[q];
            for (int s = 0; s < q; s++){
                result[a][s] = a + s;
                System.out.print(result[a][s] + " ");
            }
            System.out.println();
            q++;
        }
    }
}
