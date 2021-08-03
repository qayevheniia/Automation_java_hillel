package ControlWorkMessenger;

import java.beans.ExceptionListener;
import java.util.UnknownFormatConversionException;
import java.util.*;

public class Messages extends UserAbstr implements MessengerAbstr{
    int Message;


    public Messages(String loginName, int idUsers) {
        super(loginName, idUsers);
    }


    public void addNewMessage(String message)  {
//        try{
////           code
//        }
//
//        catch (ExceptionsMessanger e){
//            System.err.println("We have a problem " +e.toString());
//
//        }

    }

    public void deleteMessage(int Message) {

        System.out.println();
    }

    @Override
    public void sendMessage() {
        System.out.println("отправить сообещние");

    }

    @Override
    public void getMessage() {
        System.out.println("Получить сообщение");
    }


}
