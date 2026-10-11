package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bm2 extends gm2 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final op1 q;
    public final nw2 r;
    public final nw2 s;
    public final rw2 t;
    public final long u;
    public final am2 v;
    public final nw2 w;
    public final yl2 x;

    public bm2(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, op1 op1Var, List list2, List list3, am2 am2Var, Map map, List list4, yl2 yl2Var) {
        super(str, list, z3);
        long j6;
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = op1Var;
        this.r = nw2.o(list2);
        this.s = nw2.o(list3);
        this.t = rw2.b(map);
        this.w = nw2.o(list4);
        this.x = yl2Var;
        if (!list3.isEmpty()) {
            wl2 wl2Var = (wl2) bx7.z(list3);
            j6 = wl2Var.B + wl2Var.z;
            this.u = j6;
        } else if (!list2.isEmpty()) {
            yl2 yl2Var2 = (yl2) bx7.z(list2);
            j6 = yl2Var2.B + yl2Var2.z;
            this.u = j6;
        } else {
            this.u = 0L;
            j6 = 0;
        }
        long j7 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j7 = Math.min(j6, j);
            } else {
                j7 = Math.max(0L, j6 + j);
            }
        }
        this.e = j7;
        this.f = j >= 0;
        this.v = am2Var;
    }
}
