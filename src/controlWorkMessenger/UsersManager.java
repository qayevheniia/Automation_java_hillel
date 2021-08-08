package controlWorkMessenger;

import java.rmi.NoSuchObjectException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsersManager extends UserAbstr {
    Map<Integer, User> users;

    public UsersManager() {
    }
    public UsersManager(Map<Integer, User> users) {
        this.users = users;
    }



    public Map signUp() {
        try {
            int a = 3;
            int i = 0;
            User newUser = new User();
//        взяла hashmap так как хочу получить id и они же будут ключем
            users = new HashMap<>();

            while (a > 0) {
                a -= 1;
                Scanner in = new Scanner(System.in);
                System.out.println("Please, enter your FIO");
                newUser.setFIO(in.next());
                System.out.println("Please, enter your password");
                newUser.setPassword(in.next());
                System.out.println("Please, loginName");
                newUser.setLoginName(in.next());
                System.out.println("Please, email");
                newUser.setEmail(in.next());
                i += 1;
                users.put(i, new User(newUser.getFIO(), newUser.getEmail(), newUser.getPassword(), UserStatusIndications.avaible, UserRole.general, newUser.getLoginName()));
                System.out.println(users);
                System.out.println("Please add more users");
            }


        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        System.out.println(users.toString());
        return users;
    }


    public User signIn() {
        User userMain = null;
        while (userMain == null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter your loginName ");
            String login_validation = in.next();

            System.out.println("Please, enter your Password ");
            String password_validaion = in.next();
            int b = 3;


            for (User userMain2 : users.values()) {
                if ((userMain2.getPassword().equals(password_validaion)) && (userMain2.getLoginName().equals(login_validation))) {

                    userMain = userMain2;
                    System.out.println("login successful");
                    break;

                } else {
                    System.out.println("Wrong password or name. Please try again.");
                    break;
                }
            }
            System.out.println(userMain);
        }
        return userMain;

    }

    @Override
    public String getFIO() {
        return null;
    }

    @Override
    public Integer getidUser(String loginName) {
        int a = 0;
       try {

           for (Map.Entry<Integer, User> getUser : users.entrySet()) {
               if (getUser.getValue().getLoginName().equalsIgnoreCase(loginName)) {
                   a = getUser.getKey();
               } else {
                   System.out.printf("Wrong userName");
               }
           }
       }
       catch (Exception e){
           System.out.println("ТОшибка при поиске обьекта");
       }
        return a;
    }
}
