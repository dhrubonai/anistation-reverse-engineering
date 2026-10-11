package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class j0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f2547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2548b;

    public j0(f fVar, int i10) {
        this.f2548b = fVar;
        this.f2547a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o f0Var;
        f fVar = this.f2548b;
        if (iBinder == null) {
            f.zzk(fVar, 16);
            return;
        }
        synchronized (f.zzd(fVar)) {
            f fVar2 = this.f2548b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof o)) {
                f0Var = (o) queryLocalInterface;
            } else {
                f0Var = new f0(iBinder);
            }
            f.zzh(fVar2, f0Var);
        }
        this.f2548b.zzl(0, null, this.f2547a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (f.zzd(this.f2548b)) {
            f.zzh(this.f2548b, null);
        }
        Handler handler = this.f2548b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f2547a, 1));
    }
}
