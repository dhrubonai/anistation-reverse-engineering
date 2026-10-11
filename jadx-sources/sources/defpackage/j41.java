package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j41 extends xz0 {
    public final /* synthetic */ m18 A;
    public int B;
    public Serializable x;
    public Iterator y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41(m18 m18Var, xz0 xz0Var) {
        super(xz0Var);
        this.A = m18Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.O(null, null, this);
    }
}
