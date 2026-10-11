package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vg1 implements bh6 {
    public final byte[] a = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    @Override // defpackage.bh6
    public final void b(zi4 zi4Var, int i, int i2) {
        zi4Var.O(i);
    }

    @Override // defpackage.bh6
    public final int c(m41 m41Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = m41Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // defpackage.bh6
    public final void g(ea2 ea2Var) {
    }

    @Override // defpackage.bh6
    public final void a(long j, int i, int i2, int i3, ah6 ah6Var) {
    }
}
