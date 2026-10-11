package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class j33 extends k43 {
    public static final /* synthetic */ long C = qs.a.objectFieldOffset(j33.class.getDeclaredField("_invoked$volatile"));
    public final ub2 B;
    private volatile /* synthetic */ int _invoked$volatile;

    public j33(ub2 ub2Var) {
        this.B = ub2Var;
    }

    @Override // defpackage.k43
    public final boolean j() {
        return true;
    }

    @Override // defpackage.k43
    public final void k(Throwable th) {
        if (qs.a.compareAndSwapInt(this, C, 0, 1)) {
            this.B.invoke(th);
        }
    }
}
