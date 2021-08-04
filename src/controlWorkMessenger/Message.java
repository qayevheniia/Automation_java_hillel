package controlWorkMessenger;



public class Message {
    public Message(int messageId, String text, String time, Boolean isRead) {
        this.messageId = messageId;
        this.text = text;
        this.time = time;
        this.isRead = isRead;
    }

    int messageId;
    String text;
    String time;
    Boolean isRead;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
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
