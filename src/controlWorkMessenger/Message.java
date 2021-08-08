package controlWorkMessenger;



public class Message {

    String text;
    String time;
    Boolean isRead;
    Chat newChat;

    public Message() {
    }

    public Message(String text, String time, Boolean isRead, Chat newChat) {
        this.text = text;
        this.time = time;
        this.isRead = isRead;
        this.newChat = newChat;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", time='" + time + '\'' +
                ", isRead=" + isRead +
                ", newChat=" + newChat +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }
}
