package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class al1 extends xz0 {
    public Iterator A;
    public String B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ fl1 F;
    public int G;
    public String x;
    public String y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al1(fl1 fl1Var, xz0 xz0Var) {
        super(xz0Var);
        this.F = fl1Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(null, 0, 0, null, null, this);
    }
}
