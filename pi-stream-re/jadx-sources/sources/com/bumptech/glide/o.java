package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import f9.x;
import i4.v;
import i4.w;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class o implements ComponentCallbacks2, i4.j {
    public static final l4.f B;
    public l4.f A;

    /* renamed from: a, reason: collision with root package name */
    public final b f2277a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2278b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.h f2279c;

    /* renamed from: d, reason: collision with root package name */
    public final v f2280d;

    /* renamed from: e, reason: collision with root package name */
    public final i4.o f2281e;

    /* renamed from: f, reason: collision with root package name */
    public final w f2282f;

    /* renamed from: x, reason: collision with root package name */
    public final g.f f2283x;

    /* renamed from: y, reason: collision with root package name */
    public final i4.b f2284y;

    /* renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArrayList f2285z;

    static {
        l4.f fVar = (l4.f) new l4.f().c(Bitmap.class);
        fVar.K = true;
        B = fVar;
        ((l4.f) new l4.f().c(g4.c.class)).K = true;
    }

    public o(b bVar, i4.h hVar, i4.o oVar, Context context) {
        boolean z9;
        i4.b mVar;
        String str;
        v vVar = new v(5, 0);
        x xVar = bVar.f2175f;
        this.f2282f = new w();
        g.f fVar = new g.f(this, 7);
        this.f2283x = fVar;
        this.f2277a = bVar;
        this.f2279c = hVar;
        this.f2281e = oVar;
        this.f2280d = vVar;
        this.f2278b = context;
        Context applicationContext = context.getApplicationContext();
        n nVar = new n(this, vVar);
        xVar.getClass();
        if (x.j.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z9) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z9) {
            mVar = new i4.c(applicationContext, nVar);
        } else {
            mVar = new i4.m();
        }
        this.f2284y = mVar;
        synchronized (bVar.f2176x) {
            if (!bVar.f2176x.contains(this)) {
                bVar.f2176x.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        char[] cArr = p4.m.f8575a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            p4.m.e().post(fVar);
        } else {
            hVar.c(this);
        }
        hVar.c(mVar);
        this.f2285z = new CopyOnWriteArrayList(bVar.f2172c.f2219e);
        q(bVar.f2172c.a());
    }

    @Override // i4.j
    public final synchronized void c() {
        this.f2282f.c();
        o();
    }

    @Override // i4.j
    public final synchronized void j() {
        p();
        this.f2282f.j();
    }

    @Override // i4.j
    public final synchronized void k() {
        this.f2282f.k();
        m();
        v vVar = this.f2280d;
        Iterator it = p4.m.d((Set) vVar.f5382d).iterator();
        while (it.hasNext()) {
            vVar.b((l4.c) it.next());
        }
        ((Set) vVar.f5381c).clear();
        this.f2279c.e(this);
        this.f2279c.e(this.f2284y);
        p4.m.e().removeCallbacks(this.f2283x);
        this.f2277a.c(this);
    }

    public final void l(m4.i iVar) {
        boolean z9;
        if (iVar == null) {
            return;
        }
        boolean r8 = r(iVar);
        l4.c f10 = iVar.f();
        if (!r8) {
            b bVar = this.f2277a;
            synchronized (bVar.f2176x) {
                Iterator it = bVar.f2176x.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((o) it.next()).r(iVar)) {
                            z9 = true;
                            break;
                        }
                    } else {
                        z9 = false;
                        break;
                    }
                }
            }
            if (!z9 && f10 != null) {
                iVar.a(null);
                f10.clear();
            }
        }
    }

    public final synchronized void m() {
        Iterator it = p4.m.d(this.f2282f.f5383a).iterator();
        while (it.hasNext()) {
            l((m4.i) it.next());
        }
        this.f2282f.f5383a.clear();
    }

    public final l n(String str) {
        return new l(this.f2277a, this, Drawable.class, this.f2278b).A(str);
    }

    public final synchronized void o() {
        v vVar = this.f2280d;
        vVar.f5380b = true;
        Iterator it = p4.m.d((Set) vVar.f5382d).iterator();
        while (it.hasNext()) {
            l4.c cVar = (l4.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                ((Set) vVar.f5381c).add(cVar);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }

    public final synchronized void p() {
        this.f2280d.h();
    }

    public final synchronized void q(l4.f fVar) {
        l4.f fVar2 = (l4.f) fVar.clone();
        if (fVar2.K && !fVar2.M) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        fVar2.M = true;
        fVar2.K = true;
        this.A = fVar2;
    }

    public final synchronized boolean r(m4.i iVar) {
        l4.c f10 = iVar.f();
        if (f10 == null) {
            return true;
        }
        if (this.f2280d.b(f10)) {
            this.f2282f.f5383a.remove(iVar);
            iVar.a(null);
            return true;
        }
        return false;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2280d + ", treeNode=" + this.f2281e + "}";
    }
}
