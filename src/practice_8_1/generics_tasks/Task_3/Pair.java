package practice_8_1.generics_tasks.Task_3;

public class Pair <T, U> {
    private T hours;
    private U minutes;

    public void setHours(T hours) {
        this.hours = hours;
    }

    public void setMinutes(U minutes) {
        this.minutes = minutes;
    }

    //метод для установки сразу обоих полей <T, U> (настройка времени на часах)
    public void setTime(T hours, U minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public T getHours() {
        return this.hours;
    }

    public U getMinutes() {
        return this.minutes;
    }
}
