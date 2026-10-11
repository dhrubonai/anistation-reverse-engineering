package defpackage;

/* loaded from: classes.dex */
public final class i74 extends xz0 {
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ hn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i74(hn hnVar, vz0 vz0Var) {
        super(vz0Var);
        this.z = hnVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
