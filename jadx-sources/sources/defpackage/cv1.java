package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cv1 extends x93 implements ub2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ ub2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv1(ub2 ub2Var, byte b) {
        super(1);
        this.y = b;
        this.z = ub2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.y;
        ub2 ub2Var = this.z;
        switch (b) {
            case 0:
                return new k13((((Number) ub2Var.invoke(Integer.valueOf((int) (r4 & 4294967295L)))).intValue() & 4294967295L) | (((int) (((k13) obj).a >> 32)) << 32));
            case 1:
                return new k13((((Number) ub2Var.invoke(Integer.valueOf((int) (r4 & 4294967295L)))).intValue() & 4294967295L) | (((int) (((k13) obj).a >> 32)) << 32));
            case 2:
                return new c13(((Number) ub2Var.invoke(Integer.valueOf((int) (((k13) obj).a & 4294967295L)))).intValue() & 4294967295L);
            default:
                return new c13(((Number) ub2Var.invoke(Integer.valueOf((int) (((k13) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }
}
