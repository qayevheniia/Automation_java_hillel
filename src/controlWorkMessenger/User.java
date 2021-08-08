package controlWorkMessenger;

import java.util.*;

public class User extends UserAbstr implements AdminRole {
    private String FIO;
    private String email;
    private  String password;
    UserStatusIndications status;
    private UserRole userRole;

    Map <Integer, User> users;

    public User(String FIO, String email, String password, UserStatusIndications status, UserRole userRole, String loginName) {
        super(loginName);
        this.FIO = FIO;
        this.email = email;
        this.password = password;
        this.status = status;
        this.userRole = userRole;

    }

    @Override
    public String toString() {
        return "User{" +
                "FIO='" + FIO + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", userRole=" + userRole +
                '}';
    }

    public User() {
    }



    public String getFIO() {
        return FIO;
    }



    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatusIndications getStatus() {
        return status;
    }

    public void setStatus(UserStatusIndications status) {
        this.status = status;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }



    @Override
    public void deleteUser(User userMain) {


        if (userMain.userRole.equals(UserRole.admin)) {
            System.out.print("Please enter the ID of the user to be removed: ");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            for (Integer newUsers : users.keySet()) {
                if (newUsers == choice) {
                    users.remove(choice);

                } else {
                }

            }
        }
    }
}

