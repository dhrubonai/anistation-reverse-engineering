package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x.j;

/* loaded from: classes.dex */
public final class zzc extends j {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10;
        Intent registerReceiver;
        if (zza.zza()) {
            if (zza.zza()) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i10);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
