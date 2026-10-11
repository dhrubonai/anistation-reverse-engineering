package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z91 implements o54 {
    public static final String y = fb2.x;
    public final mx2 x;

    public z91(mx2 mx2Var) {
        this.x = mx2Var;
    }

    @Override // defpackage.o54
    public final void N(ey3 ey3Var) {
        this.x.N(ey3Var);
    }

    @Override // defpackage.o54
    public final void W(int i, ByteBuffer byteBuffer, ra0 ra0Var) {
        this.x.W(i, byteBuffer, ra0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    @Override // defpackage.o54
    public final int n0(ea2 ea2Var) {
        return this.x.n0(ea2Var);
    }
}
