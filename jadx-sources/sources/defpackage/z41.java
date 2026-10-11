package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z41 extends xz0 {
    public w05 A;
    public p51 B;
    public /* synthetic */ Object C;
    public final /* synthetic */ a51 D;
    public int E;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z41(a51 a51Var, xz0 xz0Var) {
        super(xz0Var);
        this.D = a51Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, this);
    }
}
