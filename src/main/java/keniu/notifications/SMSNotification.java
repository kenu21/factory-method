package keniu.notifications;

public class SMSNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMSNotification was sent with message: " + message);
    }
}
