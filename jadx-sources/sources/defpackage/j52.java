package defpackage;

/* loaded from: classes2.dex */
public final class j52 extends xz0 {
    public x42 A;
    public q85 B;
    public int C;
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ k52 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(k52 k52Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = k52Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
