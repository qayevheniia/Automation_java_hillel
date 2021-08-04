package controlWorkMessenger;

public class DemoMessengers {

    public static void main(String[] args) {
//        переделать на лист
        User[] user = new User[2];
        user[0] = new User("Motytskaya Eugeniia", "1", "Zhenya", "motyt@gmail.com.ua", UserStatusIndications.avaible);
        user[1] = new User("Motytskai Igor", "2",  "Igor", "@gmail", UserStatusIndications.offline);


        Chat chat1 = new Chat("Friend", user[0], user[1]);

    }
}
