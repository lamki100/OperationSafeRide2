package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * Created by klamkin on 4/8/16.
 * @author klamkin
 * @see junit.framework.TestCase
 */
public class EmailNotificationTest extends TestCase {

    private String testUserEmail;
    private String testMessage;
    private EmailNotification emailSender;

    /**
     * Assigning the values
     */
    protected void setUp()
    {
        testUserEmail = "kmlamkin@gmail.com";
        testMessage = "test";
        emailSender = new EmailNotification(testUserEmail);
    }

    /**
     * test method to add notifications
     */
    public void testAddNotification()
    {
        emailSender.addNotification(testMessage);
        assertTrue(emailSender.getMessage().equals("test"));
    }

    // test method to send notifications
    public void testSendNotification()
    {
        boolean sent = emailSender.sendNotification("test subject");
        assertTrue(sent);
    }

    // test method to add two values
    public void testEditNotification()
    {
        testMessage = "testAgain";
        emailSender.editNotification(testMessage);
        assertTrue(emailSender.getMessage().equals("testAgain"));
    }
}