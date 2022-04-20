package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < strings.length; i++) {       // Заполняем массив данными из консоли
            strings[i] = console.nextLine();
        }
    String[] array = strings;                           // Объявляем новый массив, равный массиву strings
        for (int i = 0; i < array.length; i++) {
            String tekushee = array[i];                     // объяви еще один массив, равный Strings и сравнивай по одному со вторым массиовм.
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if(tekushee.equals(strings[j])){
                    count++;
                    if (count > 1){
                        int p;
                        strings[j] = "null";
                        p = i;
                        strings[p] = "null"; // удалит значение из Strings равное в этот момент I
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}