package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g90 implements gd4 {
    public Object A;
    public long x;
    public long y;
    public Object z;

    public g90(long j, int i) {
        boolean z;
        if (((k7) this.z) == null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        this.x = j;
        this.y = j + i;
    }

    public void a(Object obj, Object obj2, rz4 rz4Var) {
        rz4 rz4Var2 = (rz4) obj2;
        ((fr0) ((wv) this.A).b).r((gx3) obj, rz4Var2.a, rz4Var2.b, rz4Var2.c);
    }

    @Override // defpackage.gd4
    public long b(c12 c12Var) {
        long j = this.y;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.y = -1L;
        return j2;
    }

    @Override // defpackage.gd4
    public hf5 c() {
        boolean z;
        if (this.x != -1) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        return new zy((f42) this.z, this.x, (byte) 1);
    }

    @Override // defpackage.gd4
    public void d(long j) {
        long[] jArr = (long[]) ((rt3) this.A).y;
        this.y = jArr[eq6.f(jArr, j, true)];
    }

    public long e() {
        long j = this.y;
        if (j == -1) {
            long j2 = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.z).entrySet()) {
                j2 += f(entry.getKey(), entry.getValue());
            }
            this.y = j2;
            return j2;
        }
        return j;
    }

    public long f(Object obj, Object obj2) {
        try {
            long j = ((rz4) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.y = -1L;
            throw e;
        }
    }

    public void g(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.z) == null) {
            this.z = exc;
        }
        if (this.x == -9223372036854775807L) {
            ((l71) this.A).r.getClass();
            synchronized (ww.p) {
                if (ww.r > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                this.x = 200 + elapsedRealtime;
            }
        }
        long j = this.x;
        if (j != -9223372036854775807L && elapsedRealtime >= j) {
            Exception exc2 = (Exception) this.z;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.z;
            this.z = null;
            this.x = -9223372036854775807L;
            this.y = -9223372036854775807L;
            throw exc3;
        }
        this.y = elapsedRealtime + 50;
    }

    public void h(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.z;
        while (e() > j) {
            if (linkedHashMap.isEmpty()) {
                if (e() != 0) {
                    ze0.m("sizeOf() is returning inconsistent values");
                    return;
                }
                return;
            } else {
                Map.Entry entry = (Map.Entry) yo0.j0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.y = e() - f(key, value);
                a(key, value, null);
            }
        }
    }

    public boolean i(long j, boolean z, boolean z2) {
        r08 r08Var = (r08) this.A;
        r08Var.L();
        r08Var.M();
        gu7 gu7Var = (gu7) r08Var.x;
        boolean a = gu7Var.a();
        es7 es7Var = gu7Var.C;
        if (a) {
            bt7 bt7Var = gu7Var.B;
            gu7.j(bt7Var);
            sb6 sb6Var = bt7Var.M;
            gu7Var.H.getClass();
            sb6Var.h(System.currentTimeMillis());
        }
        long j2 = j - this.x;
        if (!z && j2 < 1000) {
            gu7.l(es7Var);
            es7Var.K.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.y;
            this.y = j;
        }
        gu7.l(es7Var);
        es7Var.K.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !gu7Var.A.a0();
        py7 py7Var = gu7Var.I;
        gu7.k(py7Var);
        i28.H0(py7Var.P(z3), bundle, true);
        if (!z2) {
            qx7 qx7Var = gu7Var.J;
            gu7.k(qx7Var);
            qx7Var.S("auto", "_e", bundle);
        }
        this.x = j;
        l08 l08Var = (l08) this.z;
        l08Var.c();
        l08Var.b(((Long) tq7.p0.a(null)).longValue());
        return true;
    }

    public g90(l71 l71Var) {
        this.A = l71Var;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
    }

    public g90(String str, byte[] bArr, long j, long j2) {
        this.z = str;
        this.A = bArr;
        this.x = j;
        this.y = j2;
    }
}
