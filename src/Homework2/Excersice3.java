package Homework2;

import java.util.Scanner;

public class Excersice3 {
    /*Задание №3.
    1. введите 2 слова, используйте сканер, состоящий из четного количества букв
    (проверьте количество букв в слове).
    Получить слово, состоящее из первой половины первого слова
    и второй половины второго слова.
    распечатать на консоль.
    2. Реализовать программу, выводящую на экран результаты сложения,
    вычитания, умножения и деления двух чисел.
    Каждая из арифметических операций должна быть реализована как отдельный метод.
    3. реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США

     */
    public static void main(String[] args) {

//ЗАДАНИЕ №3.1. ================
        System.out.println("ЗАДАНИЕ №3.1. - мой вариант");

        String text1 = "Конь";
        String text2 = "як";

        System.out.println(text1);
        System.out.println(text1.length());

        System.out.println(text2);
        System.out.println(text2.length());

        System.out.println("Ответ: " + text1 + text2);

        //================

        System.out.println("=============");
        System.out.println("Теперь попробуйте Вы:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое слово: ");
        String inputWorte1 = scanner.nextLine();
        System.out.println(inputWorte1.length());

        System.out.println("Второе слово: ");
        String inputWorte2 = scanner.nextLine();
        System.out.println(inputWorte2.length());

        String Worte3 =  inputWorte1 + inputWorte2;
        System.out.println("Магия! Вы создали: " + Worte3);


//ЗАДАНИЕ №3.2. ================
        System.out.println("=============");
        System.out.println("ЗАДАНИЕ №3.2.");

        //умножение
        System.out.println("Введите 1 число для умножения: ");
        float number1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Введите 2 число для умножения: ");
        float number2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Результат умножения = " + (number1*number2));

        //деление
        System.out.println("Введите делимое: ");
        float number3 = Float.parseFloat(scanner.nextLine());
        System.out.println("Введите делитель: ");
        float number4 = Float.parseFloat(scanner.nextLine());
        System.out.println("Результат деления = " + (number3/number4));

        //сложение
        System.out.println("Введите 1 число для сложения: ");
        float number5 = Float.parseFloat(scanner.nextLine());
        System.out.println("Введите 2 число для сложения: ");
        float number6 = Float.parseFloat(scanner.nextLine());
        System.out.println("Результат сложения = " + (number5+number6));

        //вычитание
        System.out.println("Введите 1 число для вычитания: ");
        float number7 = Float.parseFloat(scanner.nextLine());
        System.out.println("Введите 2 число для вычитания: ");
        float number8 = Float.parseFloat(scanner.nextLine());
        System.out.println("Результат вычитания = " + (number7-number8));


//ЗАДАНИЕ №3.3. ================конвертировать евро в долларСША
        System.out.println("=============");
        System.out.println("ЗАДАНИЕ №3.3.");


        System.out.println("Введите сумму ЕВРО: ");
        float euro = Float.parseFloat(scanner.nextLine());
        System.out.println("Введите курс, т.е. стоимость $ USA в ЕВРО  ");
        System.out.println("Для справки! Курс $ USA в ЕВРО на 08.01.2023:\n " +
                "1 Евро равно 1.07 Доллар США");
        float kurs = Float.parseFloat(scanner.nextLine());
        String.format("%8.2f", kurs).replace(',', '.');
        float dollar = euro*kurs;
        String.format("%8.2f", dollar).replace(',', '.');
        System.out.println("Ваша сумма в $ USA: " + dollar);

    }
}

