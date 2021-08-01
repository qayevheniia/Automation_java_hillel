package ControlWorkMessenger;

public class DemoMessengers {

    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new User("Motytskaya Eugeniia", "1", "Zhenya", "motyt@gmail.com.ua", UserStatusIndications.avaible);
        users[1] = new User("Motytskai Igor", "2",  "Igor", "@gmail", UserStatusIndications.offline);


        Chats chat1 = new Chats("Friend", users[0], users[1]);

    }
}
