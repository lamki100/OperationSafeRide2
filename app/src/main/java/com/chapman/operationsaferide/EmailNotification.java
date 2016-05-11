package com.chapman.operationsaferide;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by klamkin on 4/4/16.
 * @author klamkin
 * Help from http://stackoverflow.com/questions/2020088/sending-email-in-android-using-javamail-api-without-using-the-default-built-in-a
 *
 * This class implements the NotificationSystem interface. It
 * will use the attributes userEmail and message to create
 * new messages and send them out as notifications in the form
 * of emails.
 */
public class EmailNotification extends Activity implements NotificationSystem {

    private String userEmail;
    private String message;

    /**
     * Public constructor to create an instance of this object
     *
     * @param  email  an email address is passed in as a string
     */
    public EmailNotification(String email)
    {
        userEmail = email;
    }

    /**
     * This function sets the message of this class which will then
     * be used later on in the sendNotification function
     *
     * @param  newMessage  a String that will be set to the message
     *                     attribute of this class. This message will
     *                     then be sent to the userEmail later in the
     *                     sendNotification function
     * @return      void
     */
    public void addNotification(String newMessage)
    {
        message = newMessage;
    }

    /**
     * This function sends the String message to the userEmail in the
     * form of an email from operationsaferidechap@gmail.com.
     *
     * @return boolean  if true then the message is sent and if false
     *                  then the message wasn't sent
     *
     */
    public boolean sendNotification(String subject)
    {
        try
        {
            GMailSender sender = new GMailSender("operationsaferidechap@gmail.com", "chapmanpsafe");
            sender.sendMail(subject,
                    message,
                    "operationsaferidechap@gmail.com",
                    userEmail);
        }
        catch(Exception e)
        {
            Log.e("SendMail", e.getMessage(), e);
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

/** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//
//        final Button send = (Button) this.findViewById(R.id.send);
//        send.setOnClickListener(new View.OnClickListener()
//        {
//            public void onClick(View v)
//            {
//                // TODO Auto-generated method stub
//                sendNotification();
//            }
//        });
//    }
