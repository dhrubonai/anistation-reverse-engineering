package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kv4 implements mj3 {
    public final Uri b;
    public final iy5 c;
    public final dn0 d;
    public final nv4 e;
    public final nv0 f;
    public volatile boolean h;
    public long j;
    public bh6 l;
    public boolean m;
    public final /* synthetic */ nv4 n;
    public final d42 g = new Object();
    public boolean i = true;
    public final long a = ij3.h.getAndIncrement();
    public v41 k = c(0, null);

    /* JADX WARN: Type inference failed for: r1v2, types: [d42, java.lang.Object] */
    public kv4(nv4 nv4Var, Uri uri, q41 q41Var, dn0 dn0Var, nv4 nv4Var2, nv0 nv0Var) {
        this.n = nv4Var;
        this.b = uri;
        this.c = new iy5(q41Var);
        this.d = dn0Var;
        this.e = nv4Var2;
        this.f = nv0Var;
    }

    @Override // defpackage.mj3
    public final void a() {
        q41 q41Var;
        b12 b12Var;
        int i;
        int i2 = 0;
        String str = null;
        while (i2 == 0 && !this.h) {
            try {
                long j = this.g.a;
                v41 c = c(j, str);
                this.k = c;
                long h = this.c.h(c);
                if (this.h) {
                    if (i2 != 1 && this.d.z() != -1) {
                        this.g.a = this.d.z();
                    }
                    io3.F(this.c);
                    return;
                }
                List list = (List) this.c.x.s().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (h != -1) {
                    h += j;
                    nv4 nv4Var = this.n;
                    nv4Var.O.post(new hv4(nv4Var, (byte) 0));
                }
                long j2 = h;
                this.n.Q = bu2.d(this.c.x.s());
                iy5 iy5Var = this.c;
                bu2 bu2Var = this.n.Q;
                if (bu2Var != null && (i = bu2Var.f) != -1) {
                    q41Var = new zt2(iy5Var, i, this);
                    bh6 E = this.n.E(new mv4(0, true));
                    this.l = E;
                    E.g(nv4.s0);
                } else {
                    q41Var = iy5Var;
                }
                this.d.E(q41Var, this.b, this.c.x.s(), j, j2, this.e);
                if (this.n.Q != null && (b12Var = (b12) this.d.z) != null && (b12Var instanceof l14)) {
                    ((l14) b12Var).s = true;
                }
                if (this.i) {
                    dn0 dn0Var = this.d;
                    long j3 = this.j;
                    b12 b12Var2 = (b12) dn0Var.z;
                    b12Var2.getClass();
                    b12Var2.c(j, j3);
                    this.i = false;
                }
                while (i2 == 0 && !this.h) {
                    try {
                        this.f.a();
                        dn0 dn0Var2 = this.d;
                        d42 d42Var = this.g;
                        b12 b12Var3 = (b12) dn0Var2.z;
                        b12Var3.getClass();
                        p81 p81Var = (p81) dn0Var2.A;
                        p81Var.getClass();
                        i2 = b12Var3.a(p81Var, d42Var);
                        long z = this.d.z();
                        if (z > this.n.G + j) {
                            this.f.d();
                            nv4 nv4Var2 = this.n;
                            nv4Var2.O.post(nv4Var2.N);
                            j = z;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.d.z() != -1) {
                    this.g.a = this.d.z();
                }
                io3.F(this.c);
            } catch (Throwable th) {
                if (i2 != 1 && this.d.z() != -1) {
                    this.g.a = this.d.z();
                }
                io3.F(this.c);
                throw th;
            }
        }
    }

    @Override // defpackage.mj3
    public final void b() {
        this.h = true;
    }

    public final v41 c(long j, String str) {
        Map map = nv4.r0;
        if (str != null && !str.startsWith("W/")) {
            map = rw2.a().D(map).y("If-Range", str).f();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.n.F;
        Uri uri = this.b;
        io3.w(uri, "The uri must be set.");
        return new v41(uri, 0L, 1, null, map, j, -1L, str2, 6);
    }
}
