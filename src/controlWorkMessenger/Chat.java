package controlWorkMessenger;

import java.util.*;


public class Chat implements MessengerInterface {
    String nameChat;
    User user1;
    User user2;
    List<User> users;
    String loginName;
    String loginName2;
//    можно ли использовать для получения ид?

    Map <Integer, User> chats;

    Map<Integer, User> myMap3 = new HashMap<>();

    public Chat(String nameChat, User user1, User user2) {
        this.nameChat = nameChat;
        this.user1 = user1;
        this.user2 = user2;
    }

    public void deleteChat() {
        System.out.println("Удаляем чат");
    }


    @Override
    public void sendMessage(Message message) {
        System.out.println(" ");

    }

    @Override
    public void getMessage() {
        System.out.println("Получаем сообщение в чат");

    }

    @Override
    public void deleteMessage() {

    }

    public void creatNewChat() {

        List<Chat> chatsUser2 = new ArrayList<>();

        System.out.println("PLease enter your loginName");

        Scanner in = new Scanner(System.in);
        loginName = in.next();
        for (User userOneChat : myMap3.values()) {
            if (myMap3.containsValue(loginName)) {
                user1 = userOneChat;
            }
        }
            System.out.println("PLease enter your loginName your friend");
            loginName2 = in.next();

            for (User userTwoChat : myMap3.values()) {
                if (myMap3.containsValue(loginName2)) {
                    user2 = userTwoChat;
                }
            }

                System.out.println("PLease enter name of new chat");
                nameChat = in.next();
            }
            Chat chat1 = new Chat(nameChat, user1, user2);



    }

