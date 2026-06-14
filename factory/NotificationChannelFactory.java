package factory;

import channel.EmailNotificationChannel;
import channel.NotificationChannel;
import channel.PushNotificationChannel;
import channel.SmsNotificationChannel;
import model.ChannelType;

public class NotificationChannelFactory {
    public static NotificationChannel getChannel(ChannelType channelType) {
        if (channelType == null) {
            throw new IllegalArgumentException("channelType must not be null");
        }
        switch (channelType) {
            case EMAIL:
                return new EmailNotificationChannel();
            case SMS:
                return new SmsNotificationChannel();
            case PUSH:
                return new PushNotificationChannel();
            default:
                throw new IllegalArgumentException("Unsupported channel type: " + channelType);
        }
    }

}
