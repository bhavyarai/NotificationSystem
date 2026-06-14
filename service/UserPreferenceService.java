package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import model.ChannelType;
import model.UserPreference;

public class UserPreferenceService 
{
    // Use ConcurrentHashMap() --> Synchronize at bucket level
    private final Map<String, UserPreference> preferences = new HashMap<>();

    public void savePreference(UserPreference preference) {
        preferences.put(preference.getUserId(), preference);
    }
    // can syncronized
    public UserPreference getPreference(String userId) {
        return preferences.getOrDefault(
            userId, 
            new UserPreference(userId, Set.of(ChannelType.EMAIL))
        );
    }
}
