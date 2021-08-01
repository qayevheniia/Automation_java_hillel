package ControlWorkMessenger;

import Lessons13Exceptions.MainExceptions;

import java.util.Scanner;

public class User extends UserAbstr implements Person{
    private  String FIO;
    private int idUsers;
    private final String email;
    private final String password;
    UserStatusIndications status;

//експешен на юзер нецм

    public User(String FIO, String password, String loginName, String email, UserStatusIndications status) {
        super(loginName);
        this.FIO = FIO;
        this.email=email;
        this.password=password;
        this.status=status;


    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }


    public String getFIO() {
        return FIO;
    }

    public int getIdUsers() {
        return idUsers;
    }


    public void signUp(String loginName, String password, String FIO) {

        System.out.println("Регистрация прошла успешно");
    }

    public String signIn(String loginName, String password) throws ExceptionsMessanger {

                Scanner in = new Scanner(System.in);
                System.out.println("Please, enter your name ");
                loginName = in.next();
                System.out.println("Please, enter your password ");
                 password = in.next();

                String result = " ";

                if ((loginName.equals(getLoginName())) && (password.equals(getPassword()))) {
                    result = "login successful";
                } else {
                    throw new ExceptionsMessanger("Wrong password or name");

                }
                System.out.println(result);
                return result;

            }

    @Override
    public Integer createidUser() {
        return null;
    }
}

