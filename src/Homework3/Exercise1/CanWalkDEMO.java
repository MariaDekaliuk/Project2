package Homework3.Exercise1;

import Homework3.Exercise1.CanWalk;
import Homework3.Request;

public class CanWalkDEMO {
        public static void main(String[] args) {
            boolean isWeekend;
            boolean isRain;

            isWeekend = Request.booleanRequest("Сегодня выходной? Ответь: true/false");
            isRain = Request.booleanRequest("Сегодня есть дождь?  Ответь: true/false");

            System.out.println("Могу гулять? - " + CanWalk.isCanWalk(isWeekend,isRain));

        }
}
//Создайте переменную canWalk, значение которой должно быть истинным,
//если это выходной день (isWeekend=true) и не идет дождь (isRain=false).