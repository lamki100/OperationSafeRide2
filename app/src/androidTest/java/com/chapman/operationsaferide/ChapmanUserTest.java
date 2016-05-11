package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * Created by Melissa on 4/10/2016.
 * @author Melissa LeBlanc
 * @version 1.0
 * @see {@link junit.framework.TestCase}
 */
public class ChapmanUserTest extends TestCase {

    private String testName;
    private int testID;
    private int testGuests;
    private String testString;
    private ChapmanUser user;

    /**
     * @throws Exception
     */
    protected void setUp() throws Exception
    {
        super.setUp();
        user = new ChapmanUser();
        testName = "testUser";
        testID = 123;
        testGuests = 3;
        testString = "Chapman User [Name = testUser, Chapman ID = 123, Number of Guests = 3]";
    }

    /**
     *  Tests the setName and getName method
     */
    public void testName()
    {
        user.setName(testName);
        assertEquals(user.getName(), "testUser");
    }

    /**
     * Tests the setID and getID method
     */
    public void testID()
    {
        user.setID(testID);
        assertEquals(user.getID(), 123);
    }

    /**
     * Tests setNumGuests and getNumGuests method
     */
    public void testNumGuests()
    {
        user.setNumGuests(testGuests);
        assertEquals(user.getNumGuests(), 3);
    }

    /**
     * Tests the toString method
     */
    public void testToString()
    {
        assertTrue(user.toString().equals(testString));
    }
}
