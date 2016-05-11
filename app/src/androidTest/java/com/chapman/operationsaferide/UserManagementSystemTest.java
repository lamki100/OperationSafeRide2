package com.chapman.operationsaferide;

import junit.framework.TestCase;

/**
 * Created by klamkin on 4/10/16.
 */
public class UserManagementSystemTest extends TestCase {

    private ChapmanUser studentUser;
    private PublicSafetyUser publicSafetyUser;
    private UserManagementSystem userSys;

    protected void setUp()
    {
        // create users
        studentUser = new ChapmanUser();
        publicSafetyUser = new PublicSafetyUser();

        // create management system
        userSys = new UserManagementSystem();
    }

    public void testAddUser() throws Exception
    {
        userSys.addUser(studentUser);
        assertTrue((userSys.getStudentUserCount() == 1) && (userSys.getpSafeUserCount() == 0));
    }

    public void testUpdateUser() throws Exception
    {
        userSys.updateUser(studentUser, publicSafetyUser);
        assertTrue((userSys.getStudentUserCount() == 0) && (userSys.getpSafeUserCount() == 1));
    }

    public void testDeleteUser() throws Exception
    {
        userSys.deleteUser(publicSafetyUser);
        assertTrue((userSys.getStudentUserCount() == 0) && (userSys.getpSafeUserCount() == 0));
    }

}
