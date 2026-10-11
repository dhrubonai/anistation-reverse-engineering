package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class bu3 {
    public static final tk5 C = new tk5(1);
    public static final r26 D = mv5.e(new xw((byte) 5));
    public final nw2 A;
    public final Bundle B;
    public final Object a = new Object();
    public final Uri b;
    public final yt3 c;
    public final xt3 d;
    public final at3 e;
    public final Context f;
    public final gw3 g;
    public final wu3 h;
    public final String i;
    public final uk5 j;
    public final ft3 k;
    public final Handler l;
    public final p60 m;
    public final tt3 n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final nw2 r;
    public ep4 s;
    public fq4 t;
    public final PendingIntent u;
    public zt3 v;
    public boolean w;
    public final short x;
    public boolean y;
    public final nw2 z;

    /* JADX WARN: Type inference failed for: r15v2, types: [ha2, fq4, java.lang.Object] */
    public bu3(ft3 ft3Var, Context context, String str, ei0 ei0Var, PendingIntent pendingIntent, nw2 nw2Var, nw2 nw2Var2, nw2 nw2Var3, at3 at3Var, Bundle bundle, Bundle bundle2, p60 p60Var) {
        kb0.B("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + eq6.a + "]");
        this.k = ft3Var;
        this.f = context;
        this.i = str;
        this.u = pendingIntent;
        this.z = nw2Var;
        this.A = nw2Var2;
        this.r = nw2Var3;
        this.e = at3Var;
        this.B = bundle2;
        this.m = p60Var;
        this.p = true;
        this.q = true;
        gw3 gw3Var = new gw3(this);
        this.g = gw3Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper J0 = ei0Var.a.J0();
        Handler handler = new Handler(J0);
        this.l = handler;
        this.s = ep4.H;
        this.c = new yt3(this, J0);
        this.d = new xt3(this, J0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str).build();
        this.b = build;
        wu3 wu3Var = new wu3(this, build, handler, bundle, pendingIntent, nw2Var, nw2Var2, bt3.f, bt3.h, bundle2);
        this.h = wu3Var;
        this.j = new uk5(Process.myUid(), context.getPackageName(), gw3Var, bundle, ((mt3) wu3Var.o.y).c.y);
        ?? ha2Var = new ha2(ei0Var);
        this.t = ha2Var;
        eq6.a0(handler, new f32((Object) this, (Object) ha2Var, (byte) 14));
        this.x = (short) 3000;
        this.n = new tt3(this, (byte) 2);
        eq6.a0(handler, new tt3(this, (byte) 0));
    }

    public static boolean j(dt3 dt3Var) {
        if (dt3Var != null && Objects.equals(dt3Var.a.a.a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.KeyEvent r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            ft3 r0 = r7.k
            bu3 r0 = r0.a
            dt3 r4 = r0.e()
            if (r4 != 0) goto Lb
            goto L31
        Lb:
            int r8 = r8.getKeyCode()
            r0 = 85
            r1 = 79
            if (r8 == r0) goto L17
            if (r8 != r1) goto L1b
        L17:
            if (r9 == 0) goto L1b
            r8 = 87
        L1b:
            r9 = 1
            if (r8 == r1) goto L66
            r0 = 126(0x7e, float:1.77E-43)
            if (r8 == r0) goto L5f
            r0 = 127(0x7f, float:1.78E-43)
            if (r8 == r0) goto L58
            r0 = 272(0x110, float:3.81E-43)
            if (r8 == r0) goto L51
            r0 = 273(0x111, float:3.83E-43)
            if (r8 == r0) goto L4a
            switch(r8) {
                case 85: goto L66;
                case 86: goto L42;
                case 87: goto L51;
                case 88: goto L4a;
                case 89: goto L3a;
                case 90: goto L33;
                default: goto L31;
            }
        L31:
            r7 = 0
            return r7
        L33:
            uv0 r8 = new uv0
            r0 = 7
            r8.<init>(r7, r4, r0)
            goto L7d
        L3a:
            uv0 r8 = new uv0
            r0 = 8
            r8.<init>(r7, r4, r0)
            goto L7d
        L42:
            uv0 r8 = new uv0
            r0 = 9
            r8.<init>(r7, r4, r0)
            goto L7d
        L4a:
            uv0 r8 = new uv0
            r0 = 6
            r8.<init>(r7, r4, r0)
            goto L7d
        L51:
            uv0 r8 = new uv0
            r0 = 5
            r8.<init>(r7, r4, r0)
            goto L7d
        L58:
            uv0 r8 = new uv0
            r0 = 4
            r8.<init>(r7, r4, r0)
            goto L7d
        L5f:
            uv0 r8 = new uv0
            r0 = 3
            r8.<init>(r7, r4, r0)
            goto L7d
        L66:
            r7.t()
            fq4 r8 = r7.t
            boolean r8 = r8.n()
            if (r8 == 0) goto L77
            uv0 r8 = new uv0
            r8.<init>(r7, r4, r9)
            goto L7d
        L77:
            uv0 r8 = new uv0
            r0 = 2
            r8.<init>(r7, r4, r0)
        L7d:
            if (r10 == 0) goto Lad
            lk5 r10 = new lk5
            java.lang.String r0 = "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"
            android.os.Bundle r1 = android.os.Bundle.EMPTY
            r10.<init>(r1, r0)
            h5 r5 = new h5
            r5.<init>(r10)
            android.os.Handler r10 = r7.l
            android.os.Looper r0 = r10.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L9d
            r7.b(r4, r5)
            goto Lad
        L9d:
            b45 r3 = new b45
            r3.<init>()
            es3 r1 = new es3
            r6 = 2
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            defpackage.eq6.a0(r10, r1)
            goto Lae
        Lad:
            r2 = r7
        Lae:
            r8.run()
            gw3 r7 = r2.g
            st3 r7 = r7.f
            r7.n(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu3.a(android.view.KeyEvent, boolean, boolean):boolean");
    }

    public final ii3 b(dt3 dt3Var, h5 h5Var) {
        int i;
        ii3 ii3Var;
        gw3 gw3Var = this.g;
        try {
            i90 t = gw3Var.f.t(dt3Var);
            if (t != null) {
                vi5 a = t.a(C);
                i = a.E;
                ii3Var = a;
            } else {
                if (!g(dt3Var)) {
                    return wc7.w(new tk5(-100));
                }
                i = 0;
                ii3Var = wc7.w(new tk5(0));
            }
            ct3 ct3Var = dt3Var.e;
            if (ct3Var != null) {
                lk5 lk5Var = (lk5) h5Var.y;
                Bundle bundle = Bundle.EMPTY;
                ct3Var.a(i, lk5Var);
            }
            return ii3Var;
        } catch (DeadObjectException unused) {
            gw3Var.f.D(dt3Var);
            return wc7.w(new tk5(-100));
        } catch (RemoteException e) {
            kb0.P("MediaSessionImpl", "Exception in " + dt3Var, e);
            return wc7.w(new tk5(-1));
        }
    }

    public final void c(dt3 dt3Var, au3 au3Var) {
        int i;
        gw3 gw3Var = this.g;
        try {
            i90 t = gw3Var.f.t(dt3Var);
            if (t != null) {
                i = t.b();
            } else if (g(dt3Var)) {
                i = 0;
            } else {
                return;
            }
            ct3 ct3Var = dt3Var.e;
            if (ct3Var != null) {
                au3Var.d(ct3Var, i);
            }
        } catch (DeadObjectException unused) {
            gw3Var.f.D(dt3Var);
        } catch (RemoteException e) {
            kb0.P("MediaSessionImpl", "Exception in " + dt3Var, e);
        }
    }

    public final void d(au3 au3Var) {
        nw2 p = this.g.f.p();
        for (int i = 0; i < p.size(); i++) {
            c((dt3) p.get(i), au3Var);
        }
        try {
            au3Var.d(this.h.k, 0);
        } catch (RemoteException e) {
            kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final dt3 e() {
        t();
        nw2 p = this.g.f.p();
        for (int i = 0; i < p.size(); i++) {
            dt3 dt3Var = (dt3) p.get(i);
            if (h(dt3Var)) {
                return dt3Var;
            }
        }
        return null;
    }

    public final void f(go4 go4Var) {
        this.c.a(false, false);
        d(new h5((Object) go4Var, (byte) 28));
        try {
            uu3 uu3Var = this.h.k;
            rf1 rf1Var = this.s.s;
            uu3Var.i();
        } catch (RemoteException e) {
            kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final boolean g(dt3 dt3Var) {
        if (!this.g.f.v(dt3Var) && !this.h.f.v(dt3Var)) {
            return false;
        }
        return true;
    }

    public final boolean h(dt3 dt3Var) {
        if (!Objects.equals(dt3Var.a.a.a, this.f.getPackageName()) || dt3Var.b == 0 || !new Bundle(dt3Var.f).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    public final ii3 k(dt3 dt3Var, o15 o15Var) {
        q(dt3Var);
        this.e.getClass();
        return at3.e(o15Var);
    }

    public final ii3 l(final dt3 dt3Var) {
        mk5 mk5Var;
        go4 go4Var;
        nw2 o;
        nw2 nw2Var;
        nw2 nw2Var2;
        nw2 o2;
        if (this.y && j(dt3Var)) {
            wu3 wu3Var = this.h;
            wu3Var.getClass();
            mk5 mk5Var2 = mk5.b;
            go4 go4Var2 = go4.b;
            mk5 mk5Var3 = wu3Var.z;
            mk5Var3.getClass();
            go4 go4Var3 = wu3Var.A;
            go4Var3.getClass();
            if (!wu3Var.y.isEmpty()) {
                nw2 nw2Var3 = wu3Var.y;
                if (nw2Var3 == null) {
                    o2 = null;
                } else {
                    o2 = nw2.o(nw2Var3);
                }
                nw2Var2 = o2;
                nw2Var = null;
            } else {
                nw2 nw2Var4 = wu3Var.x;
                if (nw2Var4 == null) {
                    o = null;
                } else {
                    o = nw2.o(nw2Var4);
                }
                nw2Var = o;
                nw2Var2 = null;
            }
            return wc7.w(new bt3(mk5Var3, go4Var3, nw2Var, nw2Var2, null));
        }
        this.e.getClass();
        ft3 ft3Var = this.k;
        bt3 bt3Var = ft3Var.b;
        if (bt3Var == null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", true);
            mk5 mk5Var4 = mk5.b;
            go4 go4Var4 = go4.b;
            mk5 mk5Var5 = mk5.b;
            mk5Var5.getClass();
            go4 go4Var5 = go4.b;
            go4Var5.getClass();
            bt3 bt3Var2 = new bt3(mk5Var5, go4Var5, null, null, bundle);
            ft3Var.b = bt3Var2;
            bt3Var = bt3Var2;
        }
        Bundle bundle2 = bt3Var.e;
        if (bundle2 != null && bundle2.getBoolean("androidx.media3.session.CALLBACK_NOT_IMPLEMENTED", false)) {
            if (dt3Var.d) {
                mk5Var = bt3.f;
                go4Var = bt3.h;
            } else {
                mk5Var = bt3.g;
                go4Var = bt3.i;
            }
            return eq6.k0(wc7.w(new bt3(mk5Var, go4Var, null, null, null)), new gt() { // from class: vt3
                @Override // defpackage.gt
                public final ii3 apply(Object obj) {
                    bt3 bt3Var3 = (bt3) obj;
                    bu3.this.s(dt3Var, bt3Var3);
                    return wc7.w(bt3Var3);
                }
            });
        }
        s(dt3Var, bt3Var);
        return wc7.w(bt3Var);
    }

    public final aw2 m(dt3 dt3Var) {
        q(dt3Var);
        this.e.getClass();
        return wc7.w(new tk5(-6));
    }

    public final void n(dt3 dt3Var) {
        q(dt3Var);
        this.e.getClass();
    }

    public final fl5 o(dt3 dt3Var, o15 o15Var, final int i, final long j) {
        q(dt3Var);
        this.e.getClass();
        return eq6.k0(at3.e(o15Var), new gt() { // from class: zs3
            @Override // defpackage.gt
            public final ii3 apply(Object obj) {
                return wc7.w(new et3((List) obj, i, j));
            }
        });
    }

    public final void p() {
        boolean z;
        kb0.B("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + eq6.a + "] [" + cr3.b() + "]");
        synchronized (this.a) {
            try {
                if (this.w) {
                    return;
                }
                this.w = true;
                xt3 xt3Var = this.d;
                ze zeVar = xt3Var.a;
                if (zeVar != null) {
                    xt3Var.removeCallbacks(zeVar);
                    xt3Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                } catch (Exception e) {
                    kb0.P("MediaSessionImpl", "Exception thrown while closing", e);
                }
                if (this.l.getLooper().getThread().isAlive()) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    eq6.a0(this.l, new ze((Object) this, (Object) atomicBoolean, (Object) countDownLatch, (byte) 13));
                    z = countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                    if (z && atomicBoolean.compareAndSet(false, true)) {
                        try {
                            this.h.V();
                            this.g.S();
                            return;
                        } catch (RuntimeException e2) {
                            kb0.P("MediaSessionImpl", "Exception thrown during emergency main thread release fallback", e2);
                            return;
                        }
                    }
                }
                z = false;
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final dt3 q(dt3 dt3Var) {
        dt3 e;
        if (this.y && j(dt3Var) && (e = e()) != null) {
            return e;
        }
        return dt3Var;
    }

    public final void r() {
        long j = this.x;
        Handler handler = this.l;
        tt3 tt3Var = this.n;
        handler.removeCallbacks(tt3Var);
        if (this.q && j > 0) {
            if (this.t.l0() || this.t.d()) {
                handler.postDelayed(tt3Var, j);
            }
        }
    }

    public final void s(dt3 dt3Var, bt3 bt3Var) {
        boolean z;
        if (h(dt3Var)) {
            bt3Var.getClass();
            byte b = 1;
            this.y = true;
            nw2 nw2Var = bt3Var.d;
            ft3 ft3Var = this.k;
            if (nw2Var == null) {
                bu3 bu3Var = ft3Var.a;
                bu3Var.t();
                nw2Var = bu3Var.A;
            }
            boolean isEmpty = nw2Var.isEmpty();
            wu3 wu3Var = this.h;
            if (isEmpty) {
                nw2 nw2Var2 = bt3Var.c;
                if (nw2Var2 == null) {
                    bu3 bu3Var2 = ft3Var.a;
                    bu3Var2.t();
                    nw2Var2 = bu3Var2.z;
                }
                wu3Var.x = nw2Var2;
            } else {
                wu3Var.y = nw2Var;
                wu3Var.X();
            }
            mk5 mk5Var = bt3Var.a;
            go4 go4Var = bt3Var.b;
            if (wu3Var.A.a(17) != go4Var.a(17)) {
                z = true;
            } else {
                z = false;
            }
            wu3Var.z = mk5Var;
            wu3Var.A = go4Var;
            if (!wu3Var.y.isEmpty()) {
                wu3Var.X();
            }
            bu3 bu3Var3 = wu3Var.i;
            if (z) {
                bu3Var3.t();
                wu3Var.U(new fu3(wu3Var, bu3Var3.t, b));
            } else {
                bu3Var3.t();
                wu3Var.Y(bu3Var3.t);
            }
        }
    }

    public final void t() {
        if (Looper.myLooper() == this.l.getLooper()) {
            return;
        }
        ze0.m("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
