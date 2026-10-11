package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wx2 extends nw2 {
    public final /* synthetic */ ww2 z;

    public wx2(ww2 ww2Var) {
        this.z = ww2Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ww2 ww2Var = this.z;
        switch (ww2Var.A) {
            case 0:
                zb4 zb4Var = ((u15) ww2Var.B).B;
                io3.r(i, zb4Var.c);
                return new yb4(zb4Var, i);
            default:
                zb4 zb4Var2 = ((u15) ww2Var.B).B;
                io3.r(i, zb4Var2.c);
                return zb4Var2.a[i];
        }
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return this.z.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z.size();
    }
}
