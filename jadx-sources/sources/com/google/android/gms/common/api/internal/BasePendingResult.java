package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import defpackage.a34;
import defpackage.a55;
import defpackage.b55;
import defpackage.h15;
import defpackage.ov3;
import defpackage.u30;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends a55> {
    public static final /* synthetic */ int k = 0;
    public b55 e;
    public a55 g;
    public volatile boolean h;
    public boolean i;
    public boolean j;
    public final Object a = new Object();
    public final CountDownLatch c = new CountDownLatch(1);
    public final ArrayList d = new ArrayList();
    public final AtomicReference f = new AtomicReference();
    public final u30 b = new h15(Looper.getMainLooper(), (byte) 1);

    /* JADX WARN: Type inference failed for: r1v1, types: [u30, h15] */
    public BasePendingResult() {
        new WeakReference(null);
    }

    public final void a() {
        synchronized (this.a) {
            try {
                if (!this.i && !this.h) {
                    this.i = true;
                    h(b(Status.D));
                }
            } finally {
            }
        }
    }

    public abstract a55 b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.c.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void e(a55 a55Var) {
        synchronized (this.a) {
            try {
                if (!this.j && !this.i) {
                    d();
                    a34.A("Results have already been set", !d());
                    a34.A("Result has already been consumed", !this.h);
                    h(a55Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(b55 b55Var) {
        boolean z;
        synchronized (this.a) {
            try {
                if (b55Var == null) {
                    this.e = null;
                    return;
                }
                a34.A("Result has already been consumed.", !this.h);
                synchronized (this.a) {
                    z = this.i;
                }
                if (z) {
                    return;
                }
                if (d()) {
                    u30 u30Var = this.b;
                    u30Var.sendMessage(u30Var.obtainMessage(1, new Pair(b55Var, g())));
                } else {
                    this.e = b55Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a55 g() {
        a55 a55Var;
        synchronized (this.a) {
            a34.A("Result has already been consumed.", !this.h);
            a34.A("Result is not ready.", d());
            a55Var = this.g;
            this.g = null;
            this.e = null;
            this.h = true;
        }
        if (this.f.getAndSet(null) == null) {
            a34.x(a55Var);
            return a55Var;
        }
        ov3.d();
        return null;
    }

    public final void h(a55 a55Var) {
        this.g = a55Var;
        a55Var.getClass();
        this.c.countDown();
        if (this.i) {
            this.e = null;
        } else {
            b55 b55Var = this.e;
            if (b55Var != null) {
                u30 u30Var = this.b;
                u30Var.removeMessages(2);
                u30Var.sendMessage(u30Var.obtainMessage(1, new Pair(b55Var, g())));
            }
        }
        ArrayList arrayList = this.d;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            ov3.d();
        }
    }
}
