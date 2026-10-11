package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2566a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f2567b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2568c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f2569d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f2570e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f2571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0 f2572g;

    public p0(q0 q0Var, n0 n0Var) {
        this.f2572g = q0Var;
        this.f2570e = n0Var;
    }

    public final void a(String str, Executor executor) {
        boolean z9;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f2567b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            q0 q0Var = this.f2572g;
            h5.a aVar = q0Var.f2585g;
            Context context = q0Var.f2583e;
            boolean b10 = aVar.b(context, str, this.f2570e.a(context), this, executor);
            this.f2568c = b10;
            if (b10) {
                this.f2572g.f2584f.sendMessageDelayed(this.f2572g.f2584f.obtainMessage(1, this.f2570e), this.f2572g.f2587i);
            } else {
                this.f2567b = 2;
                try {
                    q0 q0Var2 = this.f2572g;
                    q0Var2.f2585g.a(q0Var2.f2583e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2572g.f2582d) {
            this.f2572g.f2584f.removeMessages(1, this.f2570e);
            this.f2569d = iBinder;
            this.f2571f = componentName;
            Iterator it = this.f2566a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f2567b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2572g.f2582d) {
            this.f2572g.f2584f.removeMessages(1, this.f2570e);
            this.f2569d = null;
            this.f2571f = componentName;
            Iterator it = this.f2566a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f2567b = 2;
        }
    }
}
