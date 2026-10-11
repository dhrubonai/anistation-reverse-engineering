package defpackage;

import java.security.cert.Certificate;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class z46 extends xz0 {
    public cu1 A;
    public byte[] B;
    public /* synthetic */ Object C;
    public final /* synthetic */ g56 D;
    public int E;
    public bf5 x;
    public Certificate y;
    public r18 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z46(g56 g56Var, xz0 xz0Var) {
        super(xz0Var);
        this.D = g56Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, null, null, null, this);
    }
}
