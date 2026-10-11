package msr.pistream.app.di;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import dagger.hilt.android.HiltAndroidApp;
import i4.s;
import w8.d;
import x7.k;
import z7.c;

@HiltAndroidApp
/* loaded from: classes.dex */
public class PiStreamApp extends k {
    @Override // x7.k, android.app.Application
    public void onCreate() {
        Context applicationContext;
        ConnectivityManager connectivityManager;
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new d(this));
        synchronized (c.class) {
            if (!c.f12107a) {
                try {
                    applicationContext = getApplicationContext();
                    connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                } catch (Exception e10) {
                    Log.e("DLNet", "register", e10);
                }
                if (connectivityManager != null) {
                    c.f12108b = new s(applicationContext, 1);
                    if (Build.VERSION.SDK_INT >= 24) {
                        connectivityManager.registerDefaultNetworkCallback(c.f12108b);
                    } else {
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).addTransportType(0).addTransportType(3).build(), c.f12108b);
                    }
                    c.f12107a = true;
                }
            }
        }
    }
}
