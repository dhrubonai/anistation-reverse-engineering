package c1;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1713b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f1714c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1715d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f1716e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f1717f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f1718g;

    public i0() {
        this.f1712a = 64;
        this.f1713b = 5;
        this.f1716e = new ArrayDeque();
        this.f1717f = new ArrayDeque();
        this.f1718g = new ArrayDeque();
    }

    public static h0 a(i0 i0Var) {
        return new h0(i0Var);
    }

    public final synchronized void b() {
        try {
            if (((ExecutorService) this.f1715d) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = z8.b.f12139g + " Dispatcher";
                r6.h0.u(str, "name");
                this.f1715d = new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new z8.a(str, false));
            }
            r6.h0.q((ExecutorService) this.f1715d);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(c9.i iVar) {
        Runnable runnable;
        r6.h0.u(iVar, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f1718g;
        synchronized (this) {
            if (arrayDeque.remove(iVar)) {
                runnable = (Runnable) this.f1714c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!d() && runnable != null) {
            runnable.run();
        }
    }

    public final boolean d() {
        boolean z9;
        byte[] bArr = z8.b.f12133a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = ((ArrayDeque) this.f1716e).iterator();
            r6.h0.s(it, "readyAsyncCalls.iterator()");
            if (it.hasNext()) {
                a3.g.z(it.next());
                if (((ArrayDeque) this.f1717f).size() < this.f1712a) {
                    throw null;
                }
            }
            if (e() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        if (arrayList.size() <= 0) {
            return z9;
        }
        a3.g.z(arrayList.get(0));
        b();
        throw null;
    }

    public final synchronized int e() {
        return ((ArrayDeque) this.f1717f).size() + ((ArrayDeque) this.f1718g).size();
    }

    public i0(Uri uri) {
        this.f1714c = uri;
    }

    public i0(j0 j0Var) {
        this.f1714c = j0Var.f1728a;
        this.f1715d = j0Var.f1729b;
        this.f1716e = j0Var.f1730c;
        this.f1712a = j0Var.f1731d;
        this.f1713b = j0Var.f1732e;
        this.f1717f = j0Var.f1733f;
        this.f1718g = j0Var.f1734g;
    }
}
