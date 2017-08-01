package com.example.snc.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by SNC on 11-07-2017.
 */

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("android.intent.action.AIRPLANE_MODE"))
        {
            Toast.makeText(context, "Airplane mode is changed", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals("android.intent.action.WALLPAPER_CHANGED"))
        {
            Toast.makeText(context, "Wallpaper is changed ", Toast.LENGTH_SHORT).show();
        }
        else if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED"))
        {
            Toast.makeText(context, "AC Power Plugged-In", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
        {
            Toast.makeText(context, "AC Power Plugged-Out", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            Toast.makeText(context, "Time Zone Changed Successfully", Toast.LENGTH_SHORT).show();
        }
    }
}