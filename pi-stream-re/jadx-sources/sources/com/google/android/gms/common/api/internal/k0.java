package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zaq;

/* loaded from: classes.dex */
public final class k0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f2439a;

    /* renamed from: b, reason: collision with root package name */
    public final z f2440b;

    public k0(z zVar) {
        this.f2440b = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            z zVar = this.f2440b;
            a0 a0Var = (a0) ((t0) zVar.f2485b).f2467c;
            a0Var.f2374b.set(null);
            zaq zaqVar = a0Var.f2378f.E;
            zaqVar.sendMessage(zaqVar.obtainMessage(3));
            Dialog dialog = (Dialog) zVar.f2484a;
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            synchronized (this) {
                Context context2 = this.f2439a;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f2439a = null;
            }
        }
    }
}
