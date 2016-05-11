package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * Created by klamkin on 4/8/16.
 */
public class TextNotificationTest extends TestCase {

    private String testNumber;
    private String testMessage;
    private TextNotification textSender;

    // assigning the values
    protected void setUp()
    {
        testNumber = "858-964-8046";
        testMessage = "test";
        textSender = new TextNotification(testNumber);
    }

    // test method to add notifications
    public void testAddNotification()
    {
        textSender.addNotification(testMessage);
        assertTrue(textSender.getMessage().equals("test"));
    }

    // test method to send notifications
    public void testSendNotification()
    {
        boolean sent = textSender.sendNotification("Test subject");
        assertTrue(sent);
    }

    // test method to add two values
    public void testEditNotification()
    {
        testMessage = "testAgain";
        textSender.editNotification(testMessage);
        assertTrue(textSender.getMessage().equals("testAgain"));
    }
}
