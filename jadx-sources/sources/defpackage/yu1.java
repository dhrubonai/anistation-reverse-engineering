package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yu1 extends x93 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu1(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.y = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.y;
        float f = 1.0f;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                int ordinal = ((tu1) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            j12 j12Var = ((rx1) obj3).a.a;
                            f = j12Var != null ? j12Var.a : ((ln5) obj2).f;
                        } else {
                            ze0.l();
                            return null;
                        }
                    }
                } else {
                    j12 j12Var2 = ((iv1) obj4).a.a;
                    if (j12Var2 != null) {
                        f = j12Var2.a;
                    }
                }
                return Float.valueOf(f);
            case 1:
                int ordinal2 = ((tu1) obj).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            ya5 ya5Var = ((rx1) obj3).a.d;
                            f = ya5Var != null ? ya5Var.a : ((ln5) obj2).g;
                        } else {
                            ze0.l();
                            return null;
                        }
                    }
                } else {
                    ya5 ya5Var2 = ((iv1) obj4).a.d;
                    if (ya5Var2 != null) {
                        f = ya5Var2.a;
                    }
                }
                return Float.valueOf(f);
            default:
                return new dk((zt5) obj4, obj3, (qk) obj2, (byte) 0);
        }
    }
}
