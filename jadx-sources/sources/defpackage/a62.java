package defpackage;

/* loaded from: classes2.dex */
public final class a62 extends xz0 {
    public Object A;
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ b62 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a62(b62 b62Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = b62Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
