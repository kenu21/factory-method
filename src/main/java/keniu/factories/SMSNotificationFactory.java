package keniu.factories;

import keniu.notifications.Notification;
import keniu.notifications.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
