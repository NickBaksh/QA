package practice_8_1.exception_tasks.Task_4;

import java.util.regex.Pattern;

public class EmailChecker {
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void checkEmail(String email) {
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidEmailException("Your email is invalid");
        } else System.out.println("Your email is valid!");
    }

    public static void main(String[] args) {
        try {
            checkEmail("sdsdad@gmail.com");
        } catch (InvalidEmailException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
