package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bn implements ym {
    public final tm a;
    public final zx6 b;

    public bn(tm tmVar, zx6 zx6Var) {
        this.a = tmVar;
        this.b = zx6Var;
    }

    public static String a(String str) {
        return b06.G(b06.G(b06.G(b06.G(b06.G(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;"), "'", "&apos;");
    }
}
