package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mw2 extends r1 {
    public final n2 x;
    public final int y;
    public final int z;

    public mw2(n2 n2Var, int i, int i2) {
        this.x = n2Var;
        this.y = i;
        n77.x(i, i2, n2Var.b());
        this.z = i2 - i;
    }

    @Override // defpackage.m0
    public final int b() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        n77.v(i, this.z);
        return this.x.get(this.y + i);
    }

    @Override // defpackage.r1, java.util.List
    public final List subList(int i, int i2) {
        n77.x(i, i2, this.z);
        int i3 = this.y;
        return new mw2(this.x, i + i3, i3 + i2);
    }
}
