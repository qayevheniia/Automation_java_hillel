package lessons_9.Book;


public class MainClass {

    public static  void main(String[] args) {
        int book = 3;

        Reader petrov = new Reader("Петров В. В.", 12, "Test", "22.22.2022","+380");
        Reader[] readers = {petrov};

        Books book1 = new Books("Test1","Tester1");
        Books book2 = new Books("Test2","Tester2");
        Books book3 = new Books("Test3","Tester3");
        Books [] books = {book1, book2, book3};

        petrov.takeBook(book);

        petrov.takeBook("Приключения, Словарь, Энциклопедия");

        petrov.takeBook(books);
    }
}
