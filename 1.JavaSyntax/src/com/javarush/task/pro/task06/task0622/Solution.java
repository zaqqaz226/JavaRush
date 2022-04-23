package com.javarush.task.pro.task06.task0622;

import java.util.Scanner;

/* 
Диабло (1)
*/

public class Solution {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;
    public static int amigoLives = 9;
    public static int diabloLives = 9;

    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);
        findDiablo();
        battle();
        if (isAmigoWin() == true) {
            System.out.println(winPhrase);
        } else {
            System.out.println(loosePhrase);
        }
    }

    public static void findDiablo() {
        Scanner scan = new Scanner(System.in);
        System.out.println(getFirstPositionPhrase);
        while (scan.nextInt() != diabloPosition) {
            System.out.println(getPositionPhrase);
        }
        System.out.println(findDiabloPhrase);
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static void amigoLostLife() {
        amigoLives = amigoLives - 1;
    }

    public static void diabloLostLife() {
        diabloLives = diabloLives - 3;
    }

    public static int amigoAttacks() {
        int a = getRandomNumber(3);
        return a;
    }

    public static int diabloDefends() {
        int a = getRandomNumber(3);
        return a;
    }

    public static void battle() {
        while (amigoLives > 0 && diabloLives > 0) {
            int amigoAtt = amigoAttacks();
            int diabloDef = diabloDefends();
            if (amigoAtt != diabloDef) {
                System.out.println(amigoAttackPhrase);
                diabloLostLife();
            } else {
                System.out.println(diabloDefendPhrase);
                amigoLostLife();
            }
            if (amigoLives <= 0 || diabloLives <= 0) {
                break;
            }
        }
    }

    public static boolean isAmigoWin() {
        boolean winner;
        if (amigoLives > 0 && diabloLives <= 0) {
            winner = true;
        } else {
            winner = false;
        }
        return winner;
    }
}
