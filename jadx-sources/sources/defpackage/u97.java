package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u97 extends n22 {
    public static final qj4 C;
    public final n22 A;
    public final LinkedHashMap B;
    public final qj4 z;

    static {
        String str = qj4.y;
        C = r18.l("/");
    }

    public u97(qj4 qj4Var, n22 n22Var, LinkedHashMap linkedHashMap) {
        n22Var.getClass();
        this.z = qj4Var;
        this.A = n22Var;
        this.B = linkedHashMap;
    }

    @Override // defpackage.n22
    public final List G(qj4 qj4Var) {
        qj4 qj4Var2 = C;
        qj4Var2.getClass();
        t97 t97Var = (t97) this.B.get(c.a(qj4Var2, qj4Var, true));
        if (t97Var != null) {
            return yo0.I0(t97Var.q);
        }
        p65.n(qj4Var, "not a directory: ");
        return null;
    }

    @Override // defpackage.n22
    public final e22 T(qj4 qj4Var) {
        Long valueOf;
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long valueOf2;
        Throwable th;
        Throwable th2;
        qj4Var.getClass();
        qj4 qj4Var2 = C;
        qj4Var2.getClass();
        t97 t97Var = (t97) this.B.get(c.a(qj4Var2, qj4Var, true));
        if (t97Var == null) {
            return null;
        }
        long j = t97Var.h;
        if (j != -1) {
            z63 d0 = this.A.d0(this.z);
            try {
                xy4 xy4Var = new xy4(d0.a(j));
                try {
                    t97Var = iz5.j(xy4Var, t97Var);
                    t97Var.getClass();
                    try {
                        xy4Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        xy4Var.close();
                    } catch (Throwable th5) {
                        n03.i(th4, th5);
                    }
                    th2 = th4;
                    t97Var = null;
                }
            } catch (Throwable th6) {
                if (d0 != null) {
                    try {
                        d0.close();
                    } catch (Throwable th7) {
                        n03.i(th6, th7);
                    }
                }
                th = th6;
                t97Var = null;
            }
            if (th2 == null) {
                try {
                    d0.close();
                    th = null;
                } catch (Throwable th8) {
                    th = th8;
                }
                if (th != null) {
                    throw th;
                }
            } else {
                throw th2;
            }
        }
        boolean z2 = t97Var.b;
        boolean z3 = !z2;
        if (z2) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(t97Var.f);
        }
        Long l4 = t97Var.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (t97Var.p != null) {
                z = true;
                l = Long.valueOf(r0.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = t97Var.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (t97Var.n != null) {
                l2 = Long.valueOf(r2.intValue() * 1000);
            } else {
                int i = t97Var.j;
                if (i != -1) {
                    int i2 = t97Var.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = t97Var.l;
        if (l6 != null) {
            valueOf2 = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (t97Var.o != null) {
                valueOf2 = Long.valueOf(r1.intValue() * 1000);
            } else {
                l3 = null;
                return new e22(z3, z2, null, valueOf, l, l2, l3);
            }
        }
        l3 = valueOf2;
        return new e22(z3, z2, null, valueOf, l, l2, l3);
    }

    @Override // defpackage.n22
    public final pq5 a(qj4 qj4Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n22
    public final z63 d0(qj4 qj4Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.n22
    public final pq5 k0(qj4 qj4Var, boolean z) {
        qj4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n22
    public final void l(qj4 qj4Var, qj4 qj4Var2) {
        qj4Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n22
    public final bv5 l0(qj4 qj4Var) {
        Throwable th;
        xy4 xy4Var;
        qj4Var.getClass();
        qj4 qj4Var2 = C;
        qj4Var2.getClass();
        t97 t97Var = (t97) this.B.get(c.a(qj4Var2, qj4Var, true));
        if (t97Var != null) {
            long j = t97Var.f;
            z63 d0 = this.A.d0(this.z);
            try {
                xy4Var = new xy4(d0.a(t97Var.h));
                try {
                    d0.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (d0 != null) {
                    try {
                        d0.close();
                    } catch (Throwable th4) {
                        n03.i(th3, th4);
                    }
                }
                th = th3;
                xy4Var = null;
            }
            if (th == null) {
                xy4Var.getClass();
                iz5.j(xy4Var, null);
                if (t97Var.g == 0) {
                    return new dh3(xy4Var, j, false);
                }
                return new dh3(new sy2(new xy4(new dh3(xy4Var, t97Var.e, false)), new Inflater(true)), j, true);
            }
            throw th;
        }
        v71.m(qj4Var, "no such file: ");
        return null;
    }

    @Override // defpackage.n22
    public final void p(qj4 qj4Var) {
        qj4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n22
    public final void q(qj4 qj4Var) {
        qj4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
