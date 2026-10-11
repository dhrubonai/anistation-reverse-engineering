package com.discord.socialsdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.a92;
import defpackage.c7;
import defpackage.f32;
import defpackage.q64;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class NativeCalls {
    private static final String TAG = "DiscordSocialSdk";
    private static DiscordAudioManagerInterface audioManager;

    public static boolean authorize(String str, AuthenticationClientCallback authenticationClientCallback) {
        new Handler(Looper.getMainLooper()).post(new f32((Object) str, (Object) authenticationClientCallback, (byte) 18));
        return true;
    }

    public static String getPackageName() {
        Activity engineActivity = DiscordSocialSdkInit.getEngineActivity();
        if (engineActivity == null) {
            return "";
        }
        return engineActivity.getPackageName();
    }

    public static void initializeAudioManager() {
        if (audioManager == null) {
            if (Build.VERSION.SDK_INT >= 31) {
                audioManager = DiscordAudioManager.getInstance(DiscordSocialSdkInit.getEngineActivity());
            } else {
                audioManager = DiscordAudioManagerLegacy.getInstance(DiscordSocialSdkInit.getEngineActivity());
            }
        }
    }

    public static boolean isDiscordAppInstalled() {
        Activity engineActivity = DiscordSocialSdkInit.getEngineActivity();
        String[] strArr = {"com.discord", "com.discord.debug"};
        for (int i = 0; i < 2; i++) {
            try {
                engineActivity.getPackageManager().getPackageInfo(strArr[i], 0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static /* synthetic */ void lambda$authorize$2(String str, AuthenticationClientCallback authenticationClientCallback) {
        AuthenticationActivity.authorize(DiscordSocialSdkInit.getEngineActivity(), str, authenticationClientCallback);
    }

    public static /* synthetic */ void lambda$openUrl$5(String str) {
        DiscordSocialSdkInit.getEngineActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public static /* synthetic */ void lambda$startForegroundService$3() {
        ForegroundService.start(DiscordSocialSdkInit.getEngineActivity());
    }

    public static /* synthetic */ void lambda$stopForegroundService$4() {
        ForegroundService.stop(DiscordSocialSdkInit.getEngineActivity());
    }

    public static void openUrl(String str) {
        new Handler(Looper.getMainLooper()).post(new a92(str, (byte) 10));
    }

    public static void setActiveCall(boolean z) {
        new Handler(Looper.getMainLooper()).post(new q64((byte) 1, z));
    }

    public static void setActiveCallOnMainThread(boolean z) {
        if (audioManager == null) {
            initializeAudioManager();
        }
        audioManager.setActiveCall(z);
    }

    public static void setPreventCommsForBluetooth(boolean z) {
        new Handler(Looper.getMainLooper()).post(new q64((byte) 0, z));
    }

    public static void setPreventCommsForBluetoothOnMainThread(boolean z) {
        if (audioManager == null) {
            initializeAudioManager();
        }
        audioManager.setPreventCommsForBluetooth(z);
    }

    public static void startForegroundService() {
        new Handler(Looper.getMainLooper()).post(new c7((byte) 5));
    }

    public static void stopForegroundService() {
        new Handler(Looper.getMainLooper()).post(new c7((byte) 4));
    }
}
