package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p6 extends y30 {
    public final z20 h;
    public final long i;
    public final long j;
    public final long k;
    public final short l;
    public final short m;
    public final float n;
    public final float o;
    public final nw2 p;
    public final f46 q;
    public float r;
    public int s;
    public int t;
    public long u;
    public rl2 v;

    public p6(yg6 yg6Var, int[] iArr, z20 z20Var, nw2 nw2Var) {
        super(yg6Var, iArr, null);
        this.h = z20Var;
        this.i = 10000000L;
        this.j = 25000000L;
        this.k = 25000000L;
        this.l = (short) 1279;
        this.m = (short) 719;
        this.n = 0.7f;
        this.o = 0.75f;
        this.p = nw2.o(nw2Var);
        this.q = f46.a;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            jw2 jw2Var = (jw2) arrayList.get(i);
            if (jw2Var != null) {
                jw2Var.c(new o6(j, jArr[i]));
            }
        }
    }

    public static long y(List list) {
        if (!list.isEmpty()) {
            rl2 rl2Var = (rl2) bx7.z(list);
            long j = rl2Var.g;
            if (j != -9223372036854775807L) {
                long j2 = rl2Var.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.jz1
    public final void b(long j, long j2, long j3, List list, ep3[] ep3VarArr) {
        long y;
        long j4;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.s;
        int i2 = 0;
        if (i < ep3VarArr.length && ep3VarArr[i].next()) {
            ep3 ep3Var = ep3VarArr[this.s];
            y = ep3Var.n() - ep3Var.g();
        } else {
            int length = ep3VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    ep3 ep3Var2 = ep3VarArr[i3];
                    if (ep3Var2.next()) {
                        y = ep3Var2.n() - ep3Var2.g();
                        break;
                    }
                    i3++;
                } else {
                    y = y(list);
                    break;
                }
            }
        }
        long x = x();
        int i4 = this.t;
        if (i4 == 0) {
            this.t = 1;
            this.s = w(elapsedRealtime, x);
            return;
        }
        int i5 = this.s;
        if (!list.isEmpty()) {
            ea2 ea2Var = ((rl2) bx7.z(list)).d;
            while (i2 < this.b) {
                if (this.d[i2] == ea2Var) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            i4 = ((rl2) bx7.z(list)).e;
            i5 = i2;
        }
        int w = w(elapsedRealtime, x);
        if (w != i5 && !a(i5, elapsedRealtime)) {
            long j5 = this.i;
            if (j3 != -9223372036854775807L) {
                if (y != -9223372036854775807L) {
                    j4 = j3 - y;
                } else {
                    j4 = j3;
                }
                j5 = Math.min(((float) j4) * this.o, j5);
            }
            if ((w < i5 && j2 < j5) || (w > i5 && j2 >= this.j)) {
                w = i5;
            }
        }
        if (w != i5) {
            i4 = 3;
        }
        this.t = i4;
        this.s = w;
    }

    @Override // defpackage.jz1
    public final int d() {
        return this.s;
    }

    @Override // defpackage.y30, defpackage.jz1
    public final void i() {
        this.u = -9223372036854775807L;
        this.v = null;
    }

    @Override // defpackage.y30, defpackage.jz1
    public final int k(long j, List list) {
        rl2 rl2Var;
        int i;
        int i2;
        this.q.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.u;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((rl2) bx7.z(list)).equals(this.v))) {
            return list.size();
        }
        this.u = elapsedRealtime;
        if (list.isEmpty()) {
            rl2Var = null;
        } else {
            rl2Var = (rl2) bx7.z(list);
        }
        this.v = rl2Var;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long H = eq6.H(this.r, ((rl2) list.get(size - 1)).g - j);
        long j3 = this.k;
        if (H >= j3) {
            y(list);
            ea2 ea2Var = this.d[w(elapsedRealtime, x())];
            for (int i3 = 0; i3 < size; i3++) {
                rl2 rl2Var2 = (rl2) list.get(i3);
                ea2 ea2Var2 = rl2Var2.d;
                if (eq6.H(this.r, rl2Var2.g - j) >= j3 && ea2Var2.k < ea2Var.k && (i = ea2Var2.x) != -1 && i <= this.m && (i2 = ea2Var2.w) != -1 && i2 <= this.l && i < ea2Var.x) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.y30, defpackage.jz1
    public final void l() {
        this.v = null;
    }

    @Override // defpackage.jz1
    public final int o() {
        return this.t;
    }

    @Override // defpackage.y30, defpackage.jz1
    public final void q(float f) {
        this.r = f;
    }

    @Override // defpackage.jz1
    public final Object r() {
        return null;
    }

    public final int w(long j, long j2) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (j == Long.MIN_VALUE || !a(i2, j)) {
                if (this.d[i2].k <= j2) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    public final long x() {
        long D = (((float) this.h.D()) * this.n) / this.r;
        nw2 nw2Var = this.p;
        if (nw2Var.isEmpty()) {
            return D;
        }
        int i = 1;
        while (i < nw2Var.size() - 1 && ((o6) nw2Var.get(i)).a < D) {
            i++;
        }
        o6 o6Var = (o6) nw2Var.get(i - 1);
        o6 o6Var2 = (o6) nw2Var.get(i);
        long j = o6Var.a;
        float f = ((float) (D - j)) / ((float) (o6Var2.a - j));
        return o6Var.b + (f * ((float) (o6Var2.b - r1)));
    }
}
