package Homework3.Exercise4;

import Homework3.Request;

public class CountdownTimeDemo {
    public static void main(String[] args) {

        int secEnd = Request.intRandom(0, 28800); //рандомный звпрос времени до конца рабочего дня
        int hoursEnd = CountdownTime.secondsTranslator(secEnd); //перевод полученных данных в часы

        System.out.println("До конца рабочего дня осталось: " + secEnd + " секунд");
        System.out.println("До конца рабочего дня осталось: " + hoursEnd + " часа(ов)");

    }
}
