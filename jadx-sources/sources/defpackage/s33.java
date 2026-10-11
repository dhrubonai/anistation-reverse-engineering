package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s33 extends ci6 {
    public final /* synthetic */ qc2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s33(Iterator it, qc2 qc2Var) {
        super(it);
        this.y = qc2Var;
    }

    @Override // defpackage.ci6
    public final Object a(Object obj) {
        return this.y.apply(obj);
    }
}
