package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ab1 implements jb1 {
    public final /* synthetic */ hb1 x;

    public /* synthetic */ ab1(hb1 hb1Var) {
        this.x = hb1Var;
    }

    @Override // defpackage.jb1
    public o15 a(int i, yg6 yg6Var, int[] iArr) {
        jw2 k = nw2.k();
        for (int i2 = 0; i2 < yg6Var.a; i2++) {
            k.c(new eb1(i, yg6Var, i2, this.x, iArr[i2]));
        }
        return k.g();
    }
}
