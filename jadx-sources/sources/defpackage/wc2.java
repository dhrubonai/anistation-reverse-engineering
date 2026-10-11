package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface wc2 extends w42 {
    static /* synthetic */ w42 c(wc2 wc2Var, l11 l11Var, int i, ta0 ta0Var, int i2) {
        if ((i2 & 1) != 0) {
            l11Var = it1.x;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            ta0Var = ta0.x;
        }
        return wc2Var.a(l11Var, i, ta0Var);
    }

    w42 a(l11 l11Var, int i, ta0 ta0Var);
}
