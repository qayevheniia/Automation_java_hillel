package controlWorkMessenger;

import java.util.*;


public class Chat implements MessengerInterface {
    String nameChat;
    User userMain;
    User secondUser;
    List<User> users;
    String loginName2;
    Map<Integer, User> myMap3;

    public Chat(String nameChat, User userMain, User secondUser) {
        this.nameChat = nameChat;
        this.userMain = userMain;
        this.secondUser = secondUser;
    }

    public void deleteChat() {
        System.out.println("Удаляем чат");
    }


    @Override
    public void getMessage() {
        System.out.println("Получаем сообщение в чат");

    }

    @Override
    public void deleteMessage() {

    }

    public Chat creatNewChat(User userMain) {

        Chat newChat = null;

        Scanner in = new Scanner(System.in);
        System.out.println("PLease enter Name your chat");
        String nameChat = in.next();

        System.out.println("PLease enter loginName your friend");
        String loginName2 = in.next();

        for (User secondUser : myMap3.values()) {
            if (secondUser.getLoginName().equals(loginName2)) {
                System.out.println("We found his");
                newChat = new Chat(nameChat, userMain, secondUser);
                break;
            } else {
                System.out.println("Wrong userName your friend. Please try again.");
            }
        }
        return newChat;
// надо дописать мап с новыми чатами
    }
    @Override
    public void sendMessage(Chat newChat) {
        System.out.println(" ");

    }

    }






