package Homework2;

public class ExcersicePizza {
    public static void main(String[] args) {

    /* Задача *
    Напишите программу, которая вычисляет, сколько лишних калорий будет,
    если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
    Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр
    пиццы содержит 40 калорий.*/

        int radius1 = 24;
        int radius2 = 28;

        double S1 = 2*3.14*radius1;
        double S2 = 2*3.14*radius2;
        double Sextra = S2 - S1;
        System.out.println("Площадь пиццы 28см = " + S1 + "см2");
        System.out.println("Площадь пиццы 28см = " + S2 + "см2");
        System.out.println("Опасная для вашей талии площадь = " + Sextra + "см2");

        int kaloryPizzaSm = 40;

        double EatExtra = Sextra*kaloryPizzaSm;
        System.out.println("Вы съели лишних = " + Sextra*kaloryPizzaSm + " каллорий");
        System.out.println("------------------------------------");
        System.out.println("Для справки:\n" +
                "'Как можно сжечь 1000 каллорий?))))\n" +
                "Бег: 400 ккал/час, 2.5 часа.\n" +
                "Велосипед: 270 ккал/час, 3.7 часа.\n" +
                "Скакалка: 600 ккал/час, 1.6 часа.\n");
        System.out.println("ПРИЯТНОГО АППЕТИТА! :-)))");







    }

}
