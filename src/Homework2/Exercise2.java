package Homework2;

import java.security.PublicKey;

public class Exercise2 {
    /*Задание №2.
    1. Создайте строку через new - I study Basic Java!
    2. Напишите метод, который принимает в качестве параметра строку,
       передайте в этот метод строку, которую создали в п.1
    3. Распечатать последний символ строки. Используем метод String.charAt().
    4. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    5. Заменить все символы “а” на “о”.
    6. Преобразуйте строку к верхнему регистру.
    7. Преобразуйте строку к нижнему регистру.
    8. Вырезать строку Java c помощью метода String.substring().

     */

    public static void main(String[] args) {
        String text = new String("I study Basic Java!");

        StringMethods firstText = new StringMethods();
        firstText.variableText = "I study Basic Java!";
        System.out.println(firstText.variableText);

        System.out.println(text.charAt(18));

        String text2 = "Java";
        boolean resultContains = text.contains(text2);
        System.out.println(resultContains);

        String text3 = text.replace('a','o');
        System.out.println(text3);

        String text4UpperCase = text.toUpperCase();
        System.out.println(text4UpperCase);     //все большими

        String text5LowerCase = text.toUpperCase();
        System.out.println(text5LowerCase); //все маленьким
        //System.out.println(text.toLowerCase());

        String sunText = text.substring(0,19); //вырезать текст с.. по.. для вывода
        System.out.println(sunText);
        String sunText2 = text.substring(0); //вывод текста с..
        System.out.println(sunText2);

    }
}
