package keniu;

import keniu.factories.EmailNotificationFactory;
import keniu.factories.NotificationFactory;
import keniu.factories.SMSNotificationFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NotificationFactory> notifications = List.of(new EmailNotificationFactory(), new SMSNotificationFactory());
        notifications.forEach(notification -> notification.send("Very important message"));
    }
}
