package Homework3.Exercise2;

import Homework3.Request;

public class CanBuy {
    static boolean canBuy(boolean b1, boolean b2) {
        return b1 || b2;
    }
    public static void main (String[] args){
        boolean isEdekaOpen;
        boolean isReweOpen;

        isEdekaOpen = Request.booleanRequest("Открыт ли магазин Edeka? Напиши: true/false");
        isReweOpen = Request.booleanRequest("Открыт ли магазин Rewe? Напиши: true/false");

        System.out.println("Могу ли я купить еду? - " + CanBuy.canBuy(isReweOpen, isEdekaOpen));

        }

    }

//1. Создайте две переменные isEdekaOpen и isReweOpen,
//значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy, возвращающий true
//** Значение этой переменной должно быть true,
//если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.
