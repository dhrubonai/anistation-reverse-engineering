package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ck extends x93 implements ic2 {
    public final /* synthetic */ rx1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(rx1 rx1Var) {
        super(2);
        this.y = rx1Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        tu1 tu1Var = (tu1) obj;
        tu1 tu1Var2 = (tu1) obj2;
        tu1 tu1Var3 = tu1.z;
        if (tu1Var == tu1Var3 && tu1Var2 == tu1Var3 && !this.y.a.e) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
