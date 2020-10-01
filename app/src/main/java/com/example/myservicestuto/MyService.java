package com.example.myservicestuto;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service", "stopped service");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
         stopSelf();
            Log.d("Service", "start service");
        return super.onStartCommand(intent, flags, startId);
    }


}
