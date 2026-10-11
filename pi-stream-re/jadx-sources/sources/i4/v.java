package i4;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import androidx.lifecycle.d0;
import c1.q0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import f.p0;
import f1.b0;
import j1.z;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v implements d0, s1.j, h0.u {

    /* renamed from: e, reason: collision with root package name */
    public static volatile v f5378e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5379a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5380b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5381c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5382d;

    public v(Context context, Handler handler, z zVar) {
        this.f5379a = 2;
        this.f5381c = context.getApplicationContext();
        this.f5382d = new j1.a(this, handler, zVar);
    }

    public static v d(Context context) {
        if (f5378e == null) {
            synchronized (v.class) {
                if (f5378e == null) {
                    f5378e = new v(context.getApplicationContext());
                }
            }
        }
        return f5378e;
    }

    @Override // h0.u
    public final boolean a(View view) {
        a3.g.z(this.f5381c);
        throw null;
    }

    public final boolean b(l4.c cVar) {
        boolean z9 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.f5382d).remove(cVar);
        if (!((Set) this.f5381c).remove(cVar) && !remove) {
            z9 = false;
        }
        if (z9) {
            cVar.clear();
        }
        return z9;
    }

    @Override // s1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final s1.c e(s1.i iVar) {
        MediaCodec mediaCodec;
        int i10;
        s1.l eVar;
        s1.c cVar;
        boolean n9;
        String str = iVar.f9795a.f9801a;
        s1.c cVar2 = null;
        try {
            com.bumptech.glide.d.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                i10 = 0;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
        try {
            if (this.f5380b) {
                c1.v vVar = iVar.f9797c;
                if (b0.f3799a < 34) {
                    n9 = false;
                } else {
                    n9 = q0.n(vVar.f1935m);
                }
                if (n9) {
                    eVar = new p0(mediaCodec, 24);
                    i10 = 4;
                    cVar = new s1.c(mediaCodec, (HandlerThread) ((q6.m) this.f5381c).get(), eVar);
                    com.bumptech.glide.d.s();
                    s1.c.p(cVar, iVar.f9796b, iVar.f9798d, iVar.f9799e, i10);
                    return cVar;
                }
            }
            com.bumptech.glide.d.s();
            s1.c.p(cVar, iVar.f9796b, iVar.f9798d, iVar.f9799e, i10);
            return cVar;
        } catch (Exception e12) {
            e = e12;
            cVar2 = cVar;
            if (cVar2 == null) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
            } else {
                cVar2.a();
            }
            throw e;
        }
        eVar = new s1.e(mediaCodec, (HandlerThread) ((q6.m) this.f5382d).get());
        cVar = new s1.c(mediaCodec, (HandlerThread) ((q6.m) this.f5381c).get(), eVar);
    }

    @Override // androidx.lifecycle.d0
    public final void f(Object obj) {
        k3.d dVar = (k3.d) this.f5382d;
        dVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) dVar.f6453b;
        signInHubActivity.setResult(signInHubActivity.f2350d, signInHubActivity.f2351e);
        ((SignInHubActivity) dVar.f6453b).finish();
        this.f5380b = true;
    }

    public final void g() {
        Iterator it = p4.m.d((Set) this.f5382d).iterator();
        while (it.hasNext()) {
            l4.c cVar = (l4.c) it.next();
            if (!cVar.i() && !cVar.d()) {
                cVar.clear();
                if (!this.f5380b) {
                    cVar.f();
                } else {
                    ((Set) this.f5381c).add(cVar);
                }
            }
        }
    }

    public final void h() {
        this.f5380b = false;
        Iterator it = p4.m.d((Set) this.f5382d).iterator();
        while (it.hasNext()) {
            l4.c cVar = (l4.c) it.next();
            if (!cVar.i() && !cVar.isRunning()) {
                cVar.f();
            }
        }
        ((Set) this.f5381c).clear();
    }

    public final void i(boolean z9) {
        if (this.f5380b) {
            ((Context) this.f5381c).unregisterReceiver((j1.a) this.f5382d);
            this.f5380b = false;
        }
    }

    public final String toString() {
        switch (this.f5379a) {
            case 1:
                return ((k3.d) this.f5382d).toString();
            case 5:
                return super.toString() + "{numRequests=" + ((Set) this.f5382d).size() + ", isPaused=" + this.f5380b + "}";
            default:
                return super.toString();
        }
    }

    public v(Context context) {
        Object uVar;
        this.f5379a = 0;
        this.f5382d = new HashSet();
        x3.p pVar = new x3.p(new l(this, context));
        p pVar2 = new p(this);
        if (Build.VERSION.SDK_INT >= 24) {
            uVar = new o1.d0(pVar, pVar2);
        } else {
            uVar = new u(context, pVar, pVar2);
        }
        this.f5381c = uVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [s1.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(final int r4) {
        /*
            r3 = this;
            r0 = 4
            r3.f5379a = r0
            s1.b r0 = new s1.b
            r1 = 0
            r0.<init>()
            s1.b r1 = new s1.b
            r2 = 1
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.v.<init>(int):void");
    }

    public v(int i10, int i11) {
        this.f5379a = i10;
        if (i10 == 5) {
            this.f5382d = Collections.newSetFromMap(new WeakHashMap());
            this.f5381c = new HashSet();
        } else {
            if (i10 == 6) {
                this.f5380b = false;
                return;
            }
            this.f5381c = null;
            this.f5380b = false;
            this.f5382d = null;
        }
    }

    public v(s1.b bVar, s1.b bVar2) {
        this.f5379a = 4;
        this.f5381c = bVar;
        this.f5382d = bVar2;
        this.f5380b = true;
    }

    public v(a1.b bVar, k3.d dVar) {
        this.f5379a = 1;
        this.f5380b = false;
        this.f5381c = bVar;
        this.f5382d = dVar;
    }
}
