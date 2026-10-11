package com.unity3d.coherence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final /* synthetic */ Coherence a;

    public a(Coherence coherence) {
        this.a = coherence;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.batteryIntent = intent;
    }
}
