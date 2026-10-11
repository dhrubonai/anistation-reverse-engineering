package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hh1 implements AutoCloseable {
    public static final c15 O = new c15("[a-z0-9_-]{1,120}");
    public final qj4 A;
    public final qj4 B;
    public final LinkedHashMap C;
    public final ke0 D;
    public final Object E;
    public long F;
    public int G;
    public wy4 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final gh1 N;
    public final qj4 x;
    public final long y;
    public final qj4 z;

    public hh1(long j, n22 n22Var, qj4 qj4Var) {
        this.x = qj4Var;
        this.y = j;
        if (j > 0) {
            this.z = qj4Var.e("journal");
            this.A = qj4Var.e("journal.tmp");
            this.B = qj4Var.e("journal.bkp");
            this.C = new LinkedHashMap(0, 0.75f, true);
            q26 a = iv5.a();
            ja1 ja1Var = rh1.a;
            j91 j91Var = j91.y;
            m11 m11Var = n11.x;
            this.D = db.b(tl7.L(a, j91Var.x0(1)));
            this.E = new Object();
            this.N = new gh1(n22Var);
            return;
        }
        ze0.k("maxSize <= 0");
        throw null;
    }

    public static void l0(String str) {
        if (O.b(str)) {
            return;
        }
        ze0.e(qx1.m("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final wy4 A() {
        return new wy4(new p12(this.N.z.a(this.z), new lz0(this, (byte) 3)));
    }

    public final void G() {
        Iterator it = this.C.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            eh1 eh1Var = (eh1) it.next();
            int i = 0;
            if (eh1Var.g == null) {
                while (i < 2) {
                    j += eh1Var.b[i];
                    i++;
                }
            } else {
                eh1Var.g = null;
                while (i < 2) {
                    qj4 qj4Var = (qj4) eh1Var.c.get(i);
                    gh1 gh1Var = this.N;
                    gh1Var.t(qj4Var);
                    gh1Var.t((qj4) eh1Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.F = j;
    }

    public final void I() {
        bv5 l0 = this.N.z.l0(this.z);
        l0.getClass();
        xy4 xy4Var = new xy4(l0);
        try {
            String K = xy4Var.K(Long.MAX_VALUE);
            String K2 = xy4Var.K(Long.MAX_VALUE);
            String K3 = xy4Var.K(Long.MAX_VALUE);
            String K4 = xy4Var.K(Long.MAX_VALUE);
            String K5 = xy4Var.K(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(K) && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(K2) && a34.i(String.valueOf(3), K3) && a34.i(String.valueOf(2), K4) && K5.length() <= 0) {
                int i = 0;
                while (true) {
                    try {
                        T(xy4Var.K(Long.MAX_VALUE));
                        i++;
                    } catch (EOFException unused) {
                        this.G = i - this.C.size();
                        if (!xy4Var.D()) {
                            u0();
                        } else {
                            this.H = A();
                        }
                        try {
                            xy4Var.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th == null) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + K + ", " + K2 + ", " + K3 + ", " + K4 + ", " + K5 + "]");
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                xy4Var.close();
            } catch (Throwable th3) {
                n03.i(th, th3);
            }
        }
    }

    public final void T(String str) {
        String substring;
        int S = uz5.S(str, ' ', 0, 6);
        if (S != -1) {
            int i = S + 1;
            int S2 = uz5.S(str, ' ', i, 4);
            LinkedHashMap linkedHashMap = this.C;
            if (S2 == -1) {
                substring = str.substring(i);
                if (S == 6 && b06.I(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, S2);
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new eh1(this, substring);
                linkedHashMap.put(substring, obj);
            }
            eh1 eh1Var = (eh1) obj;
            if (S2 != -1 && S == 5 && b06.I(str, "CLEAN", false)) {
                List h0 = uz5.h0(str.substring(S2 + 1), new char[]{' '}, 6);
                eh1Var.e = true;
                eh1Var.g = null;
                if (h0.size() == 2) {
                    try {
                        int size = h0.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            eh1Var.b[i2] = Long.parseLong((String) h0.get(i2));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        p65.n(h0, "unexpected journal line: ");
                        return;
                    }
                }
                p65.n(h0, "unexpected journal line: ");
                return;
            }
            if (S2 == -1 && S == 5 && b06.I(str, "DIRTY", false)) {
                eh1Var.g = new tu(this, eh1Var);
                return;
            } else {
                if (S2 == -1 && S == 4 && b06.I(str, "READ", false)) {
                    return;
                }
                qi2.k("unexpected journal line: ".concat(str));
                return;
            }
        }
        qi2.k("unexpected journal line: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        if (r3 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:17:0x0032, B:27:0x0040, B:30:0x005a, B:31:0x006e, B:33:0x007e, B:35:0x0085, B:38:0x0063, B:40:0x00a5, B:42:0x00ac, B:45:0x00b1, B:47:0x00c2, B:50:0x00c7, B:51:0x0102, B:53:0x010d, B:59:0x0116, B:60:0x00df, B:62:0x00f4, B:64:0x00ff, B:67:0x0095, B:69:0x011b, B:70:0x0122), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.tu r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh1.a(tu, boolean):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.E) {
            try {
                if (this.J && !this.K) {
                    for (eh1 eh1Var : (eh1[]) this.C.values().toArray(new eh1[0])) {
                        tu tuVar = eh1Var.g;
                        if (tuVar != null) {
                            eh1 eh1Var2 = (eh1) tuVar.y;
                            if (a34.i(eh1Var2.g, tuVar)) {
                                eh1Var2.f = true;
                            }
                        }
                    }
                    k0();
                    db.t(this.D, null);
                    wy4 wy4Var = this.H;
                    wy4Var.getClass();
                    wy4Var.close();
                    this.H = null;
                    this.K = true;
                    return;
                }
                this.K = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0(eh1 eh1Var) {
        wy4 wy4Var;
        int i = eh1Var.h;
        String str = eh1Var.a;
        if (i > 0 && (wy4Var = this.H) != null) {
            wy4Var.V("DIRTY");
            wy4Var.writeByte(32);
            wy4Var.V(str);
            wy4Var.writeByte(10);
            wy4Var.flush();
        }
        if (eh1Var.h <= 0 && eh1Var.g == null) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.N.t((qj4) eh1Var.c.get(i2));
                long j = this.F;
                long[] jArr = eh1Var.b;
                this.F = j - jArr[i2];
                jArr[i2] = 0;
            }
            this.G++;
            wy4 wy4Var2 = this.H;
            if (wy4Var2 != null) {
                wy4Var2.V("REMOVE");
                wy4Var2.writeByte(32);
                wy4Var2.V(str);
                wy4Var2.writeByte(10);
                wy4Var2.flush();
            }
            this.C.remove(str);
            if (this.G >= 2000) {
                t();
                return;
            }
            return;
        }
        eh1Var.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        d0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            r4 = this;
        L0:
            long r0 = r4.F
            long r2 = r4.y
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.C
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            eh1 r1 = (defpackage.eh1) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.d0(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh1.k0():void");
    }

    public final tu l(String str) {
        tu tuVar;
        synchronized (this.E) {
            if (!this.K) {
                l0(str);
                q();
                eh1 eh1Var = (eh1) this.C.get(str);
                if (eh1Var != null) {
                    tuVar = eh1Var.g;
                } else {
                    tuVar = null;
                }
                if (tuVar != null) {
                    return null;
                }
                if (eh1Var != null && eh1Var.h != 0) {
                    return null;
                }
                if (!this.L && !this.M) {
                    wy4 wy4Var = this.H;
                    wy4Var.getClass();
                    wy4Var.V("DIRTY");
                    wy4Var.writeByte(32);
                    wy4Var.V(str);
                    wy4Var.writeByte(10);
                    wy4Var.flush();
                    if (this.I) {
                        return null;
                    }
                    if (eh1Var == null) {
                        eh1Var = new eh1(this, str);
                        this.C.put(str, eh1Var);
                    }
                    tu tuVar2 = new tu(this, eh1Var);
                    eh1Var.g = tuVar2;
                    return tuVar2;
                }
                t();
                return null;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final fh1 p(String str) {
        fh1 a;
        synchronized (this.E) {
            if (!this.K) {
                l0(str);
                q();
                eh1 eh1Var = (eh1) this.C.get(str);
                if (eh1Var != null && (a = eh1Var.a()) != null) {
                    boolean z = true;
                    this.G++;
                    wy4 wy4Var = this.H;
                    wy4Var.getClass();
                    wy4Var.V("READ");
                    wy4Var.writeByte(32);
                    wy4Var.V(str);
                    wy4Var.writeByte(10);
                    wy4Var.flush();
                    if (this.G < 2000) {
                        z = false;
                    }
                    if (z) {
                        t();
                    }
                    return a;
                }
                return null;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void q() {
        synchronized (this.E) {
            try {
                if (this.J) {
                    return;
                }
                this.N.q(this.A);
                if (this.N.A(this.B)) {
                    boolean A = this.N.A(this.z);
                    gh1 gh1Var = this.N;
                    qj4 qj4Var = this.B;
                    if (A) {
                        gh1Var.q(qj4Var);
                    } else {
                        gh1Var.z.l(qj4Var, this.z);
                    }
                }
                if (this.N.A(this.z)) {
                    try {
                        I();
                        G();
                        this.J = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            x97.x(this.N, this.x);
                            this.K = false;
                        } catch (Throwable th) {
                            this.K = false;
                            throw th;
                        }
                    }
                }
                u0();
                this.J = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t() {
        tl7.z(this.D, null, null, new ji(this, null, (byte) 3), 3);
    }

    public final void u0() {
        synchronized (this.E) {
            try {
                wy4 wy4Var = this.H;
                if (wy4Var != null) {
                    wy4Var.close();
                }
                pq5 k0 = this.N.k0(this.A, false);
                k0.getClass();
                wy4 wy4Var2 = new wy4(k0);
                try {
                    wy4Var2.V("libcore.io.DiskLruCache");
                    wy4Var2.writeByte(10);
                    wy4Var2.V(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    wy4Var2.writeByte(10);
                    wy4Var2.l(3L);
                    wy4Var2.writeByte(10);
                    wy4Var2.l(2L);
                    wy4Var2.writeByte(10);
                    wy4Var2.writeByte(10);
                    for (eh1 eh1Var : this.C.values()) {
                        if (eh1Var.g != null) {
                            wy4Var2.V("DIRTY");
                            wy4Var2.writeByte(32);
                            wy4Var2.V(eh1Var.a);
                            wy4Var2.writeByte(10);
                        } else {
                            wy4Var2.V("CLEAN");
                            wy4Var2.writeByte(32);
                            wy4Var2.V(eh1Var.a);
                            for (long j : eh1Var.b) {
                                wy4Var2.writeByte(32);
                                wy4Var2.l(j);
                            }
                            wy4Var2.writeByte(10);
                        }
                    }
                    try {
                        wy4Var2.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        wy4Var2.close();
                    } catch (Throwable th3) {
                        n03.i(th, th3);
                    }
                }
                if (th == null) {
                    boolean A = this.N.A(this.z);
                    gh1 gh1Var = this.N;
                    if (A) {
                        gh1Var.z.l(this.z, this.B);
                        this.N.z.l(this.A, this.z);
                        this.N.q(this.B);
                    } else {
                        gh1Var.z.l(this.A, this.z);
                    }
                    this.H = A();
                    this.G = 0;
                    this.I = false;
                    this.M = false;
                } else {
                    throw th;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
