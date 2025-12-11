package keniu.notifications;

public class EmailNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("EmailNotification was sent with message: " + message);
    }
}
