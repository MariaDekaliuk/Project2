package Homework1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello Ukraine!\nHallo Hallo");
        System.out.print("Hallo");
        System.out.print("world\n");
        System.out.println(1000);

        /*
        Домашнее задание 08.12.2022
        Задание №3: В методе main
        инициализировать все примитивные типы
        и вывести их в консоль
         */

        byte    a = 3;
        short   b = 70;
        int     c = 210;
        long    d = 1_000_000;
        float  pi = 3.14F;
        double  p = 19.10;
        boolean e = true;
        boolean z = false;
        char    t = 'W';

        System.out.println("Значение byte = " + a);
        System.out.println("Значение short = " + b);
        System.out.println("Значение int = " + c);
        System.out.println(d);
        System.out.println("Значение float = pi = " + pi);
        System.out.println(p);
        System.out.println(e);
        System.out.println(z);
        System.out.println(t);


        /*Задача 2: Дано трехзначное число.
        Вывести все 3 цифры этого числа.
        */

        int k = 345;
        int w = 341;
        int k1 = k/100;
        int k2 = k-w;
        int k3 = k % 10;
        System.out.println("-------------------");
        System.out.println("Задача 2");
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        System.out.println("Это верно4");

    }
}