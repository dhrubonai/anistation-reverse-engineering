package x3;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class i0 implements h, g {

    /* renamed from: a, reason: collision with root package name */
    public final i f11209a;

    /* renamed from: b, reason: collision with root package name */
    public final g f11210b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f11211c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e f11212d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f11213e;

    /* renamed from: f, reason: collision with root package name */
    public volatile b4.w f11214f;

    /* renamed from: x, reason: collision with root package name */
    public volatile f f11215x;

    public i0(i iVar, g gVar) {
        this.f11209a = iVar;
        this.f11210b = gVar;
    }

    @Override // x3.g
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // x3.g
    public final void b(v3.i iVar, Object obj, com.bumptech.glide.load.data.e eVar, v3.a aVar, v3.i iVar2) {
        this.f11210b.b(iVar, obj, eVar, this.f11214f.f1503c.d(), iVar);
    }

    @Override // x3.h
    public final boolean c() {
        boolean z9;
        boolean z10;
        if (this.f11213e != null) {
            Object obj = this.f11213e;
            this.f11213e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f11212d != null && this.f11212d.c()) {
            return true;
        }
        this.f11212d = null;
        this.f11214f = null;
        boolean z11 = false;
        while (!z11) {
            if (this.f11211c < this.f11209a.b().size()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                break;
            }
            ArrayList b10 = this.f11209a.b();
            int i10 = this.f11211c;
            this.f11211c = i10 + 1;
            this.f11214f = (b4.w) b10.get(i10);
            if (this.f11214f != null) {
                if (!this.f11209a.f11206p.a(this.f11214f.f1503c.d())) {
                    if (this.f11209a.c(this.f11214f.f1503c.a()) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                    }
                }
                this.f11214f.f1503c.e(this.f11209a.o, new androidx.appcompat.widget.a0(this, this.f11214f, 26));
                z11 = true;
            }
        }
        return z11;
    }

    @Override // x3.h
    public final void cancel() {
        b4.w wVar = this.f11214f;
        if (wVar != null) {
            wVar.f1503c.cancel();
        }
    }

    @Override // x3.g
    public final void d(v3.i iVar, Exception exc, com.bumptech.glide.load.data.e eVar, v3.a aVar) {
        this.f11210b.d(iVar, exc, eVar, this.f11214f.f1503c.d());
    }

    public final boolean e(Object obj) {
        int i10 = p4.g.f8564b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z9 = false;
        try {
            com.bumptech.glide.load.data.g h10 = this.f11209a.f11194c.b().h(obj);
            Object a10 = h10.a();
            v3.c e10 = this.f11209a.e(a10);
            k kVar = new k(e10, a10, this.f11209a.f11200i);
            v3.i iVar = this.f11214f.f1501a;
            i iVar2 = this.f11209a;
            f fVar = new f(iVar, iVar2.f11205n);
            z3.a a11 = iVar2.f11199h.a();
            a11.h(fVar, kVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar + ", data: " + obj + ", encoder: " + e10 + ", duration: " + p4.g.a(elapsedRealtimeNanos));
            }
            if (a11.n(fVar) != null) {
                this.f11215x = fVar;
                this.f11212d = new e(Collections.singletonList(this.f11214f.f1501a), this.f11209a, this);
                this.f11214f.f1503c.c();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f11215x + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f11210b.b(this.f11214f.f1501a, h10.a(), this.f11214f.f1503c, this.f11214f.f1503c.d(), this.f11214f.f1501a);
                return false;
            } catch (Throwable th) {
                th = th;
                z9 = true;
                if (!z9) {
                    this.f11214f.f1503c.c();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
