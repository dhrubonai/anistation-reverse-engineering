package defpackage;

/* loaded from: classes2.dex */
public final class n93 extends xz0 {
    public Object A;
    public int B;
    public int C;
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ o93 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n93(o93 o93Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = o93Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
