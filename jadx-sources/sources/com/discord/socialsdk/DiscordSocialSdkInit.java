package com.discord.socialsdk;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.discord.org.webrtc.ContextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class DiscordSocialSdkInit {
    public static final /* synthetic */ int a = 0;
    private static Activity engineActivity;

    static {
        Log.d("DiscordSocialSdk", "Loading native library");
        System.loadLibrary("discord_partner_sdk");
    }

    public static Context getApplicationContext() {
        return engineActivity.getApplicationContext();
    }

    public static Activity getEngineActivity() {
        return engineActivity;
    }

    private static native void nativeSetContext(Context context);

    public static void setEngineActivity(Activity activity) {
        engineActivity = activity;
        Context applicationContext = activity.getApplicationContext();
        ContextUtils.initialize(applicationContext);
        nativeSetContext(applicationContext);
    }
}
