package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i08 extends v08 {
    public volatile boolean B;
    public final boolean C;

    public i08(String str, yh2 yh2Var, boolean z) {
        super(str, yh2Var);
        this.C = z;
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.C);
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.B);
    }

    @Override // defpackage.v08
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Boolean) obj).booleanValue();
    }
}
