package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q0 extends l {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2582d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f2583e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzi f2584f;

    /* renamed from: g, reason: collision with root package name */
    public final h5.a f2585g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2586h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2587i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Executor f2588j;

    public q0(Context context, Looper looper) {
        g4.g gVar = new g4.g(this);
        this.f2583e = context.getApplicationContext();
        this.f2584f = new zzi(looper, gVar);
        if (h5.a.f5006c == null) {
            synchronized (h5.a.f5005b) {
                if (h5.a.f5006c == null) {
                    h5.a.f5006c = new h5.a();
                }
            }
        }
        h5.a aVar = h5.a.f5006c;
        w7.b.s(aVar);
        this.f2585g = aVar;
        this.f2586h = 5000L;
        this.f2587i = 300000L;
        this.f2588j = null;
    }

    @Override // com.google.android.gms.common.internal.l
    public final boolean c(n0 n0Var, j0 j0Var, String str, Executor executor) {
        boolean z9;
        synchronized (this.f2582d) {
            try {
                p0 p0Var = (p0) this.f2582d.get(n0Var);
                if (executor == null) {
                    executor = this.f2588j;
                }
                if (p0Var == null) {
                    p0Var = new p0(this, n0Var);
                    p0Var.f2566a.put(j0Var, j0Var);
                    p0Var.a(str, executor);
                    this.f2582d.put(n0Var, p0Var);
                } else {
                    this.f2584f.removeMessages(0, n0Var);
                    if (!p0Var.f2566a.containsKey(j0Var)) {
                        p0Var.f2566a.put(j0Var, j0Var);
                        int i10 = p0Var.f2567b;
                        if (i10 != 1) {
                            if (i10 == 2) {
                                p0Var.a(str, executor);
                            }
                        } else {
                            j0Var.onServiceConnected(p0Var.f2571f, p0Var.f2569d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(n0Var.toString()));
                    }
                }
                z9 = p0Var.f2568c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }
}
