import java.util.Set;

import api.NotificationService;
import model.ChannelType;
import model.Notification;
import model.UserPreference;
import service.NotificationDispatcher;
import service.UserPreferenceService;

public class Main {
    public static void main(String[] args) {
        
        UserPreferenceService preferenceService = new UserPreferenceService();

        preferenceService.savePreference(
            new UserPreference(
                "user123", 
                Set.of(ChannelType.EMAIL, ChannelType.SMS))
        );

        NotificationDispatcher dispatcher = 
            new NotificationDispatcher(preferenceService);

        NotificationService service = new NotificationService(dispatcher);

        Notification notification = new Notification("user123", "Your order has been shipped");

        service.sendNotification(notification);
    }
}
