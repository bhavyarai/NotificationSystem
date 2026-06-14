package channel;

import model.Notification;

public class PushNotificationChannel implements NotificationChannel {
    @Override
    public void send(Notification notification) {
        System.out.println(
            "Sending PUSH notification to user " + notification.getUserId() 
            + ": " + notification.getMessage()
        );
    }
}
