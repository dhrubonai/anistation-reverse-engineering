package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w0 extends com.google.android.gms.common.api.v implements com.google.android.gms.common.api.t {

    /* renamed from: a, reason: collision with root package name */
    public w0 f2478a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2479b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f2480c;

    public w0(WeakReference weakReference) {
        Looper mainLooper;
        if (weakReference != null) {
            this.f2480c = weakReference;
            com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) weakReference.get();
            if (oVar != null) {
                mainLooper = ((j0) oVar).f2437b.getLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            new u0(this, mainLooper);
            return;
        }
        throw new NullPointerException("GoogleApiClient reference must not be null");
    }

    public final w0 a() {
        w0 w0Var;
        synchronized (this.f2479b) {
            w0Var = new w0(this.f2480c);
            this.f2478a = w0Var;
        }
        return w0Var;
    }

    public final void b(com.google.android.gms.common.api.q qVar) {
        synchronized (this.f2479b) {
        }
    }

    public final void c(Status status) {
        synchronized (this.f2479b) {
            d();
        }
    }

    public final void d() {
        synchronized (this.f2479b) {
        }
    }
}
