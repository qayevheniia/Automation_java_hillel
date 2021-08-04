package controlWorkMessenger;

import java.util.Scanner;

public class Chat implements MessengerInterface {
    String nameChat;
    User user1;
    User user2;
    private User[] users;



    //    create new chat
    public void creatNewChat(String NameChat, User user2  ) {

        System.out.println("PLease enter name of new Chat");
        Scanner in = new Scanner(System.in);
        NameChat = in.nextLine();

        System.out.println("PLease enter id user");
        int code = in.nextInt();
        user2 = users[code];

    }

    public Chat(String nameChat, User user1, User user2 ) {
        this.nameChat = nameChat;
        this.user1 = user1;
        this.user2 = user2;
    }

    public void deleteChat( ) {
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
}
