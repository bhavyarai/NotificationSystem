package model;

public class Notification {
    private final String userId;
    private final String message;
    private ChannelType type;


    public Notification(String userId, String message) {
        this.userId = userId;
        this.message = message;
    }
    public String getUserId() {
        return userId;
    }
    public String getMessage() {
        return message;
    }
    public ChannelType getType() {
        return type;
    }
    public void setType(ChannelType type) {
        this.type = type;
    }
}
