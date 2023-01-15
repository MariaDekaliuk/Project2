package Homework3.Exercise3;

import Homework3.Request;
public class TemperaturaDemo {
        public static void main(String[] args) {
            /*спрашиваем температуру*/
            int temperatur1za100 = Request.intRequest("Укажите температуру колбы 1 (int)");
            int temperatur2do100 = Request.intRequest("Укажите температуру колбы 2 (int)");

            System.out.println("Устройство работает нормально? - " + Temperatura.check(temperatur1za100, temperatur2do100));

        }
}
