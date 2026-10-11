package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gn2 implements ub2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ List B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ gn2(int i, int i2, ub2 ub2Var, List list, byte b) {
        this.x = b;
        this.y = i;
        this.z = i2;
        this.A = ub2Var;
        this.B = list;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.z;
        int i2 = this.y;
        List list = this.B;
        ub2 ub2Var = this.A;
        switch (b) {
            case 0:
                kn2.c(ub2Var, list, ((Number) obj).intValue(), i2 + i);
                return pn6Var;
            default:
                kn2.c(ub2Var, list, ((Number) obj).intValue(), (i2 * 2) + i);
                return pn6Var;
        }
    }
}
