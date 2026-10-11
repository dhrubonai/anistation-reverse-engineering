package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pv4 implements iw3 {
    public final o41 a;
    public final xv3 b;
    public st3 c;
    public final q18 d;
    public final int e;

    public pv4(o41 o41Var, e12 e12Var) {
        xv3 xv3Var = new xv3(e12Var, (byte) 4);
        st3 st3Var = new st3((byte) 13);
        q18 q18Var = new q18((byte) 13);
        this.a = o41Var;
        this.b = xv3Var;
        this.c = st3Var;
        this.d = q18Var;
        this.e = 1048576;
    }

    @Override // defpackage.iw3
    public final iw3 d(st3 st3Var) {
        io3.w(st3Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = st3Var;
        return this;
    }

    @Override // defpackage.iw3
    public final lw3 e(ar3 ar3Var) {
        ar3Var.b.getClass();
        return new qv4(ar3Var, this.a, this.b, this.c.o(ar3Var), this.d, this.e, null);
    }
}
