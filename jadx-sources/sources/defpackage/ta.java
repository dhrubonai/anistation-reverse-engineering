package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ta extends xz0 {
    public final /* synthetic */ va A;
    public int B;
    public t34 x;
    public ua0 y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(va vaVar, xz0 xz0Var) {
        super(xz0Var);
        this.A = vaVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.g(this);
    }
}
