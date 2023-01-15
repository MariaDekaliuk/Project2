package Homework3.Exercise3;

public class Temperatura {
        static boolean check(int t1, int t2){

            boolean isTrue = false;
            if (t1>100 && t2<100){
                isTrue = true;
            }
            return isTrue;
        }

    }
/*Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
     */