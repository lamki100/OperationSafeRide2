package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * Created by klamkin on 4/10/16.
 */
public class EmergencyPanicTest extends TestCase {

    private EmergencyPanic emergencyPanic;
    private String testNum;

    protected void setUp()
    {
        // create users
        testNum = "7608280121";
        emergencyPanic = new EmergencyPanic(testNum);
    }

    public void testAddEmergencyNotification() throws Exception
    {
        emergencyPanic.addEmergencyNotification("help");
        assertTrue(emergencyPanic.getMessage().equals("Emergency button activated. Send Public Safety officer to: help"));
    }

    public void testSendEmergency() throws Exception
    {
        boolean sent = emergencyPanic.sendEmergency();
        assertTrue(sent);
    }

    public void testClearMessage() throws Exception
    {
        emergencyPanic.clearMessage();
        assertTrue(emergencyPanic.getMessage().equals(""));
    }
}
