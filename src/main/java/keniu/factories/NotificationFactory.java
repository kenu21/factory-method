package keniu.factories;

import keniu.notifications.Notification;

public abstract class NotificationFactory {
    protected abstract Notification createNotification();

    public void send(String message) {
        createNotification().sendMessage(message);
    }
}
