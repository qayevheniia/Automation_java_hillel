package lessons_9.Book;

import lessons_9.Book.Books;

public class Reader {
    private String FIO;
    private int IdReader;
    private String Fakulty;
    private String DataBirth;
    private String phone;

    public Reader(String FIO, int idReader, String fakulty, String dataBirth, String phone) {
        this.FIO = FIO;
        IdReader = idReader;
        Fakulty = fakulty;
        DataBirth = dataBirth;
        this.phone = phone;
    }

    public Reader() {

    }

    public String getFIO() {
        return FIO;
    }

    public int getIdReader() {
        return IdReader;
    }

    public String getFakulty() {
        return Fakulty;
    }

    public String getDataBirth() {
        return DataBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setIdReader(int idReader) {
        IdReader = idReader;
    }

    public void setFakulty(String fakulty) {
        Fakulty = fakulty;
    }

    public void setDataBirth(String dataBirth) {
        DataBirth = dataBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int books) {

        System.out.println(this.FIO + "взял:" + books + " книги");
    }


    public void takeBook(String nameBooks) {


        System.out.println(this.FIO + "взял: " + nameBooks);
    }


    public void takeBook(Books[]  books) {

        for (Books books1: books ){

        System.out.println(this.FIO + "взял: " + books1);}
    }


}


