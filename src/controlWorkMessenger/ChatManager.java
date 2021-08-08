package controlWorkMessenger;

import java.text.SimpleDateFormat;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class ChatManager {

    Map<Integer, Chat> chats;
    Chat newChat = new Chat();
    Message message;
    Map <Integer, Message> historyChat;




    public void deleteChat() {
        System.out.println("Удаляем чат");
    }

    public Map<Integer, Chat> creatNewChat(Map<Integer, User> users, User userMain) {
        int i=0;
        chats = new HashMap<>();

        Scanner in = new Scanner(System.in);
        System.out.println("PLease enter Name your chat");
        newChat.setNameChat(in.next());

        System.out.println("PLease enter loginName your friend");
        String loginName2 = in.next();

        try {
            newChat.setUserMain(userMain);
            for (User secondUser : users.values()) {
                if (secondUser.getLoginName().equals(loginName2)) {
                    System.out.println("We found his");
                    newChat.setSecondUser(secondUser);
                    i += 1;
                    chats.put(i, new Chat(newChat.getNameChat(), newChat.getUserMain(), newChat.getSecondUser()));
                    break;

                } else {
                    System.out.println("Wrong userName your friend. Please try again.");
                    break;
                }
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }

// надо дописать мап с новыми чатами
        System.out.println(chats);
        return (chats);
    }

 public void addMessage(  ){
     int i=0;
     historyChat = new HashMap<>();
     Scanner in = new Scanner(System.in);
     System.out.println("PLease enter Name of chat");
     String nameChat = in.next();

     System.out.println("PLease enter message");
     String messageString = in.next();
     String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

     try {
         for (Chat findChat: chats.values()) {
             if (findChat.getNameChat().equals(nameChat)) {
                 System.out.println("We found this chat");
                 i += 1;
                 historyChat.put(i, new Message(messageString,timeStamp, false, findChat));
                 break;

             } else {
                 System.out.println("Wrong name of chat");
             }
         }
     } catch (OutOfMemoryError e) {
         e.printStackTrace();
     }
     System.out.println(historyChat);
 }
}
