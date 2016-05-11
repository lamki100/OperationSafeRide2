package com.chapman.operationsaferide;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;

/**
 * Created by klamkin on 4/4/16.
 * @author klamkin
 * @see {@link EmergencySystem}.
 */

/**
 * This class implements methods that intake a user phone number,
 * and a message that will be sent to the public safety office.
 * It also contains messages to send the message, and contains
 * error handling if something goes wrong.
 */
public class EmergencyPanic implements EmergencySystem{

    private String userNumber;
    private String message;

    /**
     * Constructor.
     * @param num A variable of type String.
     */
    public EmergencyPanic(String num)
    {
        /* num must be psafe number */
        userNumber = num;
        message = "";
    }

    /**
     * Adds Emergency Notification.
     * @param newMessage A variable of type String.
     */
    public void addEmergencyNotification(String newMessage)
    {
        message = "Emergency button activated. Send Public Safety officer to: "; //this part needs added location of the user when button pushed.
        message += newMessage;
    }

    /**
     * Sends emergency request.
     * @return A boolean variable if successful.
     */
    public boolean sendEmergency()
    {
        try
        {
            SmsManager.getDefault().sendTextMessage(userNumber, null, message, null, null);
        }
        catch (Exception e)
        {
            Log.e("EmergencyPanic", e.getMessage(), e);
            return false;
        }
        return true;
    }

    /**
     * Gets message.
     * @return A variable of type String.
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Clears message.
     */
    public void clearMessage()
    {
        message = "";
    }

}
