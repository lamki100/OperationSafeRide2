package com.chapman.operationsaferide;

/**
 * @author      Amit Ben-David <benda106@mail.chapman.edu>
 * @version     1.0                 (current version number of program)
 * @since       2016-05-01          (the version of the package this class was first added to)
 *
 * Class representing any employee of Operation Safe Ride from Chapman University
 */
public class PublicSafetyUser extends User {

    /**
     * The Public Safety User's name.
     */
    private String name;

    /**
     * The Public Safety User's ID number.
     */
    private int empID;

    /**
     * TThe Public Safety User's state.
     */
    private String state;

    /**
     * The Public Safety User's type.
     */
    private String type;


    /**
     * Public constructor to create an instance of this class
     * 
     */
    public PublicSafetyUser()
    {
        super("state1", "PublicSafety", "");
    }

    /**
     * Overloaded constructor 
	 * @param n A String representing user name
	 * @param id An int representing user chapmanID
	 * @param s A string representing state
     *
     */
    public PublicSafetyUser(String n, int id, String s)
    {
        super(s, "PublicSafety", n);
        empID = id;
    }


    /**
     * Sets the Public Safety User's ID number
     * @param  id number from which the Public Safety User's ID
     */
    public void setID(int id)
    {
        this.empID = id;
    }

    /**
     * Gets the Public Safety User's ID number
     * @return  the Public Safety User's ID number
     */
    public int getID()
    {
        return this.empID;
    }

    /**
     * Sets the Public Safety User's Name
     * @param  userName string to set Public Safety User's name
     */
    public void setName(String userName)
    {
        this.name = userName;
    }

    /**
     * Gets the Public Safety User's name
     * @return  the Public Safety User's name
     */
    public String getName()
    {
        return this.name;
    }


    /**
     * Gets the Public Safety User's state
     * @return  the Public Safety User's state
     */
    public String getUserState()
    {
        return state;
    }

    /**
     * Sets the Public Safety User's state
     * @param  s string to set the User's state
     */
    public void setUserState(String s)
    {
        state = s;
    }

    /**
     * Gets the Public Safety User's type
     * @return  the Public Safety User's type
     */
    public String getUserType()
    {
        return type;
    }

    /**
     * Sets the Public Safety User's type
     * @param  t string to set the Public Safety User's type
     */
    public void setUserType(String t)
    {
        type = t;
    }


}
