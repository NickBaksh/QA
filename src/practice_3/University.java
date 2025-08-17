package practice_3;

public class University {
    static String universityName = "Oxford";
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println(studentName);
        System.out.println(studentID);
        System.out.println(University.universityName);
    }
}
