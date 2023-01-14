package Homework3.Exerscise3;

import Homework3.Request;
public class TemperaturaDemo {
        public static void main(String[] args) {
            /*спрашиваем температуру*/
            int temperature1 = Request.intRequest("Укажите температуру 1 (int)");
            int temperature2 = Request.intRequest("Укажите температуру 2 (int)");

            System.out.println("Ваше устройство работает нормально? - "
                    + Temperatura.check(temperature1, temperature2));
        }
}
