package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class w56 extends xz0 {
    public ByteBuffer A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ y56 E;
    public int F;
    public wc0 x;
    public gc4 y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w56(y56 y56Var, xz0 xz0Var) {
        super(xz0Var);
        this.E = y56Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.t(null, this);
    }
}
