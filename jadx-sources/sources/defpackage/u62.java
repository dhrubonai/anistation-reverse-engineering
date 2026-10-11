package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u62 extends xz0 {
    public final /* synthetic */ v62 A;
    public /* synthetic */ Object x;
    public int y;
    public x42 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u62(v62 v62Var, vz0 vz0Var) {
        super(vz0Var);
        this.A = v62Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.A.emit(null, this);
    }
}
