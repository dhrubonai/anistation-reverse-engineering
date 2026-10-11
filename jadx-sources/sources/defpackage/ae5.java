package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ae5 extends xz0 {
    public /* synthetic */ Object x;
    public final /* synthetic */ ee5 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae5(ee5 ee5Var, xz0 xz0Var) {
        super(xz0Var);
        this.y = ee5Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(this);
    }
}
