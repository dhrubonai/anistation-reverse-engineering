package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u15 extends xw2 {
    public static final u15 E;
    public final transient zb4 B;
    public final transient int C;
    public transient ww2 D;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zb4] */
    static {
        ?? obj = new Object();
        obj.d(3);
        E = new u15(obj);
    }

    public u15(zb4 zb4Var) {
        this.B = zb4Var;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = zb4Var.c;
            if (i < i2) {
                io3.r(i, i2);
                j += zb4Var.b[i];
                i++;
            } else {
                this.C = jf7.G(j);
                return;
            }
        }
    }

    @Override // defpackage.gw2
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.xw2
    public final zw2 j() {
        ww2 ww2Var = this.D;
        if (ww2Var == null) {
            ww2 ww2Var2 = new ww2(this, (byte) 1);
            this.D = ww2Var2;
            return ww2Var2;
        }
        return ww2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.C;
    }
}
