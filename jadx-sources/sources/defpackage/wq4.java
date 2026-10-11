package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wq4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public wq4(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wq4) {
                wq4 wq4Var = (wq4) obj;
                if (sw0.o(this.a, wq4Var.a) && this.b == wq4Var.b && xc4.b(this.c, wq4Var.c) && xc4.b(this.d, wq4Var.d) && this.e == wq4Var.e && Float.compare(this.f, wq4Var.f) == 0 && this.g == wq4Var.g && this.h == wq4Var.h && this.i.equals(wq4Var.i) && xc4.b(this.j, wq4Var.j) && Float.compare(this.k, wq4Var.k) == 0 && xc4.b(this.l, wq4Var.l) && xc4.b(this.m, wq4Var.m)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + qx1.d(qx1.b(this.k, qx1.d((this.i.hashCode() + zo5.g(qx1.c(this.g, qx1.b(this.f, zo5.g(qx1.d(qx1.d(qx1.d(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31), 31), 31, this.h)) * 31, this.j, 31), 31), this.l, 31);
    }

    public final String toString() {
        String L = sw0.L(this.a);
        String h = xc4.h(this.c);
        String h2 = xc4.h(this.d);
        String a = cr4.a(this.g);
        String h3 = xc4.h(this.j);
        String h4 = xc4.h(this.l);
        String h5 = xc4.h(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(L);
        sb.append(", uptime=");
        sb.append(this.b);
        qx1.x(sb, ", positionOnScreen=", h, ", position=", h2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(a);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(h3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(h4);
        return qx1.q(sb, ", originalEventPosition=", h5, ")");
    }
}
