package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vg2 extends xz0 {
    public /* synthetic */ Object x;
    public final /* synthetic */ hh2 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg2(hh2 hh2Var, xz0 xz0Var) {
        super(xz0Var);
        this.y = hh2Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.h(false, this);
    }
}
