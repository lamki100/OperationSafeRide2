package com.chapman.operationsaferide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.support.v4.app.ActivityCompat;
import android.Manifest;


/**
 *
 * Created by Melissa LeBlanc on 5/1/16
 * Class that handles main activity of app.
 * @author Katie Lamkin
 * @version 1.0
 * @see {@link AppCompatActivity}.
 */
public class MainActivity extends AppCompatActivity {

    TextView coordinateView;
    LocationService ls;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        context = this.getApplicationContext();
        //ls = new LocationService(context);
        //coordinateView = (TextView)findViewById(R.id.txt_coor);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},1);
    }

    /**
     * Creates the options on menu.
     * @param menu A variable of type {@link Menu}.
     * @return A boolean variable if successful.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handles the item selected.
     * @param item A variable of type {@link MenuItem}.
     * @return A boolean variable if successful.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Makes a ride request.
     * @return A boolean variable if successful.
     */
    public boolean makeRequest(View view)
    {
        String name = ((EditText) findViewById(R.id.name_text)).getText().toString();
        String id = ((EditText) findViewById(R.id.id_text)).getText().toString();
        String numGuests = ((EditText) findViewById(R.id.guests_text)).getText().toString();
        String location = ((EditText) findViewById(R.id.location_text)).getText().toString();
        String phoneNumber = ((EditText) findViewById(R.id.phone_text)).getText().toString();

        int i_id, i_numGuests = 0;
        try
        {
            i_id = Integer.parseInt(id);
            i_numGuests = Integer.parseInt(numGuests);
        }
        catch (Exception e)
        {
            System.out.println("Error converting to int.");
            return false;
        }
        // Make chapman user
        ChapmanUser student = new ChapmanUser(name, i_id, i_numGuests, "waiting", location, phoneNumber);
        String message = student.toString() + " is requesting a ride.";

        // send request
        sendText("8589648046", message, "Ride request sent!");
        return true;
    }

    public void callHelp(View view)
    {
        // send help message
        sendText("8589648046", "HELP", "Help Sent!!");
    }

    /**
     * Cancels ride request.
     * @return A boolean variable if successful.
     */
    public boolean cancelRequest(View view)
    {
        String name = ((EditText) findViewById(R.id.name_text)).getText().toString();
        String id = ((EditText) findViewById(R.id.id_text)).getText().toString();
        String numGuests = ((EditText) findViewById(R.id.guests_text)).getText().toString();
        String location = ((EditText) findViewById(R.id.location_text)).getText().toString();
        String phoneNumber = ((EditText) findViewById(R.id.phone_text)).getText().toString();

        int i_id, i_numGuests = 0;
        try
        {
            i_id = Integer.parseInt(id);
            i_numGuests = Integer.parseInt(numGuests);
        }
        catch (Exception e)
        {
            System.out.println("Error converting to int.");
            return false;
        }

        // Make chapman user
        ChapmanUser student = new ChapmanUser(name, i_id, i_numGuests, "canceling", location, phoneNumber);
        String message = student.toString() + " is CANCELING their ride.";

        // cancel request
        sendText("8589648046", message, "Ride request canceled!");
        return true;
    }

    public boolean getLocation()
    {
        double latitude = ls.getLatitude();
        double longitude = ls.getLongitude();
        coordinateView.setText(String.valueOf(latitude) + ", " + String.valueOf(longitude));
        //TODO: get call to interact with user class and have user class call location services or whatever
        return true;
    }

    public void openMap(View view)
    {
        Intent mapVisual = new Intent(MainActivity.this, MapActivity.class);
        startActivity(mapVisual);
    }

    public void sendText(String number, String message, String toastMessage)
    {
        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number, null, message, null, null);
            Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS faild, please try again later!", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
