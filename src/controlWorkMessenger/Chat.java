package controlWorkMessenger;

import java.util.*;


public class  Chat  implements MessengerInterface  {
    String nameChat;
    User userMain;
    User secondUser;
    List<User> users;
    String loginName2;
    Map<Integer, User> myMap3;


    @Override
    public String toString() {
        return "Chat{" +
                "nameChat='" + nameChat + '\'' +
                ", userMain=" + userMain +
                ", secondUser=" + secondUser +
                ", users=" + users +
                ", loginName2='" + loginName2 + '\'' +
                ", myMap3=" + myMap3 +
                '}';
    }

    public Chat() {
    }

    public Chat(String nameChat, User userMain, User secondUser) {
        this.nameChat = nameChat;
        this.userMain = userMain;
        this.secondUser = secondUser;
    }

    public String getNameChat() {
        return nameChat;
    }

    public void setNameChat(String nameChat) {
        this.nameChat = nameChat;
    }

    public User getUserMain() {
        return userMain;
    }

    public void setUserMain(User userMain) {
        this.userMain = userMain;
    }

    public User getSecondUser() {
        return secondUser;
    }

    public void setSecondUser(User secondUser) {
        this.secondUser = secondUser;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public void getMessage() {
        System.out.println("Получаем сообщение в чат");

    }

    @Override
    public void deleteMessage() {

    }

    @Override
    public void sendMessage(Chat newChat) {
        System.out.println(" ");

    }
    }






