package practice_8_1.generics_tasks.Task_1;

//Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
// Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.

//создаем дженерик класс Box, который хранит объекты любого типа (нет extends)
public class Box <T> {
    private T value;

    //сеттер для установки значения объекта
    public void setValue(T value) {
        this.value = value;
    }

    //геттер для получения значения объекта класса Box
    public T getValue() {
        return this.value;
    }
}
