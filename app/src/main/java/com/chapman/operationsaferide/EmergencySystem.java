package com.chapman.operationsaferide;

/**
 * Created by MadisonPahl on 4/9/16.
 * @author MadisonPahl.
 */
public interface EmergencySystem {

    public void addEmergencyNotification(String newMessage);

    public boolean sendEmergency();

    public String getMessage();
}
