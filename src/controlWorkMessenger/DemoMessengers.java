package controlWorkMessenger;

import java.util.*;


public class DemoMessengers {



    public static void main(String[] args) {
//        переделать на лист

         UsersManager newUser = new UsersManager();
        ChatManager newChat = new ChatManager();
        newChat.creatNewChat(newUser.signUp(), newUser.signIn());
        newChat.addMessage();



//        Chat chat1 = new Chat("Family", myMap3.get(1), myMap3.get(2));
//        Chat chat2 = new Chat("Work", myMap3.get(3), myMap3.get(2));
//
//        List<Chat> chatsUser2 = new ArrayList<>();
//        chatsUser2.add(chat1);
//        chatsUser2.add(chat2);

        }
    }

