package com.javarush.task.pro.task07.task0720;

/* 
Галавир XIII (3)
*/

public class BattleField {
    public static String nimrodDefence = "Вражеская атака отбита";
    public static String nimrodAttack = "Наносим контр удар";
    public static String nimrodDestroy = "Вражеский удар не выдержан";
    public static String galavirDefence = "Наша атака успешно отражена врагом";
    public static String galavirAttack = "Враг наносит удар";
    public static String galavirDestroy = "Вражеский корабль повержен";

    public static void main(String[] args) {
        GalavirXIII glavir = new GalavirXIII();
        Nimrod nimrod = new Nimrod();
        System.out.println(galavirAttack);
        do {
            nimrod.defend(glavir.attack()); // Все что дальше и до while - новый код. Не работает, то пересмотри его.
            if(isNimrodAlive(nimrod)){
                System.out.println(nimrodAttack);
                glavir.defend(nimrod.attack());
            }else{
                break;
            }
        }
        while (isGalavirAlive(glavir));
    }

    public static boolean isNimrodAlive(Nimrod nimrod) {
        if (nimrod.health > 0) {
            System.out.println(nimrodDefence);
            return true;
        } else {
            System.out.println(nimrodDestroy);
            return false;
        }
    }

    public static boolean isGalavirAlive(GalavirXIII galavir) {
        if (galavir.health > 0) {
            System.out.println(galavirDefence);
            return true;
        } else {
            System.out.println(galavirDestroy);
            return false;
        }
    }
}