package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

/* 
Галаксианские роботанки (1)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i],empty);
        }
        for (int i = 0; i < field.length; i++) {
            int x = (int)(Math.random()*10);
            for (int j = 0; j < field[i].length; j++) {
                field[i][x] = robotank;
            }
        }

        // Вводим бомбы
        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < 10; j++) {
                bombs[i][j] = 1;
            }

        }

        // Атакуем
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] == robotank){
                    field[i][j] = hit;
                }
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(robotank.equals(field[i][j])){
                    field[i][j] = hit;
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }
}
