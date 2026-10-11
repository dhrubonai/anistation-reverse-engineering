package defpackage;

/* loaded from: classes.dex */
public final class c20 extends xz0 {
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ in z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(in inVar, vz0 vz0Var) {
        super(vz0Var);
        this.z = inVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
