package controlWorkMessenger;

import java.util.*;

public class User extends UserAbstr implements AdminRole {
    private String FIO;
    private String email;
    private  String password;
    UserStatusIndications status;
    private UserRole userRole;
    private String loginName;
    Map <Integer, User> users;


    public User (String FIO, String email, String password, UserStatusIndications status,
                UserRole userRole, String loginName) {
        this.FIO = FIO;
        this.email = email;
        this.password = password;
        this.status = status;
        this.userRole = userRole;
        this.loginName = loginName;
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



    public String getFIO() {
        return FIO;
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO='" + FIO + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", userRole=" + userRole +
                ", loginName='" + loginName + '\'' +
                '}';
    }

    public void signUp() {
        int a=3;
        int i = 0;
        User newUser = null;
//        взяла hashmap так как хочу получить id и они же будут ключем
        users = new HashMap<>();

        while (a > 0) {
            a-=1;
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter your FIO");
            setFIO(in.next());
            System.out.println("Please, enter your password");
            password = in.next();
            System.out.println("Please, loginName");
            setLoginName(in.next());
            System.out.println("Please, email");
            this.email = in.next();
            i+=1;
            newUser = new User(getFIO(), getEmail(), getPassword(), UserStatusIndications.avaible, UserRole.general, getLoginName());
            users.put(i, newUser);
            System.out.println(users);

            System.out.println("Please add more users");
        }
        System.out.println(users.toString());

    }

    public User signIn() {
        User userMain = null;
        while (userMain == null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter your loginName ");
            loginName = in.next();

            System.out.println("Please, enter your Password ");
            password = in.next();
            int b=3;


                for (User userOneChat : users.values()) {
                    if ((userOneChat.getPassword().equals(loginName)) && (userOneChat.getPassword().equals(password))) {

                        userMain = userOneChat;
                        System.out.println("login successful");
                        break;

                    } else {
                        System.out.println("Wrong password or name. Please try again.");
                    }
                }
            System.out.println(userMain);
            }
            return userMain;

        }

    public User() {
    }

    @Override
    public void deleteUser(User userMain) {

                if (this.userRole.equals(UserRole.admin)) {
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

