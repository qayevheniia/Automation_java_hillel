package Lessons12.Switch;

public enum DaysWeek {
    Monday (1, "This is the first day of week"),
    Tuesday ( 2,"This is the second day week"),
    Wednesday(3,"the third") ,
    Thursday(4,"forth"),
    Friday(5," fives"),
    Saturday(6,"six"),
    Sanday(7, "seven");

    int indexOfWeek;
    String description;

    DaysWeek(int indexOfWeek, String description) {
        this.indexOfWeek = indexOfWeek;
        this.description = description;
    }

    public int getIndexOfWeek() {
        return indexOfWeek;
    }

}
