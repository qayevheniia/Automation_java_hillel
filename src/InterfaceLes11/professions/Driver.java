package InterfaceLes11.professions;
//Класс Driver содержит поля - ФИО, стаж вождения.
//Пусть класс Driver расширяет класс Person.
public class Driver implements Person {
    private String fio;
    private int drYears;

    public Driver(String fio, int drYears) {
        this.fio = fio;
        this.drYears = drYears;
    }

    @Override
    public String toString() {
        return fio +"\nDriving experience " +drYears;
    }
}
