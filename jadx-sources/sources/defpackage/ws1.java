package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ws1 implements vs1 {
    public final int x;
    public int y = -1;
    public int z = -1;

    public ws1(int i) {
        this.x = i;
    }

    @Override // defpackage.vs1
    public final boolean c(CharSequence charSequence, int i, int i2, gl6 gl6Var) {
        int i3 = this.x;
        if (i <= i3 && i3 < i2) {
            this.y = i;
            this.z = i2;
            return false;
        }
        if (i2 > i3) {
            return false;
        }
        return true;
    }

    @Override // defpackage.vs1
    public final Object b() {
        return this;
    }
}
