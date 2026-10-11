package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class d30 {
    public static final b30 c = new d30(-1, false, false);
    public final boolean a;
    public final boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [d30, b30] */
    static {
        new d30(-1, true, false);
        new d30(76, false, true);
        new d30(64, false, true);
    }

    public d30(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z && z2) {
            ze0.k("Failed requirement.");
            throw null;
        }
    }
}
