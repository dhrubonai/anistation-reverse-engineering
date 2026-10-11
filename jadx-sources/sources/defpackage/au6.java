package defpackage;

/* loaded from: classes.dex */
public final class au6 extends xz0 {
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ yt6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au6(yt6 yt6Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = yt6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
