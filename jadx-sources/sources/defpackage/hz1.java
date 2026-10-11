package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hz1 {
    public final yg6 a;
    public final int[] b;

    public hz1(yg6 yg6Var, int... iArr) {
        if (iArr.length == 0) {
            kb0.t("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = yg6Var;
        this.b = iArr;
    }
}
