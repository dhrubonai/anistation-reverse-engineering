package defpackage;

/* loaded from: classes.dex */
public final class o52 extends xz0 {
    public x42 A;
    public Throwable B;
    public int C;
    public int D;
    public long E;
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ g10 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o52(g10 g10Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = g10Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
