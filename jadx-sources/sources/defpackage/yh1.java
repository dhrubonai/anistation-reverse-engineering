package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yh1 extends xz3 implements zo1 {
    public od3 L;

    @Override // defpackage.xz3
    public final void S0() {
        this.L.j = this;
    }

    @Override // defpackage.xz3
    public final void T0() {
        od3 od3Var = this.L;
        od3Var.e();
        od3Var.b = null;
        od3Var.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yh1) && a34.i(this.L, ((yh1) obj).L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.L + ")";
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        xg0 xg0Var = bb3Var.x;
        ArrayList arrayList = this.L.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kd3 kd3Var = (kd3) arrayList.get(i);
            di2 di2Var = kd3Var.m;
            if (di2Var != null) {
                long j = kd3Var.k;
                long j2 = di2Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((af2) xg0Var.y.y).s(f, f2);
                try {
                    db.O(bb3Var, di2Var);
                } finally {
                    ((af2) xg0Var.y.y).s(-f, -f2);
                }
            }
        }
        bb3Var.a();
    }
}
