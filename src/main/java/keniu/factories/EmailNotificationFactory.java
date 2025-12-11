package keniu.factories;

import keniu.notifications.EmailNotification;
import keniu.notifications.Notification;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
