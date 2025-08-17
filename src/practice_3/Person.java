package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String someFirstName, String someLastName, String someSSN) {
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSSN;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    void printPersonInfo() {
        System.out.println("Имя: " + getFirstName());
        System.out.println("Фамилия: " + getLastName());
        System.out.println("SSN " + ssn);
    }
}
