package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class bv1 extends x93 implements ub2 {
    public final /* synthetic */ boolean y;
    public final /* synthetic */ sb2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv1(boolean z, sb2 sb2Var) {
        super(1);
        this.y = z;
        this.z = sb2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        boolean z;
        p55 p55Var = (p55) obj;
        if (!this.y && ((Boolean) this.z.invoke()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        p55Var.e(z);
        return pn6.a;
    }
}
