package pl.sdacademy.designpatterns.builder.zad5Domowe;

public class Book {
    //Stwórz klasę Book składającą się z 5 pól: ISBN(String),
    // pages(int), title(String), author(String) description(String)

private String ISBN;
private int pages;
private String title;
private String author;
private  String description;

    public Book(final String ISBN, final int pages, final String title, final String author, final String description) {
        this.ISBN = ISBN;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
