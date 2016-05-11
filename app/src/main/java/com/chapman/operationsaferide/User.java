package com.chapman.operationsaferide;

/**
 * Created by klamkin on 4/10/16.
 * Edited by Melissa LeBlanc on 4/12/16.
 * @author Katie Lamkin & Melissa LeBlanc
 * Class that is in herited by PublicSafetyUser and ChapmanUser.
 */
public class User {

    private String state;
    private String type;
    private String name;
    
    /**
     * Public constructor to create an instance of this class
     * @param s A variable of type String.
     * @param t A variable of type String.
     * @param n A variable of type String.
     * 
     */
    public User(String s, String t, String n)
    {
        state = s;
        type = t;
        name = n;
    }

    /**
	* Gets user type
	* @return A variable of type String.
	*/
    public String getType()
    {
        return type;
    }

    /**
	* Gets user state
	* @return A variable of type String.
	*/
    public String getState()
    {
        return state;
    }
}
