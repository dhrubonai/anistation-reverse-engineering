package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y91 implements iw3 {
    public static final /* synthetic */ int k = 0;
    public final tp a;
    public final o41 b;
    public w16 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;
    public boolean j;

    public y91(o41 o41Var, e12 e12Var) {
        p18 p18Var = new p18((byte) 14);
        this.b = o41Var;
        this.c = p18Var;
        tp tpVar = new tp(e12Var, p18Var);
        this.a = tpVar;
        if (o41Var != ((o41) tpVar.B)) {
            tpVar.B = o41Var;
            ((HashMap) tpVar.z).clear();
            ((HashMap) tpVar.A).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static iw3 f(Class cls, o41 o41Var) {
        try {
            return (iw3) cls.getConstructor(o41.class).newInstance(o41Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.iw3
    public final void a() {
        tp tpVar = this.a;
        tpVar.getClass();
        ((e12) tpVar.y).a();
    }

    @Override // defpackage.iw3
    public final void c() {
        this.i = true;
        tp tpVar = this.a;
        tpVar.getClass();
        ((e12) tpVar.y).e();
        Iterator it = ((HashMap) tpVar.A).values().iterator();
        while (it.hasNext()) {
            ((iw3) it.next()).c();
        }
    }

    @Override // defpackage.iw3
    public final iw3 d(st3 st3Var) {
        io3.w(st3Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        tp tpVar = this.a;
        tpVar.D = st3Var;
        Iterator it = ((HashMap) tpVar.A).values().iterator();
        while (it.hasNext()) {
            ((iw3) it.next()).d(st3Var);
        }
        return this;
    }

    @Override // defpackage.iw3
    public final lw3 e(ar3 ar3Var) {
        xp1 xp1Var;
        xp1 xp1Var2;
        ar3 ar3Var2 = ar3Var;
        ar3Var2.b.getClass();
        String scheme = ar3Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(ar3Var2.b.b, "application/x-image-uri");
        vq3 vq3Var = ar3Var2.b;
        if (!equals) {
            int L = eq6.L(vq3Var.a, vq3Var.b);
            if (ar3Var2.b.h != -9223372036854775807L) {
                e12 e12Var = (e12) this.a.y;
                if (e12Var instanceof q81) {
                    q81 q81Var = (q81) e12Var;
                    synchronized (q81Var) {
                        q81Var.f = true;
                    }
                }
                e12 e12Var2 = (e12) this.a.y;
                if (e12Var2 instanceof q81) {
                    q81 q81Var2 = (q81) e12Var2;
                    synchronized (q81Var2) {
                        q81Var2.g = true;
                    }
                }
            }
            try {
                iw3 j = this.a.j(L);
                tq3 a = ar3Var2.c.a();
                uq3 uq3Var = ar3Var2.c;
                if (uq3Var.a == -9223372036854775807L) {
                    a.a = this.d;
                }
                if (uq3Var.d == -3.4028235E38f) {
                    a.d = this.g;
                }
                if (uq3Var.e == -3.4028235E38f) {
                    a.e = this.h;
                }
                if (uq3Var.b == -9223372036854775807L) {
                    a.b = this.e;
                }
                if (uq3Var.c == -9223372036854775807L) {
                    a.c = this.f;
                }
                uq3 uq3Var2 = new uq3(a);
                if (!uq3Var2.equals(ar3Var2.c)) {
                    nq3 a2 = ar3Var2.a();
                    a2.l = uq3Var2.a();
                    ar3Var2 = a2.a();
                }
                lw3 e = j.e(ar3Var2);
                nw2 nw2Var = ar3Var2.b.g;
                if (!nw2Var.isEmpty()) {
                    lw3[] lw3VarArr = new lw3[nw2Var.size() + 1];
                    lw3VarArr[0] = e;
                    for (int i = 0; i < nw2Var.size(); i++) {
                        if (this.i) {
                            da2 da2Var = new da2();
                            da2Var.o = qy3.n(((zq3) nw2Var.get(i)).b);
                            da2Var.d = ((zq3) nw2Var.get(i)).c;
                            da2Var.e = ((zq3) nw2Var.get(i)).d;
                            da2Var.f = ((zq3) nw2Var.get(i)).e;
                            da2Var.b = ((zq3) nw2Var.get(i)).f;
                            da2Var.a = ((zq3) nw2Var.get(i)).g;
                            final ea2 ea2Var = new ea2(da2Var);
                            e12 e12Var3 = new e12() { // from class: u91
                                @Override // defpackage.e12
                                public final b12[] c() {
                                    b12 f70Var;
                                    y91 y91Var = y91.this;
                                    w16 w16Var = y91Var.c;
                                    ea2 ea2Var2 = ea2Var;
                                    if (w16Var.i(ea2Var2)) {
                                        f70Var = new r16(y91Var.c.s(ea2Var2));
                                    } else {
                                        f70Var = new f70(ea2Var2);
                                    }
                                    return new b12[]{f70Var};
                                }
                            };
                            o41 o41Var = this.b;
                            xv3 xv3Var = new xv3(e12Var3, (byte) 4);
                            Object obj = new Object();
                            q18 q18Var = new q18((byte) 13);
                            if (this.c.i(ea2Var)) {
                                da2 a3 = ea2Var.a();
                                a3.o = qy3.n("application/x-media3-cues");
                                a3.k = ea2Var.p;
                                a3.P = this.c.A(ea2Var);
                                ea2Var = new ea2(a3);
                            }
                            ea2 ea2Var2 = ea2Var;
                            int i2 = i + 1;
                            String uri = ((zq3) nw2Var.get(i)).a.toString();
                            nq3 nq3Var = new nq3();
                            nq3Var.c(uri);
                            ar3 a4 = nq3Var.a();
                            a4.b.getClass();
                            a4.b.getClass();
                            sq3 sq3Var = a4.b.c;
                            if (sq3Var == null) {
                                xp1Var2 = xp1.a;
                            } else {
                                synchronized (obj) {
                                    try {
                                        if (!sq3Var.equals(null)) {
                                            xp1Var = st3.j(sq3Var);
                                        } else {
                                            xp1Var = null;
                                        }
                                        xp1Var.getClass();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                xp1Var2 = xp1Var;
                            }
                            lw3VarArr[i2] = new qv4(a4, o41Var, xv3Var, xp1Var2, q18Var, 1048576, ea2Var2);
                        } else {
                            o41 o41Var2 = this.b;
                            o41Var2.getClass();
                            lw3VarArr[i + 1] = new gq5((zq3) nw2Var.get(i), o41Var2, new q18((byte) 13));
                        }
                    }
                    e = new vx3(lw3VarArr);
                }
                boolean z = this.j;
                qq3 qq3Var = ar3Var2.e;
                if (qq3Var.b != 0 || qq3Var.d != Long.MIN_VALUE || qq3Var.f) {
                    pn0 pn0Var = new pn0(e);
                    qq3 qq3Var2 = ar3Var2.e;
                    io3.B(!pn0Var.z);
                    pn0Var.B = qq3Var2.a();
                    io3.B(!pn0Var.z);
                    pn0Var.y = z;
                    pn0Var.z = true;
                    e = new sn0(pn0Var);
                }
                ar3Var2.b.getClass();
                if (ar3Var2.b.d == null) {
                    return e;
                }
                kb0.O("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return e;
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(e2);
            }
        }
        long j2 = vq3Var.h;
        String str = eq6.a;
        throw null;
    }

    @Override // defpackage.iw3
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void b(w16 w16Var) {
        this.c = w16Var;
        tp tpVar = this.a;
        tpVar.C = w16Var;
        ((e12) tpVar.y).b(w16Var);
        Iterator it = ((HashMap) tpVar.A).values().iterator();
        while (it.hasNext()) {
            ((iw3) it.next()).b(w16Var);
        }
    }

    public y91(o41 o41Var) {
        this(o41Var, new q81());
    }

    public y91(Context context, q81 q81Var) {
        this(new pz2(context, (byte) 16), q81Var);
    }
}
