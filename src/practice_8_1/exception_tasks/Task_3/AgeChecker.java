package practice_8_1.exception_tasks.Task_3;

public class AgeChecker {
    //Разработайте метод, который проверяет валидность возраста пользователя.
    // Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.


    //Метод проверяет введенный возраст на валидность. В случае если возраст не входит в допустимые границы
    // срабатывает исключение UnrealAgeException. В ином случае печатается сообщение об успехе
    public static void checkAge(int age) throws UnrealAgeException {
        if (age < 0 || age > 150) {
            throw new UnrealAgeException("unreal age");
        } else System.out.println("Age: " + age + " is valid!");
    }

    public static void main(String[] args) {
        //вызываем метод проверки возраста и ловим исключение UnrealAgeException
        try {
            checkAge(200);
        } catch (UnrealAgeException e ) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
