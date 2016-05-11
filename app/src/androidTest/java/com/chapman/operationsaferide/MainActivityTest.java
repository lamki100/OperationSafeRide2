package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * @author Melissa LeBlanc
 * @see {@link TestCase}
 *
 */
public class MainActivityTest extends TestCase {

    MainActivity maTest;
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        maTest = new MainActivity();
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test method for {@link MainActivity#makeRequest()}.
     */
    public void testMakeRequest() {
       assertTrue(maTest.makeRequest());
    }

    /**
     * Test method for {@link MainActivity#cancelRequest()}.
     */
    public void testCancelRequest() {
        assertTrue(maTest.cancelRequest());
    }

}
