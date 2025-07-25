package practice_2;

public class Teacher {
    String name;
    String subject;

    //Конструктор
    Teacher (String someName, String someSubject) {
        this.name = someName;
        this.subject = someSubject;
    }

    String getName() {
        return name;
    }

    String getSubject() {
        return subject;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    void printInfo() {
        System.out.println("Учитель: " + name + ", предмет: " + subject);
    }
}
