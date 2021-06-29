package Mobile;

public class Iphone extends Mobile {
    private String sendMessage;
    private String messageTo;
    public Iphone(){

    }
    public Iphone(String sendMessage, String messageTo){
        this.sendMessage=sendMessage;
        this.messageTo=messageTo;
    }
    public Iphone(String name,String sendMessage, String messageTo, String message){
        super(name,message);
        this.sendMessage=sendMessage;
        this.messageTo=messageTo;
    }

    @Override
    public void setMessenger(String messenger) {
        super.setMessenger(messenger);
    }

    public String getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
    }

    public void setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
    }

    public String getSendMessage() {
        return sendMessage;
    }


}
