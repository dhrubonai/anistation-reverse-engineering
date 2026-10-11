package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class df3 implements n95, j95 {
    public final o95 x;
    public final j95 y;
    public final q44 z;

    public df3(n95 n95Var, Map map, j95 j95Var) {
        lz0 lz0Var = new lz0(n95Var, (byte) 26);
        tq1 tq1Var = p95.a;
        this.x = new o95(map, lz0Var);
        this.y = j95Var;
        q44 q44Var = db5.a;
        this.z = new q44();
    }

    @Override // defpackage.n95
    public final m95 a(String str, sb2 sb2Var) {
        return this.x.a(str, sb2Var);
    }

    @Override // defpackage.n95
    public final boolean b(Object obj) {
        return this.x.b(obj);
    }

    @Override // defpackage.n95
    public final Map c() {
        q44 q44Var = this.z;
        Object[] objArr = q44Var.b;
        long[] jArr = q44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.y.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.x.c();
    }

    @Override // defpackage.n95
    public final Object d(String str) {
        return this.x.d(str);
    }

    @Override // defpackage.j95
    public final void e(Object obj, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        kd2Var.f0(-858296452);
        if ((i & 6) == 0) {
            if (kd2Var.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            this.y.e(obj, os0Var, kd2Var, i2 & 126);
            boolean h = kd2Var.h(this) | kd2Var.h(obj);
            Object Q = kd2Var.Q();
            if (h || Q == au0.a) {
                Q = new r82(this, obj, (byte) 6);
                kd2Var.n0(Q);
            }
            db.c(obj, (ub2) Q, kd2Var);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je((byte) 9, i, (Object) this, obj, (Object) os0Var);
        }
    }

    @Override // defpackage.j95
    public final void f(Object obj) {
        this.y.f(obj);
    }
}
