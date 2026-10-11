package defpackage;

import java.nio.channels.Selector;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class o5 extends xz0 {
    public int A;
    public Selector x;
    public /* synthetic */ Object y;
    public final /* synthetic */ p5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(p5 p5Var, xz0 xz0Var) {
        super(xz0Var);
        this.z = p5Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.l0(null, this);
    }
}
