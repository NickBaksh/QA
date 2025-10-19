package practice_8_1.generics_tasks.Task_3;

public class Watch {
    //Создайте класс Pair, который может хранить два объекта разных типов.
    // Класс должен позволять получать и устанавливать каждый из этих объектов.


    Pair<Integer, Integer> intClock = new Pair<>();
    Pair<String, String> strClock = new Pair<>();

    public static void main(String[] args) {
        Watch watch = new Watch();

        //Пример с хранением объектов с типом данных Integer
        watch.intClock.setHours(12);
        watch.intClock.setMinutes(52);

        System.out.println(watch.intClock.getHours());
        System.out.println(watch.intClock.getMinutes());

        //Пример с хранением объектов с типом данных String
        watch.strClock.setHours("Двенадцать");
        watch.strClock.setMinutes("Пятьдесят две");

        System.out.println(watch.strClock.getHours());
        System.out.println(watch.strClock.getMinutes());

        //Пример с установкой сразу двух объектов
        watch.intClock.setTime(12, 52);

        System.out.println(watch.intClock.getHours());
        System.out.println(watch.intClock.getMinutes());
    }
}
