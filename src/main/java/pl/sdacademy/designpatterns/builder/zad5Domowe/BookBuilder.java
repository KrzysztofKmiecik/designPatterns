package pl.sdacademy.designpatterns.builder.zad5Domowe;

public class BookBuilder {


    private String ISBN;
    private int pages;
    private String title;
    private String author;
    private String description;

//    public BookBuilder(final String ISBN, final int pages, final String title, final String author, final String description) {
//        this.ISBN = ISBN;
//        this.pages = pages;
//        this.title = title;
//        this.author = author;
//        this.description = description;
//    }

    public BookBuilder withISBN(final String ISBN) {
        this.ISBN = ISBN;
        return  this;
    }

    public BookBuilder withPages(final int pages) {
        this.pages = pages;
        return this;
    }

    public BookBuilder withTitle(final String title) {
        this.title = title;
        return this;
    }

    public BookBuilder withAuthor(final String author) {
        this.author = author;
        return this;
    }

    public BookBuilder withDescription(final String description) {
        this.description = description;
        return this;
    }

    public Book build(){
        return new Book(this.ISBN,this.pages,this.title,this.author,this.description);
    }

}
