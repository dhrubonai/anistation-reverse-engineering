package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k08 extends v08 {
    public volatile double B;

    @Override // defpackage.v08
    public final /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object c(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object d() {
        return Double.valueOf(this.B);
    }

    @Override // defpackage.v08
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Double) obj).doubleValue();
    }
}
