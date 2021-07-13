package lessons_9;


public class MainClass {

    public static  void main(String[] args) {
        int book = 3;

        Reader petrov = new Reader("Петров В. В.", 12, "Test", "22.22.2022","+380");
        Reader[] readers = {petrov};

        Books book1 = new Books("Test","Tester");
        Books book2 = new Books("Test","Tester");
        Books book3 = new Books("Test","Tester");
        Books [] books = {book1, book2, book3};

        petrov.takeBook(book);

        petrov.takeBook("Приключения, Словарь, Энциклопедия");

        petrov.takeBook(books.toString());

        System.out.println(books[0].toString());




    }
}
