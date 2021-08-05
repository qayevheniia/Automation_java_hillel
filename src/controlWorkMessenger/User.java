package controlWorkMessenger;

import java.util.*;

public class User extends UserAbstr implements AdminRole {
    private String FIO;
    private String email;
    private  String password;
    UserStatusIndications status;
    private UserRole userRole;
    private String loginName;
    Map<Integer, User> myMap3;
    public User() {
    }


    //експешен на юзер нейм


    public User(String FIO, String password, String loginName, String email, UserStatusIndications status) {
        super(loginName);
        this.FIO = FIO;
        this.email = email;
        this.password = password;
        this.status = status;


    }

    public User(Map<Integer, User> myMap) {
        this.myMap3 = myMap;
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
                ", myMap3=" + myMap3 +
                '}';
    }

    public void signUp() {
        int a=3;
        int i = 0;
        User newUser = null;
//        взяла hashmap так как хочу получить id и они же будут ключем
        myMap3 = new HashMap<>();

        while (a > 0) {
            a-=1;
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter your FIO");
            FIO = in.next();
            System.out.println("Please, enter your password");
            password = in.next();
            System.out.println("Please, loginName");
            loginName = in.next();
            System.out.println("Please, email");
            this.email = in.next();
            i+=1;
            newUser = new User(FIO, password, loginName, email, UserStatusIndications.avaible);
            myMap3.put(i, newUser);
            System.out.println(myMap3);

            System.out.println("Please add more users");
        }
        System.out.println(myMap3.toString());

    }

    public User signIn() {
        User user1 = null;
        while (user1 == null){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your loginName ");
        loginName = in.next();

        System.out.println("Please, enter your Password ");
        password = in.next();


        for (User userOneChat : myMap3.values()) {
            if ((myMap3.containsValue(loginName)) && (myMap3.containsValue(password))) {
                user1 = userOneChat;
                System.out.println("login successful");

            } else {
                System.out.println("Wrong password or name. Please try again.");
            }
        }
        }
        return user1;
    }


    @Override
    public void deleteUser(User[] user) {

                if (this.userRole.equals(UserRole.admin)) {
                    System.out.print("Please enter the ID of the user to be removed: ");
                    Scanner in = new Scanner(System.in);
                    int choice = in.nextInt();
                    for (User newUsers : user) {
                        if (newUsers.getIdUsers() == choice) {
//                            newUsers.remove(choice);

                } else {
                }

            }
        }
    }
}

