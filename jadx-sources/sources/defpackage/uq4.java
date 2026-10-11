package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uq4 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public uq4 q;

    public uq4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        uq4 uq4Var = this.q;
        if (uq4Var == null) {
            this.o = true;
            this.p = true;
        } else if (uq4Var != null) {
            uq4Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return nt1.x;
        }
        return arrayList;
    }

    public final boolean c() {
        uq4 uq4Var = this.q;
        if (uq4Var != null) {
            return uq4Var.c();
        }
        if (!this.o && !this.p) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String L = sw0.L(this.a);
        String h = xc4.h(this.c);
        String h2 = xc4.h(this.g);
        boolean c = c();
        String a = cr4.a(this.i);
        List b = b();
        String h3 = xc4.h(this.j);
        String h4 = xc4.h(this.l);
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append(L);
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(h);
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append(h2);
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(c);
        sb.append(", type=");
        sb.append(a);
        sb.append(", historical=");
        sb.append(b);
        sb.append(", scrollDelta=");
        sb.append(h3);
        sb.append(", scaleFactor=");
        sb.append(this.k);
        return qx1.q(sb, ", panOffset=", h4, ")");
    }

    public uq4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
