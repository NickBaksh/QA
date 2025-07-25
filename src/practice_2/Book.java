package practice_2;

public class Book {
    String title;
    String author;

    //Конструктор
    Book (String someTitle, String someAuthor) {
        this.title = someTitle;
        this.author = someAuthor;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void printInfo() {
        System.out.println("Название книги: '" + getTitle() + "', автор книги: " + getAuthor());
    }
}
