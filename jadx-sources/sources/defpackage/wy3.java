package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wy3 extends xz3 implements wu0, ra3 {
    public LinkedHashMap L;

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        boolean z;
        int i;
        float f = ((vm1) t80.C(this, q13.c)).x;
        if (f < 0.0f) {
            f = 0.0f;
        }
        em4 p = ro3Var.p(j);
        int i2 = 0;
        if (this.K && !Float.isNaN(f) && vm1.b(f, 0.0f) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!Float.isNaN(f)) {
            i = xo3Var.x0(f);
        } else {
            i = 0;
        }
        int i3 = p.x;
        if (z) {
            i3 = Math.max(i3, i);
        }
        int i4 = p.y;
        if (z) {
            i4 = Math.max(i4, i);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.L;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.L = linkedHashMap;
            }
            es6 es6Var = q13.b;
            int round = Math.round((i - p.x) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(es6Var, Integer.valueOf(round));
            vn2 vn2Var = q13.a;
            int round2 = Math.round((i - p.y) / 2.0f);
            if (round2 >= 0) {
                i2 = round2;
            }
            linkedHashMap.put(vn2Var, Integer.valueOf(i2));
        }
        Map map = this.L;
        if (map == null) {
            map = ot1.x;
        }
        return xo3Var.L(i3, i4, map, new e03(i3, p, i4));
    }
}
