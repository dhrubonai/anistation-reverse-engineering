package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y77 {
    public final String a;
    public final j77 b;
    public final e41 c;
    public final long d;
    public final long e;
    public final long f;
    public final qx0 g;
    public final int h;
    public final c00 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final String q;
    public final List r;

    public y77(String str, j77 j77Var, e41 e41Var, long j, long j2, long j3, qx0 qx0Var, int i, c00 c00Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, String str2, List list2) {
        str.getClass();
        e41Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = j77Var;
        this.c = e41Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = qx0Var;
        this.h = i;
        this.i = c00Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = str2;
        this.r = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y77) {
                y77 y77Var = (y77) obj;
                if (!a34.i(this.a, y77Var.a) || this.b != y77Var.b || !a34.i(this.c, y77Var.c) || this.d != y77Var.d || this.e != y77Var.e || this.f != y77Var.f || !this.g.equals(y77Var.g) || this.h != y77Var.h || this.i != y77Var.i || this.j != y77Var.j || this.k != y77Var.k || this.l != y77Var.l || this.m != y77Var.m || this.n != y77Var.n || this.o != y77Var.o || !this.p.equals(y77Var.p) || !a34.i(this.q, y77Var.q) || !this.r.equals(y77Var.r)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.r.hashCode() + zo5.i(this.q, zo5.j(this.p, qx1.c(this.o, qx1.d(qx1.c(this.m, qx1.c(this.l, qx1.d(qx1.d((this.i.hashCode() + qx1.c(this.h, (this.g.hashCode() + qx1.d(qx1.d(qx1.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31), this.e, 31), this.f, 31)) * 31, 31)) * 31, this.j, 31), this.k, 31), 31), 31), this.n, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", output=");
        sb.append(this.c);
        sb.append(", initialDelay=");
        sb.append(this.d);
        qx1.w(sb, ", intervalDuration=", this.e, ", flexDuration=");
        sb.append(this.f);
        sb.append(", constraints=");
        sb.append(this.g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        sb.append(this.i);
        qx1.w(sb, ", backoffDelayDuration=", this.j, ", lastEnqueueTime=");
        sb.append(this.k);
        sb.append(", periodCount=");
        sb.append(this.l);
        sb.append(", generation=");
        sb.append(this.m);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.n);
        sb.append(", stopReason=");
        sb.append(this.o);
        sb.append(", tags=");
        sb.append(this.p);
        sb.append(", workerClassName=");
        sb.append(this.q);
        sb.append(", progress=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
