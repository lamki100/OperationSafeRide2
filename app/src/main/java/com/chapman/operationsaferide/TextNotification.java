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
 * @see {@link NotificationSystem}.
 * Help from http://www.techrepublic.com/blog/software-engineer/how-to-send-a-text-message-from-within-your-android-app/
 *
 * This class implements the NotificationSystem interface. It
 * will use the attributes userNumber and message to create
 * new messages and send them out as notifications in the form
 * of text messages.
 */
public class TextNotification implements NotificationSystem {

    private String userNumber;
    private String message;

    /**
     * Public constructor to create an instance of this object
     *
     * @param  num  a phone number is passed in as a string
     */
    public TextNotification(String num)
    {
        userNumber = num;
    }

    /**
     * This function sets the message of this class which will then
     * be used later on in the sendNotification function
     *
     * @param  newMessage  a String that will be set to the message
     *                     attribute of this class. This message will
     *                     then be sent to the userNumber later in the
     *                     sendNotification function
     * @return      void
     */
    public void addNotification(String newMessage)
    {
        message = newMessage;
    }

    /**
     * This function sends the String message to the userNumber in the
     * form of a text message.
     *
     * @return boolean  if true then the message is sent and if false
     *                  then the message wasn't sent
     *
     */
    public boolean sendNotification(String subject)
    {
        try
        {
            SmsManager.getDefault().sendTextMessage(userNumber, null, message, null, null);
        }
        catch (Exception e)
        {
            Log.e("SendText", e.getMessage(), e);
            return false;
        }
        return true;
    }

    /**
     * This function sets the message of this class to a new value
     * which will then be used later on in the sendNotification function
     *
     * @param  edittedMessage  a String that will be set to the message
     *                     attribute of this class. This message will
     *                     then be sent to the userNumber later in the
     *                     sendNotification function
     * @return      void
     */
    public void editNotification(String edittedMessage)
    {
        message = edittedMessage;
    }

    /**
     * This function returns the String message variable
     *
     * @return      String returns the message variable
     */
    public String getMessage()
    {
        return message;
    }
}


//public class MainActivity extends Activity implements OnClickListener
//{
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        findViewById(R.id.button1).setOnClickListener(this);
//    }
//    @Override
//    public void onClick(View v)
//    {
//        String phoneNumber = ((EditText) findViewById(R.id.editView1)).getText().toString();
//
//        sendNotification();
//    }
//}