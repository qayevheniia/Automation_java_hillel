package lessons_9.Student;

public class Aspirant extends Student{


    public Aspirant() {
    }

    public void getScholarship(double averageMark){
        int summGrunt;

        if (averageMark==5){

            summGrunt = 200;
        }
        else {
            summGrunt = 180;
        }

        System.out.println(summGrunt);

    }
}
