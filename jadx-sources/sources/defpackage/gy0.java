package defpackage;

/* loaded from: classes.dex */
public final class gy0 extends xz0 {
    public int A;
    public final /* synthetic */ vj0 B;
    public /* synthetic */ Object x;
    public int y;
    public x42 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy0(vj0 vj0Var, vz0 vz0Var) {
        super(vz0Var);
        this.B = vj0Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.B.emit(null, this);
    }
}
