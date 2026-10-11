package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e81 implements xp1 {
    public final UUID b;
    public final v71 c;
    public final tu d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final pz2 i;
    public final q18 j;
    public final af2 k;
    public final int l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public xx1 q;
    public b81 r;
    public b81 s;
    public Looper t;
    public Handler u;
    public byte[] v;
    public cp4 w;
    public volatile fu x;

    public e81(UUID uuid, tu tuVar, HashMap hashMap, boolean z, int[] iArr, boolean z2, q18 q18Var) {
        uuid.getClass();
        io3.m("Use C.CLEARKEY_UUID instead", !ce0.c.equals(uuid));
        this.b = uuid;
        this.c = eb2.B;
        this.d = tuVar;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = q18Var;
        this.i = new pz2((byte) 17);
        this.k = new af2(this, (byte) 15);
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000;
    }

    public static boolean g(b81 b81Var) {
        b81Var.n();
        if (b81Var.p == 1) {
            pp1 error = b81Var.getError();
            error.getClass();
            Throwable cause = error.getCause();
            if ((cause instanceof ResourceBusyException) || oi4.x(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList j(op1 op1Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(op1Var.A);
        for (int i = 0; i < op1Var.A; i++) {
            np1 np1Var = op1Var.x[i];
            if ((np1Var.a(uuid) || (ce0.d.equals(uuid) && np1Var.a(ce0.c))) && (np1Var.B != null || z)) {
                arrayList.add(np1Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.xp1
    public final void a() {
        xx1 i18Var;
        l(true);
        int i = this.p;
        this.p = i + 1;
        if (i == 0) {
            if (this.q == null) {
                UUID uuid = this.b;
                this.c.getClass();
                try {
                    try {
                        i18Var = new eb2(uuid);
                    } catch (wo6 unused) {
                        kb0.s("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        i18Var = new i18((byte) 16);
                    }
                    this.q = i18Var;
                    i18Var.w(new i75(this, (byte) 14));
                    return;
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e2) {
                    throw new Exception(e2);
                }
            }
            if (this.l != -9223372036854775807L) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i2 < arrayList.size()) {
                        ((b81) arrayList.get(i2)).d(null);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.xp1
    public final qp1 b(tp1 tp1Var, ea2 ea2Var) {
        boolean z = false;
        l(false);
        if (this.p > 0) {
            z = true;
        }
        io3.B(z);
        this.t.getClass();
        return f(this.t, tp1Var, ea2Var, true);
    }

    @Override // defpackage.xp1
    public final wp1 c(tp1 tp1Var, ea2 ea2Var) {
        boolean z;
        if (this.p > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        this.t.getClass();
        d81 d81Var = new d81(this, tp1Var);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new gb(d81Var, ea2Var, (byte) 17));
        return d81Var;
    }

    @Override // defpackage.xp1
    public final void d(Looper looper, cp4 cp4Var) {
        boolean z;
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z = true;
                    } else {
                        z = false;
                    }
                    io3.B(z);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = cp4Var;
    }

    @Override // defpackage.xp1
    public final int e(ea2 ea2Var) {
        l(false);
        xx1 xx1Var = this.q;
        xx1Var.getClass();
        int E = xx1Var.E();
        op1 op1Var = ea2Var.t;
        if (op1Var == null) {
            int h = qy3.h(ea2Var.p);
            int i = 0;
            while (true) {
                int[] iArr = this.g;
                if (i < iArr.length) {
                    if (iArr[i] == h) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.v == null) {
            UUID uuid = this.b;
            if (j(op1Var, uuid, true).isEmpty()) {
                if (op1Var.A == 1 && op1Var.x[0].a(ce0.c)) {
                    kb0.O("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = op1Var.z;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (defpackage.cb2.c != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qp1 f(android.os.Looper r7, defpackage.tp1 r8, defpackage.ea2 r9, boolean r10) {
        /*
            r6 = this;
            fu r0 = r6.x
            r1 = 2
            if (r0 != 0) goto Lc
            fu r0 = new fu
            r0.<init>(r6, r7, r1)
            r6.x = r0
        Lc:
            op1 r7 = r9.t
            r0 = 0
            r2 = 0
            if (r7 != 0) goto L5e
            java.lang.String r7 = r9.p
            int r7 = defpackage.qy3.h(r7)
            xx1 r8 = r6.q
            r8.getClass()
            int r9 = r8.E()
            if (r9 != r1) goto L2a
            java.util.HashSet r9 = defpackage.cr3.a
            boolean r9 = defpackage.cb2.c
            if (r9 == 0) goto L2a
            goto L5d
        L2a:
            int[] r9 = r6.g
        L2c:
            int r1 = r9.length
            r3 = -1
            if (r0 >= r1) goto L38
            r1 = r9[r0]
            if (r1 != r7) goto L35
            goto L39
        L35:
            int r0 = r0 + 1
            goto L2c
        L38:
            r0 = r3
        L39:
            if (r0 == r3) goto L5d
            int r7 = r8.E()
            r8 = 1
            if (r7 != r8) goto L43
            goto L5d
        L43:
            b81 r7 = r6.r
            if (r7 != 0) goto L57
            z62 r7 = defpackage.nw2.y
            o15 r7 = defpackage.o15.B
            b81 r7 = r6.i(r7, r8, r2, r10)
            java.util.ArrayList r8 = r6.m
            r8.add(r7)
            r6.r = r7
            goto L5a
        L57:
            r7.d(r2)
        L5a:
            b81 r6 = r6.r
            return r6
        L5d:
            return r2
        L5e:
            byte[] r9 = r6.v
            if (r9 != 0) goto L9a
            java.util.UUID r9 = r6.b
            java.util.ArrayList r7 = j(r7, r9, r0)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L9b
            c81 r7 = new c81
            java.util.UUID r6 = r6.b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Media does not support uuid: "
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r7.<init>(r6)
            java.lang.String r6 = "DefaultDrmSessionMgr"
            java.lang.String r9 = "DRM error"
            defpackage.kb0.t(r6, r9, r7)
            r8.d(r7)
            kw1 r6 = new kw1
            pp1 r8 = new pp1
            r9 = 6003(0x1773, float:8.412E-42)
            r8.<init>(r7, r9)
            r6.<init>(r8)
            return r6
        L9a:
            r7 = r2
        L9b:
            boolean r9 = r6.f
            if (r9 != 0) goto La2
            b81 r2 = r6.s
            goto Lbc
        La2:
            java.util.ArrayList r9 = r6.m
            int r1 = r9.size()
            r3 = r0
        La9:
            if (r3 >= r1) goto Lbc
            java.lang.Object r4 = r9.get(r3)
            int r3 = r3 + 1
            b81 r4 = (defpackage.b81) r4
            java.util.List r5 = r4.a
            boolean r5 = java.util.Objects.equals(r5, r7)
            if (r5 == 0) goto La9
            r2 = r4
        Lbc:
            if (r2 != 0) goto Lce
            b81 r7 = r6.i(r7, r0, r8, r10)
            boolean r8 = r6.f
            if (r8 != 0) goto Lc8
            r6.s = r7
        Lc8:
            java.util.ArrayList r6 = r6.m
            r6.add(r7)
            return r7
        Lce:
            r2.d(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e81.f(android.os.Looper, tp1, ea2, boolean):qp1");
    }

    public final b81 h(List list, boolean z, tp1 tp1Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        xx1 xx1Var = this.q;
        byte[] bArr = this.v;
        Looper looper = this.t;
        looper.getClass();
        cp4 cp4Var = this.w;
        cp4Var.getClass();
        b81 b81Var = new b81(this.b, xx1Var, this.i, this.k, list, z2, z, bArr, this.e, this.d, looper, this.j, cp4Var);
        b81Var.d(tp1Var);
        if (this.l != -9223372036854775807L) {
            b81Var.d(null);
        }
        return b81Var;
    }

    public final b81 i(List list, boolean z, tp1 tp1Var, boolean z2) {
        b81 h = h(list, z, tp1Var);
        boolean g = g(h);
        int i = this.l;
        Set set = this.o;
        if (g && !set.isEmpty()) {
            ho6 it = zw2.m(set).iterator();
            while (it.hasNext()) {
                ((qp1) it.next()).c(null);
            }
            h.c(tp1Var);
            if (i != -9223372036854775807L) {
                h.c(null);
            }
            h = h(list, z, tp1Var);
        }
        if (g(h) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                ho6 it2 = zw2.m(set2).iterator();
                while (it2.hasNext()) {
                    ((d81) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    ho6 it3 = zw2.m(set).iterator();
                    while (it3.hasNext()) {
                        ((qp1) it3.next()).c(null);
                    }
                }
                h.c(tp1Var);
                if (i != -9223372036854775807L) {
                    h.c(null);
                }
                return h(list, z, tp1Var);
            }
        }
        return h;
    }

    public final void k() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            xx1 xx1Var = this.q;
            xx1Var.getClass();
            xx1Var.release();
            this.q = null;
        }
    }

    public final void l(boolean z) {
        if (z && this.t == null) {
            kb0.P("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            kb0.P("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.xp1
    public final void release() {
        l(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((b81) arrayList.get(i2)).c(null);
            }
        }
        ho6 it = zw2.m(this.n).iterator();
        while (it.hasNext()) {
            ((d81) it.next()).release();
        }
        k();
    }
}
