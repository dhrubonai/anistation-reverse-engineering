package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l50 extends q61 {
    public long G;
    public int H;
    public byte I;

    @Override // defpackage.q61
    public final void f() {
        super.f();
        this.H = 0;
    }

    public final boolean l(q61 q61Var) {
        ByteBuffer byteBuffer;
        io3.n(!q61Var.d(1073741824));
        io3.n(!q61Var.d(268435456));
        io3.n(!q61Var.d(4));
        if (m()) {
            if (this.H < this.I) {
                ByteBuffer byteBuffer2 = q61Var.B;
                if (byteBuffer2 != null && (byteBuffer = this.B) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i = this.H;
        this.H = i + 1;
        if (i == 0) {
            this.D = q61Var.D;
            if (q61Var.d(1)) {
                this.y = 1;
            }
        }
        ByteBuffer byteBuffer3 = q61Var.B;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.B.put(byteBuffer3);
        }
        this.G = q61Var.D;
        return true;
    }

    public final boolean m() {
        if (this.H > 0) {
            return true;
        }
        return false;
    }
}
