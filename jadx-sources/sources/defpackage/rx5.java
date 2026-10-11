package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class rx5 extends xz0 {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ sx5 D;
    public int E;
    public x42 x;
    public ux5 y;
    public h43 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx5(sx5 sx5Var, vz0 vz0Var) {
        super(vz0Var);
        this.D = sx5Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        this.D.collect(null, this);
        return w11.x;
    }
}
