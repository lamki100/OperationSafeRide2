package com.chapman.operationsaferide;
 
 /**
 * Created by Melissa LeBlanc on 4/5/16.
 * @author Melissa LeBlanc
 * @version 1.0
 * @see {@link User}.
 * This class inherits from the User class, which contains one 
 * string attribute called name. It contains the attributes: 
 * chapmanID, numGuests, state, type,pickupLocation, and dropoffLocation. It represents the user 
 * side of the OperationSafeRide app and has various associated
 * functions including sending a ride request (as an email) to Public Safety.
 * 
 */
 
 
public class ChapmanUser extends User
{
	private String name;
	private int chapmanID;
	private int numGuests;
	private String location;
	private String state;
	private String type;
	private String phoneNumber;

	//private LocationService pickupLocation;
	//private Map dropoffLocation;

	//*********************************************** Constructor ***************************************************
	
	/**
     * Public constructor to create an instance of this class
     * 
     */
	public ChapmanUser()
	{
        super("state1", "ChapmanStudent", "Unknown");
		chapmanID = 0;
		numGuests = 0;
        location = "";
		phoneNumber = "";
		//pickup Location = new LocationService();
		//dropoffLocation = new Map();
	}
	
	
    /**
     * Overloaded constructor 
	 * @param n A String representing user name
	 * @param id An int representing user chapmanID
	 * @param numG An int representing number of guests
	 * @param s A string representing state
     *
     */
    public ChapmanUser(String n, int id, int numG, String s, String l, String p)
    {
        super(s, "ChapmanStudent", n);

        chapmanID = id;
        numGuests = numG;
        location = l;
		phoneNumber = p;
        //pickup Location = new LocationService();
        //dropoffLocation = new Map();
    }

	//****************************************** Getters and Setters *************************************************

	/**
	* Sets chapmanID
	* @param id A variable of type int.
	* @return void
	*/
	public void setID(int id)
	{
		this.chapmanID = id;
	}

	/**
	* Gets chapmanID
	* @return A variable of type int.
	*/
	public int getID()
	{
		return this.chapmanID;
	}

	/**
	* Sets user Name
	* @param userName A variable of type String.
	* @return void
	*/
	public void setName(String userName)
	{
		this.name = userName;
	}

	/**
	* Gets user Name
	* @return A variable of type String
	*/
	public String getName()
	{
		return this.name;
	}

	/**
	* Sets number of guests
	* @param guests A variable of type int.
	* @return void
	*/
	public void setNumGuests(int guests)
	{
		this.numGuests = guests;
	}

	/**
	* Gets number of guests
	* @return A variable of type int.
	*/
	public int getNumGuests()
	{
		return this.numGuests;
	}

   /**
	* Gets user state
	* @return A variable of type String.
	*/
    public String getUserState()
    {
        return state;
    }

	/**
	* Sets user state
	* @param s A variable of type String.
	* @return void
	*/
    public void setUserState(String s)
    {
        state = s;
    }

	/**
	* Gets location of user
	* @return A variable of type String.
	*/
    public String getLocation()
    {
        return location;
    }
	
	/**
	* Sets location of user
	* @param l A variable of type String.
	* @return void
	*/
    public void setLocation(String l)
    {
        location = l;
    }

	/**
	 * Gets phone number
	 * @return A variable of type String.
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * Sets phone number
	 * @param p A variable of type String.
	 * @return void
	 */
	public void setPhoneNumber(String p)
	{
		phoneNumber = p;
	}




	//*********************************************** Override toString ************************************************
	
	/**
	* Override toString
	* @return A variable of type String.
	*/
	public String toString()
	{
		//Overriding toString method
		return "Chapman User [Name = " + getName() + ", Chapman ID = " + getID() + ", "
			+ "Number of Guests = " + getNumGuests() + ", at Location: " + location
			+ ", with Phone Number: " + phoneNumber + "]";
	}


	//*********************************************** Other Functions *************************************************
	/**
	* Function that sends email to PSafe notifying them of ride request with associated 
	* location of requester as well as Chapman ID and name of user and the total 
	* number of guests. Returns whether it was successful or not.
	* @param pickupLocation
	* @param dropoffLocation
	* @param numGuests
	* @param name
	* @param id
	* 
	* @return boolean
	*/

	/*
	//TODO
	public boolean requestRide(Map pickupLocation, Map dropoffLocation, int numGuests, String name, int id)
	{

	}
	*/
	
	/**
	 * After requesting ride, sends info to public safety via email notification
	 * @return boolean
	 */
	/*
	private boolean sendInfo()
	{
		String timeStamp = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy").format(new Date());
		String info = "New ride request from " + getName() + ". Chapman ID #: " + getID()
				+ ". Number of guests: " + getNumGuests() + ".\nPickup Location: "
			+ getPickupLocation() + "\nDropoff Location: " +	"."	+ getDropoffLocation() + "."
			+ "\n" + timeStamp;
		notify.addNotification(info);
		return (notify.sendNotification());
	}
	*/
}
