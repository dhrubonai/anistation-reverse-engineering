package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hn2 implements ub2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ List z;

    public hn2(int i, List list, ub2 ub2Var) {
        this.x = i;
        this.y = ub2Var;
        this.z = list;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        kn2.c(this.y, this.z, intValue, this.x);
        return pn6.a;
    }
}
