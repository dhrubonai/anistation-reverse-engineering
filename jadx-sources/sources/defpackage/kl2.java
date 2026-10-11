package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kl2 implements ep3 {
    public final long A;
    public final long x;
    public long y = -1;
    public final List z;

    public kl2(long j, List list) {
        this.x = list.size() - 1;
        this.A = j;
        this.z = list;
    }

    @Override // defpackage.ep3
    public final long g() {
        long j = this.y;
        if (j >= 0 && j <= this.x) {
            return this.A + ((zl2) this.z.get((int) j)).B;
        }
        qi2.e();
        return 0L;
    }

    @Override // defpackage.ep3
    public final long n() {
        long j = this.y;
        if (j >= 0 && j <= this.x) {
            zl2 zl2Var = (zl2) this.z.get((int) j);
            return this.A + zl2Var.B + zl2Var.z;
        }
        qi2.e();
        return 0L;
    }

    @Override // defpackage.ep3
    public final boolean next() {
        boolean z;
        long j = this.y + 1;
        this.y = j;
        if (j > this.x) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
