package pl.sdacademy.designpatterns.builder.zad5Domowe;

public class zad5Demo {
    public static void main(String[] args) {
        final Book book1 = new BookBuilder().withISBN("12345").withAuthor("Fidler").withTitle("Dywizjon303").withDescription("IIWojnaSwiatowa").build();
        final Book book2 = new BookBuilder().withISBN("12346").withAuthor("Prus").withTitle("Lalka").withDescription("Lektura").withPages(100).build();

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
