package HomeWorkLesson5;

//сама не смогла найти...
//выдает много результатов с неизвестными мне командами и решениями)
//метод замена символов replace
public class HomeWorkLesson5 {
    public static void main(String[] args) {
        String text = "Это Маша. Маша - программист. Маша - программист Java Script";
        String text2 = text.replace('M','S');
        System.out.println(text2);

        StringMethodsTest(text);
    }       public static void StringMethodsTest(String text){

        System.out.println("Слово 'Маша' ищет с начала строки, индекса номер: " + text.indexOf("Маша"));
        System.out.println("Слово 'Маша' ищет с конца строки, индекс номер: " + text.lastIndexOf("Маша"));


    }
}
