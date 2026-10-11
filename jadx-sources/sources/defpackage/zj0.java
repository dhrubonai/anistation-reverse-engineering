package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zj0 extends f30 {
    public final SparseArray i = new SparseArray();

    @Override // defpackage.f30
    public final vv a(vv vvVar) {
        boolean m = zz.m(vvVar);
        int i = vvVar.b;
        if (m) {
            ak0 ak0Var = (ak0) this.i.get(i);
            if (ak0Var != null) {
                if (ak0Var.e) {
                    return vv.e;
                }
                return new vv(vvVar.a, ak0Var.b, vvVar.c);
            }
            throw new yv(qx1.i(i, "No mixing matrix set for input channel count=", ". Please call putChannelMixingMatrix() with the appropriate matrix."), vvVar);
        }
        throw new yv(vvVar);
    }

    @Override // defpackage.zv
    public final void g(ByteBuffer byteBuffer) {
        ak0 ak0Var = (ak0) this.i.get(this.b.b);
        ak0Var.getClass();
        int remaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer l = l(this.c.d * remaining);
        zz.Q(byteBuffer, this.b, l, this.c, ak0Var, remaining, false);
        l.flip();
    }
}
