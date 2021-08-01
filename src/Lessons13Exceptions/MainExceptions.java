package Lessons13Exceptions;

public class MainExceptions {
    public static void main(String[] args) {

        try {
//            int number = 4 / 0;
//            throw new ArithmeticException(); - если надо вызвать где-то этот ексепшенс
            int age = 6;
            checkAge(age);

        }
        catch (ArithmeticException | MyBestExceptions e){
            System.err.println("We have a problem " +e.toString());
//            err - если надо красным цветом выделить
        }
        finally {
            System.out.println("We did it!");
        }


    }

    private static void checkAge(int age) throws MyBestExceptions {
        if (age>=18){
            System.out.println("It's ok");
        }
        else {
            throw new MyBestExceptions("Your age under 18");
        }
    }
}
