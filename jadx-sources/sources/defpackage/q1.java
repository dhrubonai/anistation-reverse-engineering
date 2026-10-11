package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class q1 extends r1 implements RandomAccess {
    public final r1 x;
    public final int y;
    public final int z;

    public q1(r1 r1Var, int i, int i2) {
        this.x = r1Var;
        this.y = i;
        db.v(i, i2, r1Var.b());
        this.z = i2 - i;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.z;
        if (i >= 0 && i < i2) {
            return this.x.get(this.y + i);
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
        return null;
    }

    @Override // defpackage.r1, java.util.List
    public final List subList(int i, int i2) {
        db.v(i, i2, this.z);
        int i3 = this.y;
        return new q1(this.x, i + i3, i3 + i2);
    }
}
