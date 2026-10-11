package defpackage;

/* loaded from: classes.dex */
public final class k62 extends xz0 {
    public Object A;
    public x42 B;
    public int C;
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ ii z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k62(ii iiVar, vz0 vz0Var) {
        super(vz0Var);
        this.z = iiVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
