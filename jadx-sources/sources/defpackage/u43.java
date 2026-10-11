package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class u43 {
    public static final ni1 a = new ni1("COMPLETING_ALREADY", (byte) 2);
    public static final ni1 b = new ni1("COMPLETING_WAITING_CHILDREN", (byte) 2);
    public static final ni1 c = new ni1("COMPLETING_RETRY", (byte) 2);
    public static final ni1 d = new ni1("TOO_LATE_TO_CANCEL", (byte) 2);
    public static final ni1 e = new ni1("SEALED", (byte) 2);
    public static final et1 f = new et1(false);
    public static final et1 g = new et1(true);

    public static final Object a(Object obj) {
        px2 px2Var;
        if (obj instanceof px2) {
            px2Var = (px2) obj;
        } else {
            px2Var = null;
        }
        if (px2Var != null) {
            return px2Var.a;
        }
        return obj;
    }
}
