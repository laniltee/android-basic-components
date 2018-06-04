package com.example.lanil.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    private static final String RECEIVER_WATCH_TAG = "receiver_watch";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        Log.i(RECEIVER_WATCH_TAG, "onReceive");

    }
}
