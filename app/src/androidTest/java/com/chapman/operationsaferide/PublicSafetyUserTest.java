package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * @author      Amit Ben-David <benda106@mail.chapman.edu>
 * @version     1.0                 (current version number of program)
 * @since       2016-04-9          (the version of the package this class was first added to)
 *
 * Class testing PublicSafetyUser
 */

public class PublicSafetyUserTest extends TestCase {

    /**
     * The test user's name.
     */
    private String testName;

    /**
     * The test user's test ID number.
     */
    private int testID;

    /**
     * The test user.
     */
    private PublicSafetyUser user;


    /**
     * Sets up a user to be tested
     */
    protected void setUp() throws Exception
    {
        super.setUp();
        user = new PublicSafetyUser();
        testName = "Officer1";
        testID = 321;
    }

    /**
     * Tests the setName and getName method
     */
    public void testName()
    {
        user.setName(testName);
        assertEquals(user.getName(), "Officer1");
    }

    /**
     * Tests the setID and getID method
     */
    public void testID()
    {
        user.setID(testID);
        assertEquals(user.getID(), 321);
    }

}