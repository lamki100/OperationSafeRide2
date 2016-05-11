package com.chapman.operationsaferide;

/**
 * Created by klamkin on 4/4/16.
 * @author klamkin
 *
 * This is an interface that interactions with both the Text
 * Notification class and the Email Notification class. These
 * functions will be recreated in those classes specified for
 * their individual functions
 */
public interface NotificationSystem {

    public void addNotification(String newMessage);

    public boolean sendNotification(String subject);

    public void editNotification(String edittedMessage);

    public String getMessage();
}
