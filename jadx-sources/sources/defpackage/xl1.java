package defpackage;

/* loaded from: classes2.dex */
public final class xl1 extends xz0 {
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ mx0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl1(mx0 mx0Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = mx0Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
