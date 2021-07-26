package ControlWork;

import java.util.Scanner;

public class Users {
    private  String FIO;
    private int idUsers;
    private String password;
    private String loginName;

    public Users(String FIO, int idUsers, String password, String loginName) {
        this.FIO = FIO;
        this.idUsers = idUsers;
        this.password = password;
        this.loginName = loginName;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getFIO() {
        return FIO;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public String getPassword() {
        return password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void signUp(String loginName, String password, String FIO, int idUsers ) {

        System.out.println();
    }

    public String signIn(String loginName, String password) {

                Scanner in = new Scanner(System.in);
                System.out.println("Please, enter your name ");
                loginName = in.next();
                System.out.println("Please, enter your password ");
                 password = in.next();

                String result = " ";

                if ((loginName.equals(getLoginName())) && (password.equals(getPassword()))) {
                    result = "login successful";
                } else {
                    result = "Error";
                }
                System.out.println(result);
                return result;

            }

    }

