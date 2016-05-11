package com.chapman.operationsaferide;

import android.location.*;
import android.content.*;
import android.os.*;

/**
 * @author Daniel Osterman
 * @version 1
 * Works with built-in GPS Location service
 */

public class LocationService {
    LocationListener gpsListener;
    Location here;
    LocationManager lm;
    Context context;

    /**
     * Handles context on creation of class.
     * @param context A variable of type {@link android.content.Context}.
     */
    public LocationService(Context context){
        this.context = context;
        lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        gpsListener = new LocationListener() {
            /**
             * Sets location.
             * @param location A variable of type {@link android.location.Location}.
             */
            @Override
            public void onLocationChanged(Location location) {
                here = location;
            }

            /**
             * Handles change of status.
             * @param provider A variable of type String.
             * @param status A variable of type int.
             * @param extras A variable of type {@link android.os.Bundle}.
             */
            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            /**
             * Enable location
             * @param provider A variable of type String.
             */
            @Override
            public void onProviderEnabled(String provider) {
            }

            /**
             * Disable location
             * @param provider A variable of type String.
             */
            @Override
            public void onProviderDisabled(String provider) {
            }
        };
        try {

            lm.requestLocationUpdates(lm.GPS_PROVIDER, 0, 0, gpsListener);
        }catch(SecurityException e) {
            System.out.println("Error: Location Permission Unavailable");
        }
    }

    /**
     * Gets current Location
     * @return A variable of type {@link android.location.Location}.
     */
    public Location getLocation(){
        try {
            here = lm.getLastKnownLocation(lm.GPS_PROVIDER);
        }catch(SecurityException e) {
            System.out.println("Error: Can't obtain Location");
        }catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }

        return here;
    }


    public double getLatitude(){
        return this.getLocation().getLatitude();
    }
    public double getLongitude(){
        return this.getLocation().getLongitude();
    }

}
