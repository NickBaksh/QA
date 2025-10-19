package practice_8_1.generics_tasks.Task_1;

public class BoxCreator {
    //создаем экземпляр дженерика Box
    Box<String> box = new Box<>();

    public static void main(String[] args) {
        BoxCreator boxCreator = new BoxCreator();

        //устанавливаем значение объекта
        boxCreator.box.setValue("Обувная");

        //получаем значение объекта box и выводим в консоль
        System.out.println(boxCreator.box.getValue());
    }
}
