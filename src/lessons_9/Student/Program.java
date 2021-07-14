package lessons_9.Student;

import lessons_9.Book.Books;

public class Program {

    public static  void main(String[] args) {

        Student aspirant = new Aspirant();
        Student students = new Student();

        Student []  stud = {aspirant,students};

        for (Student currentStudent: stud ){

            currentStudent.getScholarship(4);
        }

    }

}
