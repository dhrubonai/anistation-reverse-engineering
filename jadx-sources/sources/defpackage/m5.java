package defpackage;

import java.nio.channels.Selector;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m5 extends xz0 {
    public final /* synthetic */ p5 A;
    public int B;
    public kk3 x;
    public Selector y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(p5 p5Var, xz0 xz0Var) {
        super(xz0Var);
        this.A = p5Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.I(null, null, this);
    }
}
