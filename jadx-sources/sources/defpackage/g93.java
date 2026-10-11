package defpackage;

/* loaded from: classes2.dex */
public final class g93 extends xz0 {
    public int A;
    public final /* synthetic */ h93 B;
    public /* synthetic */ Object x;
    public int y;
    public x42 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g93(h93 h93Var, vz0 vz0Var) {
        super(vz0Var);
        this.B = h93Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.B.emit(null, this);
    }
}
