package com.example.lanil.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String SERVICE_LOG_ID = "service_watch";

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(SERVICE_LOG_ID, "onBind");
        // TODO: Return the communication channel to the service.
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(SERVICE_LOG_ID, "onStartCommand");
        return Service.START_NOT_STICKY;
    }


}
