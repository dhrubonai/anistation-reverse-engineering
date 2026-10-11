package defpackage;

/* loaded from: classes.dex */
public final class ey6 extends xz0 {
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ hu6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey6(hu6 hu6Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = hu6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
