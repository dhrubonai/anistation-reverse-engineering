package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class p93 extends xz0 {
    public ae0 A;
    public d53 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ q93 D;
    public int E;
    public w42 x;
    public x73 y;
    public Charset z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p93(q93 q93Var, xz0 xz0Var) {
        super(xz0Var);
        this.D = q93Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(null, null, null, null, this);
    }
}
