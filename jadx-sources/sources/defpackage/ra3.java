package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface ra3 extends yc1 {
    default int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        return e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, ia4.y, ja4.y, (byte) 2), sx0.b(0, i, 0, 0, 13)).getHeight();
    }

    wo3 e(xo3 xo3Var, ro3 ro3Var, long j);

    default int j(yl3 yl3Var, ro3 ro3Var, int i) {
        return e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, ia4.y, ja4.x, (byte) 2), sx0.b(0, 0, 0, i, 7)).getWidth();
    }

    default int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        return e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, ia4.x, ja4.y, (byte) 2), sx0.b(0, i, 0, 0, 13)).getHeight();
    }

    default int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        return e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, ia4.x, ja4.x, (byte) 2), sx0.b(0, 0, 0, i, 7)).getWidth();
    }
}
