package channel;

import model.Notification;

public interface NotificationChannel {
    void send(Notification notification);
}
