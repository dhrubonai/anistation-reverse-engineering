package com.google.android.gms.common.internal;

import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2551a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static q0 f2552b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f2553c;

    public static HandlerThread a() {
        synchronized (f2551a) {
            HandlerThread handlerThread = f2553c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f2553c = handlerThread2;
            handlerThread2.start();
            return f2553c;
        }
    }

    public final void b(String str, String str2, j0 j0Var, boolean z9) {
        n0 n0Var = new n0(str, str2, z9);
        q0 q0Var = (q0) this;
        synchronized (q0Var.f2582d) {
            p0 p0Var = (p0) q0Var.f2582d.get(n0Var);
            if (p0Var != null) {
                if (p0Var.f2566a.containsKey(j0Var)) {
                    p0Var.f2566a.remove(j0Var);
                    if (p0Var.f2566a.isEmpty()) {
                        q0Var.f2584f.sendMessageDelayed(q0Var.f2584f.obtainMessage(0, n0Var), q0Var.f2586h);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(n0Var.toString()));
                }
            } else {
                throw new IllegalStateException("Nonexistent connection status for service config: ".concat(n0Var.toString()));
            }
        }
    }

    public abstract boolean c(n0 n0Var, j0 j0Var, String str, Executor executor);
}
